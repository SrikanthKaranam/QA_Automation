package com.shotang.test.init;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

public class SetupBase {

	public static int DEFAULT_TIMEOUT = 60;
	public WebDriver driver;
	public WebDriverWait driverWaitDefault;
	private String gridHost;
	private String testBaseUrlHost = null;
	protected String testBaseUrl = null;
	protected static String browsername = null;
	public static String target = null;

	public void setDefaultTimeout(int timeOut) {
		if (timeOut > 2 && timeOut <= 240000) {
			// time out can be between 2 sec and 8 mins.
			DEFAULT_TIMEOUT = timeOut;
		}
	}

	public SetupBase() throws Exception {
		SetupBase.class.getName();
	}

	public void environmentSetUp() throws Exception {
		baseEnvSetup();
	}

	public void baseEnvSetup() throws Exception {
		// Base url and host
		target = System.getenv("TEST_TARGET");
		System.out.println("[Env Variable] TEST_TARGET - " + target);
		if (target == null) {
			target = new String("test2");
			System.out.println("setting target to:[ " + target + " ]");
			testBaseUrlHost = target + ".shotang.com";
		} else if (target.equalsIgnoreCase("PRODUCTION")) {
			testBaseUrlHost = "www.shotang.com";
		} else {
			testBaseUrlHost = target + ".shotang.com";
		}
		testBaseUrl = "http://".concat(testBaseUrlHost);
		System.out.println("Test base url host: " + testBaseUrlHost);
		System.out.println("Test base url: " + testBaseUrl);

		// set local or remote webdriver using TEST_GRID env variable
		String os = System.getProperty("os.name").toLowerCase();
		String platform = System.getenv("TEST_PLATFORM");
		System.out.println("[Env Variable] TEST_PLATFORM - " + platform);
		System.out.println("os=" + os);

		if (platform == null) {
			driver = setLocalOrRemoteWebDriver();
		} else if (platform.equalsIgnoreCase("MOBILE")) {
			System.out.println("[Env Variable] TEST_PLATFORM - " + platform);
		} else if (platform.equalsIgnoreCase("ANY")
				|| platform.equalsIgnoreCase("WINDOWS")
				|| platform.equalsIgnoreCase("UNIX")) {
			driver = setLocalOrRemoteWebDriver();
		} else {
			driver = setLocalOrRemoteWebDriver();
		}
		if (driver == null) {
			System.out.println("Driver is null after setting it..");
		}
	}

	/**
	 * @author Srikanth Karanam
	 * 
	 *         The Method is used to Navigate back to Landing Page
	 **/
	protected void navigateToLandingPage() {
		driver.navigate().to(getTestBaseUrl() + "/");
		System.out.println("\n Environment SetUp done Successfully - url: "
				+ driver.getCurrentUrl() + " title: " + driver.getTitle()
				+ "\n");
	}

	public String getTestBaseUrl() {
		if (testBaseUrl == null) {
			System.out.println("Error: testBaseUrl is null");
		}
		return testBaseUrl;
	}

	protected String testBaseUrl() {
		if (testBaseUrlHost == null) {
			System.out.println("Error: testBaseUrlHost is null");
		}
		return testBaseUrlHost;
	}

