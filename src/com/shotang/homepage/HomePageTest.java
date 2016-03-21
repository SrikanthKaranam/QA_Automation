package com.shotang.homepage;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shotang.test.init.SetupBase;

public class HomePageTest extends SetupBase {

	public HomePageTest() throws Exception {
		super();
	}

	public HomePageMethods homePageMethods;

	public void envSetup() {
		try {
			super.environmentSetUp();
			homePageMethods = new HomePageMethods(driver);
			HomePageTest.class.getName();
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
	 *         The Test case is used to Verify Shotang Home Page Header Elements
	 */
	@Test(priority = 0, groups = { "sanity" })
	public void verifyHomePageHeaderElements() {
		homePageMethods.checkHeaderTextElementsOnHomePage();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         The Test case is used to Verify Above Masth Head Image Elements
	 *         on Home page
	 */
	@Test(priority = 1, groups = { "sanity" })
	public void VerifyAboveMasthHaedImageElements() {
		homePageMethods.checkAboveMasthHeadImageElementsOnHomePage();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         The Test case is used to Verify Top Categories Elements on Home
	 *         page
	 */
	@Test(priority = 2, groups = { "sanity" })
	public void VerifyTopCategoriesElements() {
		homePageMethods.checkTopCategoriesElementsOnHomePage();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         The Test case is used to Verify Why Shotang and Under Elements on
	 *         Home page
	 */
	@Test(priority = 3, groups = { "sanity" })
	public void VerifyWhyShotangAndUnderElements() {
		homePageMethods.checkWhyShotangAndUnderElementsOnHomePage();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         The Test case is used to Verify Shotang Home Page Footer Elements
	 */
	@Test(priority = 4, groups = { "sanity" })
	public void VerifyHomePageFooterElements() {
		homePageMethods.checkFooterTextElementsOnHomePage();
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
