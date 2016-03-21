package com.shotang.staticpages;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shotang.test.init.SetupBase;

public class StaticPageTest extends SetupBase {

	private static String OriginalWindowHandler;

	public StaticPageTest() throws Exception {
		super();
	}

	public StaticPageMethods staticPageMethods;

	public void envSetup() {
		try {
			super.environmentSetUp();
			staticPageMethods = new StaticPageMethods(driver);
			driver.getCurrentUrl();
			OriginalWindowHandler = driver.getWindowHandle();
			StaticPageTest.class.getName();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @author srikanth.k
	 * 
	 *         The class is used to open the Shotang Home page
	 */
	@BeforeClass(alwaysRun = true)
	public void setUp() {
		envSetup();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         The Method is used to Navigate back to Home Page
	 */
	@BeforeMethod(alwaysRun = true)
	public void navigatingToHomePage() {
		navigateToLandingPage();
		driver.manage().window().maximize();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         The Test case is used to Verify We Are Hiring Page Elements
	 */
	@Test(priority = 0, groups = { "sanity" })
	public void verifyWeAreHiringPageElements() {
		staticPageMethods
				.verifyElementsOnWeAreHiringPage(OriginalWindowHandler);
	}

	/**
	 * @author srikanth.k
	 * 
	 *         The Test case is used to Verify Sell On Shotang Page Elements
	 */
	@Test(priority = 1, groups = { "sanity" })
	public void verifySellOnShotangPageElements() {
		staticPageMethods.clickOnSellOnShotangLinkOnHomePage();
		staticPageMethods.checkSellFromAnyWhereText();
		staticPageMethods.checkSubmitButtonAndCallUsText();
		staticPageMethods.checkRegisterSellerLeftSideText();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         The Test case is used to Verify About Us Page Elements
	 */
	@Test(priority = 2, groups = { "sanity" })
	public void verifyAboutUsPageElements() {
		staticPageMethods.clickOnAboutUsLinkOnHomePage();
		staticPageMethods.checkAboutUsText();
		staticPageMethods.checkResellersAndCompaniesText();
		staticPageMethods.checkOurAimAndEndeavourText();
		staticPageMethods.checkOurTeamMembersAndInvestorsText();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         The Test case is used to Verify Contact Us Page Elements
	 */
	@Test(priority = 3, groups = { "sanity" })
	public void verifyContactUsPageElements() {
		staticPageMethods.clickOnContactUsLinkOnHomePage();
		staticPageMethods.checkHelloAndWeAreWaitingText();
		staticPageMethods.checkLeaveAMessageText();
		staticPageMethods.checkSendButtonAndCallusNumberText();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This Method is used to take Screen Shot After every Method
	 * 
	 * @throws Exception
	 */
	@AfterMethod(alwaysRun = true)
	public void takeScreenShot(ITestResult result) throws Exception {
		TakeScreenshoot(result, driver);
	}

	@AfterClass(alwaysRun = true)
	public void closingBrowserCleanly() {
		handleAfterClassCleanup();
	}

}
