package com.shotang.retailersFlow;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shotang.test.init.SetupBase;

public class RetailersFlowTest extends SetupBase {

	public RetailersFlowTest() throws Exception {
		super();
	}

	public RetailersFlowMethods retailersFlowMethods;

	public void envSetup() {
		try {
			super.environmentSetUp();
			retailersFlowMethods = new RetailersFlowMethods(driver);
			driver.getCurrentUrl();
			driver.getWindowHandle();
			RetailersFlowTest.class.getName();
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
	 *         The Test case is used to Verify SignIn With Entering the Wrong
	 *         crdentials
	 */
	@Test(priority = 0, groups = { "sanity" })
	public void verifySignInWithWrongCredentials() {
		retailersFlowMethods.clickOnSignInButtonOnHomePage();
		retailersFlowMethods.enterTheWrongEmailIdAndPasswordFields();
		retailersFlowMethods.clickOnGoButtonOnSignInPage();
		retailersFlowMethods.checkErrorMessage();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         The Test case is used to Verify SignIn With Entering the correct
	 *         crdentials and verifying the orders by brands and categories text
	 */
	@Test(priority = 1, groups = { "sanity" })
	public void verifySignInWithCorrectCredentials() {
		retailersFlowMethods.clickOnSignInButtonOnHomePage();
		retailersFlowMethods.enterTheCorrectEmailIdAndPasswordFields();
		retailersFlowMethods.clickOnGoButtonOnSignInPage();
		retailersFlowMethods.checkRetailersCompanyNameOnDashboardPage();
		retailersFlowMethods
				.checkOrderByBrandsAndCategoriesAndWalletsTextOnDashboardPage();
		retailersFlowMethods.checkOrderByBrandsNamesTextOnDashboardPage();
		retailersFlowMethods.checkOrderByCategoriesNamesTextOnDashboardPage();
		retailersFlowMethods
				.checkSubCategoriesTextUnderTelecomCategorieSection();
		retailersFlowMethods.logOutFromRetailersAccount();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         The Test case is used to Place the order from Distributor end by
	 *         using Nokia Brand
	 */
	@Test(priority = 2, groups = { "sanity" })
	public void placeTheOrderFromDistributorByUsingNokiaBrand() {
		retailersFlowMethods.clickOnSignInButtonOnHomePage();
		retailersFlowMethods.enterTheCorrectEmailIdAndPasswordFields();
		retailersFlowMethods.clickOnGoButtonOnSignInPage();
		retailersFlowMethods.clickOnOrderByBrands();
		retailersFlowMethods.clickOnNokiaBrand();
		retailersFlowMethods.verifyNokiaPageElements();
		retailersFlowMethods.selectTheDistributorAndQuantityTypeForNokiaBrand();
		retailersFlowMethods.clickOnAddToCart();
		retailersFlowMethods.clickOnViewToCart();
		retailersFlowMethods.clickOnPlacedTheOrderAndVerifyTheOrderedMessage();
		retailersFlowMethods.logOutFromRetailersAccount();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         The Test case is used to Place the order from Wholesaler end by
	 *         using Nokia Brand
	 */
	@Test(priority = 3, groups = { "sanity" })
	public void placeTheOrderFromWholesalerByUsingNokiaBrand() {
		retailersFlowMethods.clickOnSignInButtonOnHomePage();
		retailersFlowMethods.enterTheCorrectEmailIdAndPasswordFields();
		retailersFlowMethods.clickOnGoButtonOnSignInPage();
		retailersFlowMethods.clickOnOrderByBrands();
		retailersFlowMethods.clickOnNokiaBrand();
		retailersFlowMethods.verifyNokiaPageElements();
		retailersFlowMethods
				.selectTheWholesalerAndQuantityTypeForNokiaBrandAs105dual();
		retailersFlowMethods.clickOnAddToCart();
		retailersFlowMethods.clickOnViewToCart();
		retailersFlowMethods
				.clickOnCODAndPlacedTheOrderAndVerifyTheOrderedMessage();
		retailersFlowMethods.logOutFromRetailersAccount();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         The Test case is used Place the order from Wholesaler by using
	 *         Telecom Accessories categories
	 */
	@Test(priority = 4, groups = { "sanity" })
	public void placeTheOrderFromWholesalerByUsingTelecomeAccessories() {
		retailersFlowMethods.clickOnSignInButtonOnHomePage();
		retailersFlowMethods.enterTheCorrectEmailIdAndPasswordFields();
		retailersFlowMethods.clickOnGoButtonOnSignInPage();
		retailersFlowMethods.clickOnOrderByCategories();
		retailersFlowMethods.hoverOnTelecomAndClickedOnAccessories();
		retailersFlowMethods.verifyAccessoriesPageElements();
		retailersFlowMethods
				.selectTheWholesalerAndQuantityTypeForTelecomAccesseries();
		retailersFlowMethods.clickOnAddToCart();
		retailersFlowMethods.clickOnViewToCart();
		retailersFlowMethods
				.clickOnCODAndPlacedTheOrderAndVerifyTheOrderedMessage();
		retailersFlowMethods.logOutFromRetailersAccount();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         The Test case is used Place the order from Distributor by using
	 *         Telecom Accessories categories
	 */
	@Test(priority = 5, groups = { "sanity" })
	public void placeTheOrderFromDistributorByUsingTelecomeAccessories() {
		retailersFlowMethods.clickOnSignInButtonOnHomePage();
		retailersFlowMethods.enterTheCorrectEmailIdAndPasswordFields();
		retailersFlowMethods.clickOnGoButtonOnSignInPage();
		retailersFlowMethods.clickOnOrderByCategories();
		retailersFlowMethods.hoverOnTelecomAndClickedOnAccessories();
		retailersFlowMethods.verifyAccessoriesPageElements();
		retailersFlowMethods
				.selectTheDistributorAndQuantityTypeForTelecomAccesseries();
		retailersFlowMethods.clickOnAddToCart();
		retailersFlowMethods.clickOnViewToCart();
		retailersFlowMethods.clickOnPlacedTheOrderAndVerifyTheOrderedMessage();
		retailersFlowMethods.logOutFromRetailersAccount();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         The Test case is used Place the order from Wholesaler by using
	 *         Searchbox Filter and selcting the product as Lava
	 */
	@Test(priority = 6, groups = { "sanity" })
	public void placeTheOrderFromWholesalerByUsingSearchFilter() {
		retailersFlowMethods.clickOnSignInButtonOnHomePage();
		retailersFlowMethods.enterTheCorrectEmailIdAndPasswordFields();
		retailersFlowMethods.clickOnGoButtonOnSignInPage();
		retailersFlowMethods
				.clickOnSearchBoxEnterTheProductNameAndSelectProductAsLava();
		retailersFlowMethods
				.verifyLavaProductPageElementsH1TextBreadcrumbAndPageElements();
		retailersFlowMethods.selectQuantityTypesAndClickOnAddToCart();
		retailersFlowMethods.clickOnViewToCart();
		retailersFlowMethods
				.clickOnCODAndPlacedTheOrderAndVerifyTheOrderedMessage();
		retailersFlowMethods.logOutFromRetailersAccount();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         The Test case is used Place the order from Distributor by using
	 *         Searchbox Filter and selcting the product as Celkon
	 */
	@Test(priority = 7, groups = { "sanity" })
	public void placeTheOrderFromDistributorByUsingSearchfilter() {
		retailersFlowMethods.clickOnSignInButtonOnHomePage();
		retailersFlowMethods.enterTheCorrectEmailIdAndPasswordFields();
		retailersFlowMethods.clickOnGoButtonOnSignInPage();
		retailersFlowMethods
				.clickOnSearchBoxEnterTheProductNameAndSelectProductAsCelkon180();
		retailersFlowMethods
				.verifyCelkonProductPageElementsH1TextBreadcrumbAndPageElements();
		retailersFlowMethods.selectQuantityTypeAndClickOnAddToCart();
		retailersFlowMethods.clickOnViewToCart();
		retailersFlowMethods.clickOnPlacedTheOrderAndVerifyTheOrderedMessage();
		retailersFlowMethods.logOutFromRetailersAccount();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         The Test case is used to verify the My Wallet Page Elements
	 */
	@Test(priority = 8, groups = { "sanity" })
	public void verifyMyWalletPage() {
		retailersFlowMethods.clickOnSignInButtonOnHomePage();
		retailersFlowMethods.enterTheCorrectEmailIdAndPasswordFields();
		retailersFlowMethods.clickOnGoButtonOnSignInPage();
		retailersFlowMethods.clcikOnMyWalletLink();
		retailersFlowMethods.verifyYourWalletTextAndBreadCrumbsText();
		retailersFlowMethods.verifyContinueButton();
		retailersFlowMethods.logOutFromRetailersAccount();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         The Test case is used to verify the Shopping Cart Page Elements
	 */
	@Test(priority = 9, groups = { "sanity" })
	public void verifyShoppingCartPage() {
		retailersFlowMethods.clickOnSignInButtonOnHomePage();
		retailersFlowMethods.enterTheCorrectEmailIdAndPasswordFields();
		retailersFlowMethods.clickOnGoButtonOnSignInPage();
		retailersFlowMethods.clickOnShoppingcartLinkOnDashboardPage();
		retailersFlowMethods.verifyShoppingCartPageTextElements();
		retailersFlowMethods.logOutFromRetailersAccount();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         The Test case is used to verify the My Account Page Elements
	 */
	@Test(priority = 10, groups = { "sanity" })
	public void verifyMyAccountPage() {
		retailersFlowMethods.clickOnSignInButtonOnHomePage();
		retailersFlowMethods.enterTheCorrectEmailIdAndPasswordFields();
		retailersFlowMethods.clickOnGoButtonOnSignInPage();
		retailersFlowMethods.clickOnMyAccountLinkOnDashboardPage();
		retailersFlowMethods.verifyMyAccountPageTextElements();
		retailersFlowMethods.logOutFromRetailersAccount();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         The Test case is used to verify the Footer Section Elements After
	 *         Login
	 */
	@Test(priority = 11, groups = { "sanity" })
	public void verifyFooterSection() {
		retailersFlowMethods.clickOnSignInButtonOnHomePage();
		retailersFlowMethods.enterTheCorrectEmailIdAndPasswordFields();
		retailersFlowMethods.clickOnGoButtonOnSignInPage();
		retailersFlowMethods.verifyFooterInformationSectionElements();
		retailersFlowMethods.verifyFooterCustomerServiceSectionElements();
		retailersFlowMethods.verifyFooterExtrasSectionElements();
		retailersFlowMethods.verifyFooterMyAccountSectionElements();
		retailersFlowMethods.logOutFromRetailersAccount();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         The Test case is used to verify the Edit Information Page
	 *         Elements And Edit The Personal Details
	 */
	@Test(priority = 12, groups = { "sanity" })
	public void verifyEditYourAccountInformationPageAndEditPersonalDetails() {
		retailersFlowMethods.clickOnSignInButtonOnHomePage();
		retailersFlowMethods.enterTheCorrectEmailIdAndPasswordFields();
		retailersFlowMethods.clickOnGoButtonOnSignInPage();
		retailersFlowMethods.clickOnMyAccountLinkOnDashboardPage();
		retailersFlowMethods.clickOnEditYourAccountInformationOnMyAccountPage();
		retailersFlowMethods.verifyMyAccountInformationPageH1AndBreadCrumbs();
		retailersFlowMethods.verifyYourPersonalDetailsSection();
		retailersFlowMethods.verifyYourDistributorSection();
		retailersFlowMethods.editingThePersonalDetails();
		retailersFlowMethods.logOutFromRetailersAccount();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         The Test case is used to verify the Chnage Password Page Elements
	 *         And Change The Password
	 */
	@Test(priority = 13, groups = { "sanity" })
	public void verifyChangePasswordPageElementsAndChnageThePassword() {
		retailersFlowMethods.clickOnSignInButtonOnHomePage();
		retailersFlowMethods.enterTheCorrectEmailIdAndPasswordFields();
		retailersFlowMethods.clickOnGoButtonOnSignInPage();
		retailersFlowMethods.clickOnMyAccountLinkOnDashboardPage();
		retailersFlowMethods.clickOnChangeYourPasswordOnMyAccountPage();
		retailersFlowMethods
				.verifyChangeYourPasswordH1TextAndBreadCrumbElements();
		retailersFlowMethods.verifyYourPasswordSectionElements();
		retailersFlowMethods.changingTheNewPassword();
		retailersFlowMethods.logOutFromRetailersAccount();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         The Test case is used to verify the Address Book Entries Page
	 */
	@Test(priority = 14, groups = { "sanity" })
	public void verifyAddressBookEntriesPageElements() {
		retailersFlowMethods.clickOnSignInButtonOnHomePage();
		retailersFlowMethods.enterTheCorrectEmailIdAndPasswordFields();
		retailersFlowMethods.clickOnGoButtonOnSignInPage();
		retailersFlowMethods.clickOnMyAccountLinkOnDashboardPage();
		retailersFlowMethods
				.clickOnModifyYourAddressBookEntriesOnMyAccountPage();
		retailersFlowMethods.verifyAddresBookH1TextAndBreadCrumbs();
		retailersFlowMethods.verifyAddresBookEntriesSection();
		retailersFlowMethods.logOutFromRetailersAccount();
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
