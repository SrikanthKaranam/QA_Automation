package com.shotang.common;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.shotang.test.init.SetupBase;
import com.thoughtworks.selenium.webdriven.JavascriptLibrary;

public class Common extends SetupBase {

	public Common() throws Exception {
		super();
	}

	/**
	 * @author Srikanth Karanam
	 * 
	 *         This method is used for scrolling till the element is visible
	 * @param driver
	 * @param locator
	 */
	public static void scrollTillVisibilityOfAnElement(By locator,
			WebDriver driver) {
		waitForPresenceOfElement(locator, driver);
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView();", driver.findElement(locator));
	}

	/**
	 * @author Srikanth Karanam
	 * 
	 *         This method is used for waiting till the element is Present using
	 *         Webdriver wait
	 * 
	 * @param locator
	 *            : holds the locator to be found.
	 * @param driver
	 *            : holds the driver reference.
	 */
	public static WebElement waitForPresenceOfElement(By locator,
			WebDriver driver) {
		try {
			new WebDriverWait(driver, SetupBase.DEFAULT_TIMEOUT)
					.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (NoSuchElementException e) {
			nosuchElementException(locator.toString(), driver);
		} catch (TimeoutException e) {
			timeOutException(locator.toString(), driver);
		}
		return driver.findElement(locator);
	}

	/**
	 * @author Srikanth Karanam
	 * 
	 *         This method is used for waiting till the element is Visible using
	 *         Webdriver wait
	 * 
	 * @param locator
	 *            : holds the locator to be found.
	 * @param driver
	 *            : holds the driver reference.
	 */
	public static WebElement waitForVisibilityOfElement(By locator,
			WebDriver driver) {
		try {
			new WebDriverWait(driver, SetupBase.DEFAULT_TIMEOUT)
					.until(ExpectedConditions
							.visibilityOfElementLocated(locator));
		} catch (NoSuchElementException e) {
			nosuchElementException(locator.toString(), driver);
		} catch (TimeoutException e) {
			timeOutException(locator.toString(), driver);
		}
		return driver.findElement(locator);
	}

	/**
	 * @author Srikanth Karanam
	 * 
	 *         This method is used for waiting for given time.
	 */
	public static void waitForTime(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @author Srikanth Karanam
	 * 
	 *         This method is used for handling of maximum time out exception
	 */
	public static void timeOutException(String locator, WebDriver driver) {
		Assert.fail("Maximum Time waited for [" + locator
				+ "] But Not Found in url " + driver.getCurrentUrl());
	}

	/**
	 * @author Srikanth Karanam
	 * 
	 *         This method is used for handling no such element exception
	 */
	public static void nosuchElementException(String locator, WebDriver driver) {
		Assert.fail("Element [" + locator + "] is not found at url : "
				+ driver.getCurrentUrl());
	}

	/**
	 * @author Srikanth Karanam
	 * 
	 *         This method is Used to Get Text from a locator and then apply
	 *         Assert equals Condition
	 */
	public static WebElement assertTextUsingEquals(By locator,
			String expectedText, WebDriver driver) {
		String actualText = null;
		WebElement element = null;
		try {
			waitForVisibilityOfElement(locator, driver);
			element = waitForPresenceOfElement(locator, driver);
			actualText = waitForPresenceOfElement(locator, driver).getText();
			Assert.assertEquals(actualText, expectedText,
					"At Url " + driver.getCurrentUrl());
		} catch (NoSuchElementException e) {
			nosuchElementException(locator.toString(), driver);
		} catch (TimeoutException e) {
			timeOutException(locator.toString(), driver);
		}
		return element;
	}

	/**
	 * @author Srikanth Karanam
	 * 
	 *         This method is used to navigate to back
	 */
	public static void back(WebDriver driver) {
		driver.navigate().back();
	}

	/**
	 * @author Srikanth Karanam
	 * 
	 *         This method is used for click on button, Radio buttons, Links by
	 *         passing locator to it
	 */
	public static void click(By locator, WebDriver driver) {
		waitForPresenceOfElement(locator, driver);
		waitForClickable(locator, driver);
		try {
			driver.findElement(locator).click();
		} catch (NoSuchElementException e) {
			nosuchElementException(locator.toString(), driver);
		} catch (TimeoutException e) {
			timeOutException(locator.toString(), driver);
		} catch (WebDriverException e) {
			Common.waitForTime(500);
			clickUsingJS(locator, driver);
		}
	}

	/**
	 * @author Srikanth Karanam
	 * 
	 *         This method is used for waiting until the element is clickable
	 *         using Webdriver wait
	 */
	public static void waitForClickable(By locator, WebDriver driver) {
		try {
			waitForPresenceOfElement(locator, driver);
			new WebDriverWait(driver, SetupBase.DEFAULT_TIMEOUT)
					.until(ExpectedConditions.elementToBeClickable(locator));
		} catch (NoSuchElementException e) {
			nosuchElementException(locator.toString(), driver);
		} catch (TimeoutException e) {
			timeOutException(locator.toString(), driver);
		}
	}

	/**
	 * @author Srikanth Karanam
	 * 
	 *         This method is used to click an element using JS to avoid
	 *         "Element not clickable" error
	 */
	public static void clickUsingJS(By locator, WebDriver driver) {
		waitForPresenceOfElement(locator, driver);
		waitForClickable(locator, driver);
		WebElement element = null;
		try {
			element = waitForPresenceOfElement(locator, driver);
			clickUsingJS(element, driver);
		} catch (NoSuchElementException e) {
			Common.nosuchElementException("" + element, driver);
		}
	}

	/**
	 * @author Srikanth Karanam
	 * @param element
	 * @param driver
	 *            Click on an element using JS.
	 */
	public static void clickUsingJS(WebElement element, WebDriver driver) {
		try {
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView(true);", element);
			JavascriptLibrary jsLib = new JavascriptLibrary();
			jsLib.callEmbeddedSelenium(driver, "triggerMouseEventAt", element,
					"click", "0,0");
		} catch (TimeoutException e) {
			Common.timeOutException("" + element, driver);
		}
	}

	/**
	 * @author Srikanth Karanam
	 * 
	 *         This Method is Used to Close Extra Window and Switch back to
	 *         Original Parent Window
	 */
	public static void closeExtraWindowAndSwitchBackToParentWindow(
			String mainWin, WebDriver driver) {
		Set<String> wins = driver.getWindowHandles();
		if (!(wins.size() > 1) || mainWin == null) {
			System.out.println("We don't have enough windows open");
			return;
		}
		for (String win : wins) {
			if (!win.equals(mainWin)) {
				driver.close();
			}
		}
		driver.switchTo().window(mainWin);
	}

	/**
	 * @author Srikanth Karanam
	 * @param locatorToRightClick
	 * @param driver
	 *            This Method is used to Right Click and Open new Tab
	 * 
	 *            INFO : Works For Both Firefox and Also Chrome
	 */
	public static void rightClickAndOpenInNewTab(By locatorToRightClick,
			WebDriver driver) {
		waitForVisibilityOfElement(locatorToRightClick, driver);
		waitForPresenceOfElement(locatorToRightClick, driver);
		waitForClickable(locatorToRightClick, driver);
		if (browsername.toLowerCase().contains("firefox")) {
			// Perform the click operation of Mouse and opens new window
			WebElement Link = driver.findElement(locatorToRightClick);
			Actions action = new Actions(driver);
			action.contextClick(Link).sendKeys(Keys.ARROW_DOWN)
					.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build()
					.perform();
			waitForTime(500);
		} else if (browsername.toLowerCase().contains("chrome")) {
			// Perform the click operation of Mouse and opens new window
			WebElement Link = driver.findElement(locatorToRightClick);
			Actions action = new Actions(driver);
			action.contextClick(Link).perform();
			waitForTime(500);
			action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build()
					.perform();
			waitForTime(500);
		}
		// Switch to new window opened
		waitForNumberOfWindowsGreaterOrEqualTo(2, driver);
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		Common.waitForTime(1000);
	}

	/**
	 * @author Srikanth Karanam
	 * 
	 *         This method waits until the windows for the current driver
	 *         session are active
	 */
	public static void waitForNumberOfWindowsGreaterOrEqualTo(
			final int numOFWindows, WebDriver driver) {
		// Making a new expected condition
		new WebDriverWait(driver, 60) {
		}.until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return (driver.getWindowHandles().size() >= numOFWindows);
			}
		});
	}

}