	private WebDriver setLocalOrRemoteWebDriver() throws Exception {
		WebDriver newDriver = null;
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		String browser = System.getenv("TEST_BROWSER");
		System.out.println("[Env Variable] TEST_BROWSER - " + browser);
		String driverPath = System.getenv("DRIVER_PATH");
		System.out.println("[Env Variable] DRIVER_PATH - " + driverPath);
		System.out
				.println("[DRIVER_PATH should be full driver path. It may be needed for "
						+ "running CHrome/IE test locally]");

		// Set capability
		if (browser == null || browser.equalsIgnoreCase("FIREFOX")) {
			System.out.println("Setting capability: firefox");
			browsername = "firefox";
		} else if ("CHROME".equals(browser)) {
			// Adding test-type to avoid the message
			capability = DesiredCapabilities.chrome();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("test-type");
			options.addArguments(Arrays.asList(
					"allow-running-insecure-content",
					"ignore-certificate-errors"));
			capability.setCapability(ChromeOptions.CAPABILITY, options);
			System.out.println("Setting capability: Chrome Browser");
			browsername = "chrome";
		} else if ("INTERNET EXPLORER".equals(browser)) {
			capability = DesiredCapabilities.internetExplorer();
			capability.setCapability(CapabilityType.PLATFORM, "ANY");
			capability.setCapability(
					CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION,
					true);
			capability.setCapability(
					InternetExplorerDriver.BROWSER_ATTACH_TIMEOUT, 60000);
			capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			System.out.println("Setting capability: internetExplorer");
		} else if ("html".equalsIgnoreCase(browser)) {
			capability = DesiredCapabilities.htmlUnit();
			capability
					.setBrowserName("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/24.0");
			capability.setVersion("24.0");
		} else {
			throw new Exception("Required browser [" + browser
					+ "] currently not supported");
		}
		// set driver
		String hubUrl = null;
		if (gridHost == null) {
			System.out.println("===== " + getClass().getName()
					+ " : Creating local driver");
			if ("CHROME".equalsIgnoreCase(browser)) {
				System.out.println("Using Chrome driverPath: " + driverPath);
				System.setProperty("webdriver.chrome.driver", driverPath);
				newDriver = new ChromeDriver(capability);
				// newDriver.manage().timeouts().implicitlyWait(100,
				// TimeUnit.SECONDS);
			} else if ("INTERNET EXPLORER".equalsIgnoreCase(browser)) {
				System.out.println("Using IE driverPath: " + driverPath);
				System.setProperty("webdriver.ie.driver", driverPath);
				newDriver = new InternetExplorerDriver(capability);
			} else if ("html".equalsIgnoreCase(browser)) {
				System.out.println("Setting HTML UNIT Driver---");
				newDriver = new HtmlUnitDriver(capability);
			} else {
				newDriver = new FirefoxDriver();
			}
		} else {
			System.out.println("===== " + getClass().getName()
					+ " : Creating remote driver");
			hubUrl = "http://" + gridHost + ":4444/wd/hub";
			// Adding try Catch here to Avoid Null pointer Exception
			try {
				newDriver = new RemoteWebDriver(new URL(hubUrl), capability);
			} catch (WebDriverException wde) {
				System.out
						.println("Error : Exception is Caught and Setting newDriver Again .precisely Null pointer");
				newDriver = new RemoteWebDriver(new URL(hubUrl), capability);
			}
		}
		return newDriver;
	}

	/**
	 * @author Srikanth Karanam
	 * 
	 *         This Method is Used to Take Screenshoot for failed tets cases
	 */
	public void TakeScreenshoot(ITestResult result, WebDriver driver)
			throws IOException {

		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		String DateTime = dateFormat.format(date);
		String name = result.getName() + DateTime;
		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		if (!result.isSuccess()) {
			FileUtils.copyFile(scrFile, new File("FailedTestsScreenshots/"
					+ name + ".png"));
			System.out.println("Failed screenshot created");
		}
	}

	/**
	 * @author Srikanth Karanam
	 * 
	 *         This Method is Used to get all the Active Windows Handlers and
	 *         Store into a Set Iterate over it and Softly Close all Active
	 *         Session.
	 */
	public void handleAfterClassCleanup() {
		System.out.println("========== " + getClass().getName()
				+ " : In handleAfterClassCleanup");
		Set<String> allActiveWindowsHandlers = driver.getWindowHandles();
		for (String currentWindowHandle : allActiveWindowsHandlers) {
			driver.switchTo().window(currentWindowHandle);
			driver.close();
		}
	}
}