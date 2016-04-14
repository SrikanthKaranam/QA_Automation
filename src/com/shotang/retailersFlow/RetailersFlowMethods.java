package com.shotang.retailersFlow;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import static com.shotang.retailersFlow.RetailersFlowPageLocaters.*;

import com.shotang.common.Common;

public class RetailersFlowMethods {

	WebDriver driver;

	public RetailersFlowMethods(WebDriver driver) {
		this.driver = driver;
		driver.manage().window().maximize();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to click on the SignIn Button on Shotang Home
	 *         Page
	 */
	public void clickOnSignInButtonOnHomePage() {
		Common.click(XPATH_SIGN_IN_BUTTON, driver);
		System.out.println("Clicked on the 'Signin' button");

	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to click on the Go Button on Shotang SignIn
	 *         Page
	 */
	public void clickOnGoButtonOnSignInPage() {
		Common.click(XPATH_GO, driver);
		System.out.println("Clicked on the 'Go' Button");
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to enter the wrong Retailers email id and
	 *         password fields
	 */
	public void enterTheWrongEmailIdAndPasswordFields() {
		Common.clear(XPATH_EMAIL_ID, driver);
		System.out.println("Clearing the email id field");
		Common.input(XPATH_EMAIL_ID, RETAILERS_WRONG_EMAIL_ID, driver);
		System.out.println("Enterning the wrong email id");
		Common.clear(XPATH_PASSWORD, driver);
		System.out.println("Clearing the password field");
		Common.input(XPATH_PASSWORD, RETAILERS_WRONG_PASSWORD, driver);
		System.out.println("Enterning the wrong password");
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to check the error message if email id or
	 *         password is enter wrongly
	 */
	public void checkErrorMessage() {
		Common.assertTextUsingEquals(
				XPATH_INVALID_EMAILID_OR_PASSWORD_ERROR_TEXT,
				"Invalid Email/Password", driver);
		System.out
				.println("Verifying the error message is displaying as 'Invalid Email/Password'");
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to enter the Retailers Correct email id and
	 *         password fields
	 */
	public void enterTheCorrectEmailIdAndPasswordFields() {
		Common.clear(XPATH_EMAIL_ID, driver);
		System.out.println("Clearing the email id field");
		Common.input(XPATH_EMAIL_ID, RETAILERS_EMAIL_ID, driver);
		System.out.println("Enterning the email id field");
		Common.clear(XPATH_PASSWORD, driver);
		System.out.println("clearing the password field");
		Common.input(XPATH_PASSWORD, RETAILERS_PASSWORD, driver);
		System.out.println("Enterning the password field");
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to check the Retailers company name is
	 *         present or not in dashboard page
	 */
	public void checkRetailersCompanyNameOnDashboardPage() {
		Common.assertTextUsingEquals(XPATH_RETAILERS_COMPANY_NAME,
				"Test Account", driver);
		System.out.println("Verified the 'Retailers company' name is present");
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to check the Order by Brands/Categories and
	 *         wallets texts
	 */
	public void checkOrderByBrandsAndCategoriesAndWalletsTextOnDashboardPage() {
		Common.assertTextUsingEquals(XPATH_ORDER_BY_BRANDS, "Order by Brands",
				driver);
		System.out.println("Verified 'Order by Brands' Text is Present");
		Common.assertTextUsingEquals(XPATH_ORDER_BY_CATEGORIES,
				"Order by Categories", driver);
		System.out.println("Verified 'Order by Categories' Text is Present");
		Common.assertTextUsingEquals(XPATH_MY_WALLET, "My Wallet", driver);
		System.out.println("Verified 'My Wallet' Text is Present");
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to check the Order by Brands Names Text on
	 *         dashboard page
	 */
	public void checkOrderByBrandsNamesTextOnDashboardPage() {
		Common.click(XPATH_ORDER_BY_BRANDS, driver);
		Common.waitForVisibilityOfElement(XPATH_NOKIA_BRAND_TEXT, driver);
		Common.assertTextUsingEquals(XPATH_NOKIA_BRAND_TEXT, "Nokia", driver);
		System.out.println("Nokia Text is Present");
		Common.assertTextUsingEquals(XPATH_CELKON_BRAND_TEXT, "Celkon", driver);
		System.out.println("Celkon Text is Present");
		Common.assertTextUsingEquals(XPATH_INTEX_BRAND_TEXT, "Intex", driver);
		System.out.println("Intex Text is Present");
		Common.assertTextUsingEquals(XPATH_LAVA_BRAND_TEXT, "Lava", driver);
		System.out.println("Lava Text is Present");
		Common.assertTextUsingEquals(XPATH_VIVO_BRAND_TEXT, "Vivo", driver);
		System.out.println("Vivo Text is Present");
		Common.assertTextUsingEquals(XPATH_MICROMAX_BRAND_TEXT, "Micromax",
				driver);
		System.out.println("Micromax Text is Present");
		Common.assertTextUsingEquals(XPATH_SAMSUNG_BRAND_TEXT, "Samsung",
				driver);
		System.out.println("Samsung Text is Present");
		Common.assertTextUsingEquals(XPATH_PANASONIC_BRAND_TEXT, "Panasonic",
				driver);
		System.out.println("Panasonic Text is Present");
		Common.assertTextUsingEquals(XPATH_XOLO_BRAND_TEXT, "Xolo", driver);
		System.out.println("Xolo Text is Present");
		Common.assertTextUsingEquals(XPATH_SANSUI_BRAND_TEXT, "Sansui", driver);
		System.out.println("Sansui Text is Present");
		Common.assertTextUsingEquals(XPATH_VIDEOCON_BRAND_TEXT, "Videocon",
				driver);
		System.out.println("Videocon Text is Present");
		Common.assertTextUsingEquals(XPATH_SWIPE_BRAND_TEXT, "Swipe", driver);
		System.out.println("Swipe Text is Present");
		Common.assertTextUsingEquals(XPATH_SPICE_BRAND_TEXT, "Spice", driver);
		System.out.println("Spice Text is Present");
		Common.assertTextUsingEquals(XPATH_LENOVO_BRAND_TEXT, "Lenovo", driver);
		System.out.println("Lenovo Text is Present");
		Common.assertTextUsingEquals(XPATH_LG_MOBILES_BRAND_TEXT, "LG Mobiles",
				driver);
		System.out.println("LG Mobiles Text is Present");
		Common.assertTextUsingEquals(XPATH_KARBONN_BRAND_TEXT, "Karbonn",
				driver);
		System.out.println("Karbonn Text is Present");
		Common.assertTextUsingEquals(XPATH_IBALL_BRAND_TEXT, "I Ball", driver);
		System.out.println("I Ball Text is Present");
		Common.assertTextUsingEquals(XPATH_HUAWEI_BRAND_TEXT, "Huawei", driver);
		System.out.println("Huawei Text is Present");
		Common.assertTextUsingEquals(XPATH_HTC_BRAND_TEXT, "HTC", driver);
		System.out.println("HTC Text is Present");
		Common.assertTextUsingEquals(XPATH_DATAWIND_BRAND_TEXT, "Datawind",
				driver);
		System.out.println("Datawind Text is Present");
		Common.assertTextUsingEquals(XPATH_SONY_BRAND_TEXT, "Sony", driver);
		System.out.println("Sony Text is Present");
		Common.assertTextUsingEquals(XPATH_GIONEE_BRAND_TEXT, "Gionee", driver);
		System.out.println("Gionee Text is Present");
		Common.assertTextUsingEquals(XPATH_RAGE_BRAND_TEXT, "Rage", driver);
		System.out.println("Rage Text is Present");
		Common.assertTextUsingEquals(XPATH_GRAVITI_BRAND_TEXT, "Graviti",
				driver);
		System.out.println("Graviti Text is Present");
		Common.assertTextUsingEquals(XPATH_RELIANCE_JIO_BRAND_TEXT,
				"Reliance Jio", driver);
		System.out.println("Reliance Jio Text is Present");
		Common.assertTextUsingEquals(XPATH_COPPER_BRAND_TEXT, "Copper", driver);
		System.out.println("Copper Text is Present");
		Common.assertTextUsingEquals(XPATH_ZEDDI_S_LINE_BRAND_TEXT,
				"Zeddi S-Line", driver);
		System.out.println("Zeddi S-Line Text is Present");
		Common.assertTextUsingEquals(XPATH_INFOCUS_BRAND_TEXT, "Infocus",
				driver);
		System.out.println("Infocus Text is Present");
		Common.assertTextUsingEquals(XPATH_ZIOX_BRAND_TEXT, "ZioX", driver);
		System.out.println("ZioX Text is Present");
		Common.assertTextUsingEquals(XPATH_ZTE_BRAND_TEXT, "ZTE", driver);
		System.out.println("ZTE Text is Present");
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to check the Order by Brands Names Text on
	 *         dashboard page
	 */
	public void checkOrderByCategoriesNamesTextOnDashboardPage() {
		Common.click(XPATH_ORDER_BY_CATEGORIES, driver);
		Common.waitForVisibilityOfElement(XPATH_CATEGORIES_AS_TELECOM, driver);
		Common.assertTextUsingEquals(XPATH_CATEGORIES_AS_TELECOM, "Telecom",
				driver);
		System.out.println("Categories Name as 'Telecom' Text is Present");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used to "Hover on the Telecom Categorie' On
	 *         dashboard Page
	 */
	public void hoverOnTelecomCategorie() {
		Common.hoverOnElement(XPATH_CATEGORIES_AS_TELECOM, driver);
		System.out.println("Hovering on the Telecom Categorie");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used to check the 'subcategories text under
	 *         telecom categorie section' on dashboard page
	 */
	public void checkSubCategoriesTextUnderTelecomCategorieSection() {
		Common.click(XPATH_ORDER_BY_CATEGORIES, driver);
		Common.hoverOnElement(XPATH_CATEGORIES_AS_TELECOM, driver);
		System.out.println("Hovering on the Telecom Categorie");
		Common.assertTextUsingEquals(XPATH_SUB_CATEGORIE_AS_ACCESSORIES,
				"Accessories", driver);
		System.out.println("Accessories Text Is Present");
		Common.assertTextUsingEquals(XPATH_SUB_CATEGORIE_AS_BOOK_COVERS,
				"Book Covers", driver);
		System.out.println("Book Covers Text Is Present");
		Common.assertTextUsingEquals(XPATH_SUB_CATEGORIE_AS_CAR_ACCESSORIES,
				"Car Accessories", driver);
		System.out.println("Car Accessories Text Is Present");
		Common.assertTextUsingEquals(XPATH_SUB_CATEGORIE_AS_POWER_BANK,
				"Power Bank", driver);
		System.out.println("Power Bank Text Is Present");
		Common.assertTextUsingEquals(XPATH_SUB_CATEGORIE_AS_SCREEN_GUARD,
				"Screen Guard", driver);
		System.out.println("Screen Guard Text Is Present");
		Common.assertTextUsingEquals(XPATH_SUB_CATEGORIE_AS_TABLETS, "Tablets",
				driver);
		System.out.println("Tablets Text Is Present");
		Common.assertTextUsingEquals(XPATH_SUB_CATEGORIE_AS_MOBILES, "Mobiles",
				driver);
		System.out.println("Mobiles Text Is Present");
		Common.assertTextUsingEquals(
				XPATH_SUB_CATEGORIE_AS_HEADSETS_AND_SPEAKER,
				"Headsets & Speaker", driver);
		System.out.println("Headsets & Speaker Text Is Present");
		Common.assertTextUsingEquals(XPATH_SUB_CATEGORIE_AS_MOBILE_COVERS,
				"Mobile Covers", driver);
		System.out.println("Mobile Covers Text Is Present");
		Common.assertTextUsingEquals(XPATH_SUB_CATEGORIE_AS_CHARGERS,
				"Chargers", driver);
		System.out.println("Chargers Text Is Present");
		Common.assertTextUsingEquals(XPATH_SUB_CATEGORIE_AS_BATTERIES,
				"Batteries", driver);
		System.out.println("Batteries Text Is Present");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used for Retailers Logout
	 */
	public void logOutFromRetailersAccount() {
		Common.waitForPresenceOfElement(XPATH_LOG_OUT, driver);
		Common.click(XPATH_LOG_OUT, driver);
		System.out.println("Logout Done successfully");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used click on Oreder By Brands
	 */
	public void clickOnOrderByBrands() {
		Common.click(XPATH_ORDER_BY_BRANDS, driver);
		System.out.println("Clicked on Order By Brands");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used click on Nokia Brand
	 */
	public void clickOnNokiaBrand() {
		Common.waitForClickable(XPATH_NOKIA_BRAND, driver);
		Common.click(XPATH_NOKIA_BRAND, driver);
		System.out.println("Clicked on Nokia Brand");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used verify the Nokia Brand page elements
	 */
	public void verifyNokiaPageElements() {

		Common.waitForPresenceOfElement(XPATH_H1_TEXT, driver);
		Common.assertTextUsingEquals(XPATH_H1_TEXT, "Nokia", driver);
		System.out.println("verifying the Nokia H1 Tag Text");
		Common.assertTextUsingEquals(XPATH_SORT_BY, "Sort By:", driver);
		System.out.println("Verify the Sort By text");
		Common.assertTextUsingEquals(XPATH_SHOW, "Show:", driver);
		System.out.println("Verify the Show text");
		Common.assertTextUsingEquals(XPATH_SELLERS_TEXT, "Sellers", driver);
		System.out.println("Verify the Sellers text");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used to select the Wholesaler Type and Quantity
	 *         Type For Nokia Brand
	 */
	public void selectTheWholesalerAndQuantityTypeForNokiaBrand() {
		Common.click(XPATH_SELECT_WHOLESALLER_TYPE_AS_AM_MOBILES_FOR_NOKIA,
				driver);
		System.out
				.println("Selected the sale type Wholesaler as SS Electronics");
		Common.click(XPATH_SELECT_QUANTITY, driver);
		System.out.println("clicked on the num of quantity");
		Common.input(XPATH_SELECT_QUANTITY, "5", driver);
		System.out.println("selected the 5 Number of Nokia Quantites");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used to select the Distributor Type and Quantity
	 *         Type For Nokia Brand
	 */
	public void selectTheDistributorAndQuantityTypeForNokiaBrand() {
		Common.click(XPATH_SELECT_DISTRIBUTOR_TYPE_AS_TEST_SELLER_FORNOKIA,
				driver);
		System.out
				.println("Selected the sale type Distributor as Tele Sellers");
		Common.click(XPATH_SELECT_QUANTITY, driver);
		System.out.println("clicked on the num of quantity");
		Common.input(XPATH_SELECT_QUANTITY, "5", driver);
		System.out.println("selected the 5 Number of Nokia Quantites");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used for clicking on Add To Cart Type
	 */
	public void clickOnAddToCart() {
		Common.click(XPATH_ADD_TO_CART, driver);
		System.out.println("Clicked on the Add to cart button");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used for clicking on View To Cart Type
	 */
	public void clickOnViewToCart() {
		Common.waitForPresenceOfElement(XPATH_CART_TOTAL, driver);
		Common.click(XPATH_CART_TOTAL, driver);
		System.out.println("Clicked on the cart total section");
		Common.waitForTime(5000);
		Common.click(XPATH_VIEW_CART, driver);
		System.out.println("Clicked on the View cart");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used for clicking for cod and Placed the Order and
	 *         verify the placed ordered message for wholesalers
	 */
	public void clickOnCODAndPlacedTheOrderAndVerifyTheOrderedMessage() {
		Common.assertTextUsingEquals(XPATH_SHOPPING_CART_TEXT, "Shopping Cart",
				driver);
		System.out.println("Verifed the Shopping cart text");
		Common.click(XPATH_CASH_ON_DELEVERY_OPTION, driver);
		System.out.println("Selected the COD Option");
		Common.scrollTillVisibilityOfAnElement(XPATH_PLACE_ORDER_BUTTON, driver);
		Common.click(XPATH_PLACE_ORDER_BUTTON, driver);
		System.out.println("Clicked on the Place order button");
		Common.assertTextUsingEquals(XPATH_ORDER_PLACED_MESSAGE,
				"Your Order Has Been Placed!", driver);
		System.out.println("Verifed the Placed Ordered Message");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used for clicking for cod and Placed the Order and
	 *         verify the placed ordered message for Distributors
	 */
	public void clickOnPlacedTheOrderAndVerifyTheOrderedMessage() {
		Common.assertTextUsingEquals(XPATH_SHOPPING_CART_TEXT, "Shopping Cart",
				driver);
		System.out.println("Verifed the Shopping cart text");
		Common.scrollTillVisibilityOfAnElement(XPATH_PLACE_ORDER_BUTTON, driver);
		Common.click(XPATH_PLACE_ORDER_BUTTON, driver);
		System.out.println("Clicked on the Place order button");
		Common.assertTextUsingEquals(XPATH_ORDER_PLACED_MESSAGE,
				"Your Order Has Been Placed!", driver);
		System.out.println("Verifed the Placed Ordered Message");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used Place the order from Distributor by using
	 *         Nokia Brand
	 */
	public void placeTheOrderFromDistributorByUsingNokiaBrand() {
		clickOnOrderByBrands();
		clickOnNokiaBrand();
		verifyNokiaPageElements();
		selectTheDistributorAndQuantityTypeForNokiaBrand();
		clickOnAddToCart();
		clickOnViewToCart();
		clickOnPlacedTheOrderAndVerifyTheOrderedMessage();
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used Place the order from Wholesaler by using
	 *         Nokia Brand
	 */
	public void placeTheOrderFromWholesalerByUsingNokiaBrand() {
		clickOnOrderByBrands();
		clickOnNokiaBrand();
		verifyNokiaPageElements();
		selectTheWholesalerAndQuantityTypeForNokiaBrand();
		clickOnAddToCart();
		clickOnViewToCart();
		clickOnCODAndPlacedTheOrderAndVerifyTheOrderedMessage();
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used click on Oreder By Categories
	 */
	public void clickOnOrderByCategories() {
		Common.click(XPATH_ORDER_BY_CATEGORIES, driver);
		System.out.println("Clicked On The Order By Categories");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used Hover On telecom and clicked on Accessories
	 */
	public void hoverOnTelecomAndClickedOnAccessories() {
		Common.hoverOnElement(XPATH_CATEGORIES_AS_TELECOM, driver);
		System.out.println("Hovered On Telecom Categorie");
		Common.click(XPATH_SUB_CATEGORIE_AS_ACCESSORIES, driver);
		System.out.println("Clicked on Accessories sub categorie");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used check the Accessories page elements
	 */
	public void verifyAccessoriesPageElements() {
		Common.assertTextUsingEquals(XPATH_CATEGORIES_ON_ACCESSORIES,
				"Categories", driver);
		System.out
				.println("Verifed The Categories element on left side part of accessories page");
		Common.assertTextUsingEquals(XPATH_APPARELS_ON_ACCESSORIES, "Apparels",
				driver);
		System.out
				.println("Verifed The Apparels element on left side part of accessories page");
		Common.assertTextUsingEquals(XPATH_TELECOM_ON_ACCESSORIES, "Telecom",
				driver);
		System.out
				.println("Verifed The Telecom element on left side part of accessories page");
		Common.assertTextUsingEquals(XPATH_SELLERS_ON_ACCESSORIES, "Sellers",
				driver);
		System.out
				.println("Verifed The Sellers element on left side part of accessories page");

		Common.assertTextUsingEquals(
				XPATH_ACCESSORIES_HEADING_H1_ON_ACCESSORIES, "Accessories",
				driver);
		System.out
				.println("Verifed The Accessories element Heading H1 on accessories page");
		Common.assertTextUsingEquals(XPATH_HOME_TEXT_BREADCRUMB, "Home", driver);
		Common.assertTextUsingEquals(XPATH_TELECOM_ON_BREADCRUMB, "Telecom",
				driver);
		Common.assertTextUsingEquals(XPATH_ACCESSORIES_ON_BREADCRUMB,
				"Accessories", driver);
		System.out
				.println("Verified the 'Home>Telecom>Accessories Bredcrumbs on Accessories Page");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used to select the Wholesaler Type and Quantity
	 *         Type For Telecom Accesserios
	 */
	public void selectTheWholesalerAndQuantityTypeForTelecomAccesseries() {
		Common.click(
				XPATH_SELECT_WHOLESALER_AS_SS_ENTERPRISES_FOR_TELECOME_ACCESSORIES,
				driver);
		System.out
				.println("Selected the sale type Wholesaler as SS Electronics");
		Common.click(XPATH_SELECT_QUANTITY, driver);
		System.out.println("clicked on the num of quantity");
		Common.input(XPATH_SELECT_QUANTITY, "5", driver);
		System.out.println("selected the 5 Number of Nokia Quantites");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used to select the Distributor Type and Quantity
	 *         Type For Telecom Accesserios
	 */
	public void selectTheDistributorAndQuantityTypeForTelecomAccesseries() {
		Common.click(
				XPATH_SELECT_DISTRIBUTOR_TYPE_AS_TEST_SELLER_FOR_TELECOM_ACCESSERIES,
				driver);
		System.out
				.println("Selected the sale type Wholesaler as SS Electronics");
		Common.click(XPATH_SELECT_QUANTITY, driver);
		System.out.println("clicked on the num of quantity");
		Common.input(XPATH_SELECT_QUANTITY, "5", driver);
		System.out.println("selected the 5 Number of Nokia Quantites");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used Place the order from Wholesaler by using
	 *         Telecom Accessories
	 */
	public void placeTheOrderFromWholesalerByUsingTelecomeAccessories() {
		clickOnOrderByCategories();
		hoverOnTelecomAndClickedOnAccessories();
		verifyAccessoriesPageElements();
		selectTheWholesalerAndQuantityTypeForTelecomAccesseries();
		clickOnAddToCart();
		clickOnViewToCart();
		clickOnCODAndPlacedTheOrderAndVerifyTheOrderedMessage();
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used Place the order from Distributor by using
	 *         Telecom Accessories
	 */
	public void placeTheOrderFromDistributorByUsingTelecomeAccessories() {
		clickOnOrderByCategories();
		hoverOnTelecomAndClickedOnAccessories();
		verifyAccessoriesPageElements();
		selectTheDistributorAndQuantityTypeForTelecomAccesseries();
		clickOnAddToCart();
		clickOnViewToCart();
		clickOnPlacedTheOrderAndVerifyTheOrderedMessage();
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used for click the search box and enterning the
	 *         product name and selecting the product as LAVA ATOM 2 Silicon
	 *         Case
	 */
	public void clickOnSearchBoxEnterTheProductNameAndSelectProductAsLava() {
		Common.click(XPATH_SEARCH_BOX, driver);
		System.out.println("clicking the Search box");
		Common.input(XPATH_SEARCH_BOX, "LAVA ATOM 2 Silicon Case", driver);
		System.out
				.println("Entering the Product name as LAVA ATOM 2 Silicon Case ");
		Common.waitForTime(5000);
		Common.click(XPATH_SELECT_LAVA_ATOM_IN_DROPDOWN, driver);
		System.out.println("Selecting the product on dropdown");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used for verify the Lava Product Page elements
	 */
	public void verifyLavaProductPageElementsH1TextBreadcrumbAndPageElements() {
		Common.waitForPresenceOfElement(XPATH_LAVA_ATOM_2_SILICON_H1_TEXT,
				driver);
		Common.assertTextUsingEquals(XPATH_LAVA_ATOM_2_SILICON_H1_TEXT,
				"Lava ATOM 2 Silicon Case", driver);
		System.out.println("Verified the Lava H1 text is present");
		Common.assertTextUsingEquals(XPATH_HOME_TEXT_BREADCRUMB, "Home", driver);
		Common.assertTextUsingEquals(XPATH_LAVA_ATOM_2_SILICON_BREADCRUMB,
				"Lava ATOM 2 Silicon Case", driver);
		System.out
				.println("Verified the Home>Lava ATOM 2 Silicon Case breadCrumbs are present");
		Common.assertTextUsingEquals(XPATH_WHOLESALER_TEXT, "Wholesaler:",
				driver);
		System.out.println("Verifed the Wholesaler: Text is present");
		Common.assertTextUsingEquals(XPATH_PRAKASH_TELECOM_TEXT_ON_SEARCH_PAGE,
				"Prakash Telecom", driver);
		System.out.println("Verifed the Prakash Telecom Text is present");
		Common.assertTextUsingEquals(XPATH_BLACK_TEXT, "Black:", driver);
		Common.assertTextUsingEquals(XPATH_RED_TEXT, "Red:", driver);
		Common.assertTextUsingEquals(XPATH_BLUE_TEXT, "Blue:", driver);
		Common.assertTextUsingEquals(XPATH_PURPLE_TEXT, "Purple:", driver);
		System.out
				.println("Verified The Black, Red, Blue, Purple Text Are Present");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used for Selecting the Quantity and Clicking on
	 *         Add to cart
	 */
	public void selectQuantityTypesAndClickOnAddToCart() {
		Common.click(XPATH_BLACK_QUANTITY, driver);
		Common.input(XPATH_BLACK_QUANTITY, "2", driver);
		System.out.println("Clicking on Black quanity and entering the value");
		Common.click(XPATH_RED_QUANTITY, driver);
		Common.input(XPATH_RED_QUANTITY, "2", driver);
		System.out.println("Clicking on Red quanity and entering the value");
		Common.click(XPATH_BLUE_QUANTITY, driver);
		Common.input(XPATH_BLUE_QUANTITY, "2", driver);
		System.out.println("Clicking on Blue quanity and entering the value");
		Common.click(XPATH_PURPLE_QUANTITY, driver);
		Common.input(XPATH_PURPLE_QUANTITY, "2", driver);
		System.out.println("Clicking on Purple quanity and entering the value");
		Common.click(XPATH_CLICK_ADD_TO_CART, driver);
		System.out.println("Clicked on the Add to cart button");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used for click the search box and enterning the
	 *         product name and selecting the product as C180(Celkon)
	 */
	public void clickOnSearchBoxEnterTheProductNameAndSelectProductAsCelkon() {
		Common.click(XPATH_SEARCH_BOX, driver);
		System.out.println("clicking the Search box");
		Common.input(XPATH_SEARCH_BOX, "C180(Celkon)", driver);
		System.out.println("Entering the Product name as C180(Celkon) ");
		Common.waitForTime(7000);
		Common.click(XPATH_SELECTING_DISTRIBUTOR_PRODUCT_DROPDOWN, driver);
		System.out.println("Selecting the product on dropdown");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used for verify the Celkon Product Page elements
	 */
	public void verifyCelkonProductPageElementsH1TextBreadcrumbAndPageElements() {
		Common.waitForPresenceOfElement(XPATH_C180CELKON_H1_TEXT, driver);
		Common.assertTextUsingEquals(XPATH_C180CELKON_H1_TEXT, "C180(Celkon)",
				driver);
		System.out.println("Verified the Celkon H1 text is present");
		Common.assertTextUsingEquals(XPATH_HOME_TEXT_BREADCRUMB, "Home", driver);
		Common.assertTextUsingEquals(XPATH_C180CELKON_BREADCRUMB,
				"C180(Celkon)", driver);
		System.out
				.println("Verified the Home>C180(Celkon) BreadCrumbs are present");
		Common.assertTextUsingEquals(XPATH_DISTRIBUTOR_TEXT, "Distributor:",
				driver);
		System.out.println("Verifed the Distributor: Text is present");
		Common.assertTextUsingEquals(XPATH_TEST_SELLERS_TEXT_ON_CELKON,
				"test seller", driver);
		System.out.println("Verifed the test seller Text is present");
		Common.assertTextUsingEquals(XPATH_BLACK_TEXT, "Black:", driver);
		System.out.println("Verified The Black, Text is Present");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used for Selecting the Quantity and Clicking on
	 *         Add to cart for Celkon Product
	 */
	public void selectQuantityTypeAndClickOnAddToCart() {
		Common.click(XPATH_BLACK_QUANTITY, driver);
		Common.input(XPATH_BLACK_QUANTITY, "2", driver);
		System.out.println("Clicking on Black quanity and entering the value");
		Common.click(XPATH_CLICK_ADD_TO_CART, driver);
		System.out.println("Clicked on the Add to cart button");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used to click on My Wallet Link
	 */
	public void clcikOnMyWalletLink() {
		Common.click(XPATH_MY_WALLET_LINK, driver);
		System.out.println("Clicked On My Wallet Link");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used to verify the Your wallet text and Bread
	 *         crumb text Elements
	 */
	public void verifyYourWalletTextAndBreadCrumbsText() {
		Common.assertTextUsingEquals(XPATH_YOUR_WALLET_TEXT, "Your Wallet",
				driver);
		System.out.println("Verified the Your 'Wallet Text' Is Present");
		Common.assertTextUsingEquals(XPATH_HOME_TEXT_BREADCRUMB, "Home", driver);
		Common.assertTextUsingEquals(XPATH_ACCOUNT_TEXT_BREADCRUMB, "Account",
				driver);
		Common.assertTextUsingEquals(XPATH_WALLET_TEXT_BREADCRUMB, "Wallet",
				driver);
		System.out.println("Verifed The 'Home>Account>Wallet Bread crumb text");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used to verify the Your wallet text and Bread
	 *         crumb text elements
	 */
	public void verifyTotalWalletElementAndDateAddedAndDescriptionAndAmountText() {
		Common.waitForPresenceOfElement(XPATH_TOTAL_WALLET_ELEMENT, driver);
		System.out
				.println("Verified the Your 'Total Wallet Amount Element' Is Present");
		Common.assertTextUsingEquals(XPATH_DATE_ADDED_TEXT, "Date Added",
				driver);
		Common.assertTextUsingEquals(XPATH_DESCRIPTION_TEXT, "Description",
				driver);
		Common.assertTextUsingEquals(XPATH_AMOUNT_TEXT, "Amount(+/- Rs.)",
				driver);
		System.out
				.println("Verified the Your 'Date Added, Description, Amount(+/- Rs.) Text Is Present");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used to verify the Continue Button is present or
	 *         not
	 */
	public void verifyContinueButton() {
		Common.waitForPresenceOfElement(XPATH_CONTINUE_BUTTON, driver);
		System.out.println("Verifed The Continue button Is Present");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used Verify My Wallet Page
	 */
	public void verifyMyWalletPage() {
		clcikOnMyWalletLink();
		verifyYourWalletTextAndBreadCrumbsText();
		verifyContinueButton();
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used click on My Account Link On Dashboard Page
	 */
	public void clickOnMyAccountLinkOnDashboardPage() {
		Common.hoverOnElement(CSS_HOVER_ON_USER_PROFILE_SYMBOL, driver);
		Common.click(XPATH_MY_ACCOUNT_LINK_ON_USER_PROFILE, driver);
		System.out.println("Clicked On My Account Link");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used click on Shopping Cart Link On Dashboard Page
	 */
	public void clickOnShoppingcartLinkOnDashboardPage() {
		Common.hoverOnElement(CSS_HOVER_ON_USER_PROFILE_SYMBOL, driver);
		Common.click(XPATH_SHOPPING_CART_LINK_ON_USER_PROFILE, driver);
		System.out.println("Clicked On Shopping Cart Link");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used click on how To Link On Dashboard Page
	 */
	public void clickOnHowToLinkOnDashboardPage() {
		Common.hoverOnElement(CSS_HOVER_ON_USER_PROFILE_SYMBOL, driver);
		Common.click(XPATH_HOW_TO_ON_USER_PROFILE, driver);
		System.out.println("Clicked On How To Link");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used verify the Shopping cart page elements
	 */
	public void verifyShoppingCartPageTextElements() {
		Common.assertTextUsingEquals(
				XPATH_SHOPPING_CART_HEADING_TEXT_ON_SHOPPING_CART_PAGE,
				"Shopping Cart", driver);
		System.out
				.println("Verified the 'Shopping Cart Header Text' Is Present");
		Common.assertTextUsingEquals(XPATH_HOME_TEXT_ON_BREADCRUMB, "Home",
				driver);
		Common.assertTextUsingEquals(XPATH_SHOPPING_CART_TEXT_ON_BREADCRUMB,
				"Shopping Cart", driver);
		System.out
				.println("Verified the Bread Crumbs Home>Shopping Carts are present");
		try {
			driver.findElement(XPATH_YOUR_SHOPPING_CART_IS_EMPTY_TEXT)
					.getText().contains("Your shopping cart is empty!");
			Common.assertTextUsingEquals(
					XPATH_YOUR_SHOPPING_CART_IS_EMPTY_TEXT,
					"Your shopping cart is empty!", driver);
			System.out
					.println("Verifed The Shopping Cart empty Text is Present");
		} catch (NoSuchElementException e) {
			driver.findElement(XPTAH_PRODUCT_NAME).getText()
					.contains("Product Name");
			Common.assertTextUsingEquals(XPTAH_PRODUCT_NAME, "Product Name",
					driver);
			System.out.println("Verifed The Product Name Text Is Present");
			Common.assertTextUsingEquals(XPTAH_QUANTITY, "Quantity", driver);
			Common.assertTextUsingEquals(XPTAH_UNIT_PRICE, "Unit Price", driver);
			Common.assertTextUsingEquals(XPTAH_TOTAL, "Total", driver);
			System.out
					.println("Verifed The Product name, Quantity, Unit Price, and Total text");
		}
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used verify the My Account page elements
	 */
	public void verifyMyAccountPageTextElements() {
		Common.assertTextUsingEquals(XPATH_MY_ACCOUNT_HEADING1, "My Account",
				driver);
		System.out.println("Verified the 'My Account H1 Header' Is Present");
		Common.assertTextUsingEquals(XPATH_HOME_TEXT_BREADCRUMB, "Home", driver);
		Common.assertTextUsingEquals(XPATH_BREADCRUMB_ACCOUNT, "Account",
				driver);
		System.out
				.println("Verified the 'Home>Account Breadcrumbs' are Present");
		Common.assertTextUsingEquals(XPATH_MY_ACCOUNT_HEADING2, "My Account",
				driver);
		System.out.println("Verified the 'My Account H2 Header' Is Present");

		Common.assertTextUsingEquals(XPATH_EDIT_YOUR_ACCOUNT_INFO,
				"Edit your account information", driver);
		System.out
				.println("Verified the 'Edit your account information' Element Is Present");
		Common.assertTextUsingEquals(XPATH_CHANGEYOUR_PASSWORD,
				"Change your password", driver);
		System.out
				.println("Verified the 'Change your password' Element Is Present");
		Common.assertTextUsingEquals(XPATH_MODIFY_YOUR_ADDRESS_BOOK,
				"Modify your address book entries", driver);
		System.out
				.println("Verified the 'Modify your address book entries'Element Is Present");
		Common.assertTextUsingEquals(XPATH_MODIFY_YOUR_WISHLIST,
				"Modify your wish list", driver);
		System.out
				.println("Verified the 'Modify your wish list' Element Is Present");
		Common.assertTextUsingEquals(XPATH_MY_ORDERS_HEADING2, "My Orders",
				driver);
		System.out.println("Verified the 'My Orders' Element Is Present");
		Common.assertTextUsingEquals(XPATH_VIEW_YOUR_ORDER,
				"View your order history", driver);
		System.out
				.println("Verified the 'View your order history' Element Is Present");
		Common.assertTextUsingEquals(XPATH_PAYMENT_HISTORY, "Payment history",
				driver);
		System.out.println("Verified the 'Payment history' Element Is Present");
		Common.assertTextUsingEquals(XPATH_DOWNLOADS, "Downloads", driver);
		System.out.println("Verified the 'Downloads' Element Is Present");
		Common.assertTextUsingEquals(XPATH_MY_WALLET_UNDER_MY_ORDERS,
				"My Wallet", driver);
		System.out.println("Verified the 'My Wallet' Element Is Present");
		Common.assertTextUsingEquals(XPATH_VIEW_YOUR_RETURN_REQUESTS,
				"View your return requests", driver);
		System.out
				.println("Verified the 'View your return requests' Element Is Present");
		Common.assertTextUsingEquals(XPATH_YOUR_TRANSACTIONS,
				"Your Transactions", driver);
		System.out
				.println("Verified the 'Your Transactions' Element Is Present");
		Common.assertTextUsingEquals(XPATH_NEWSLETTER_HEADING2, "Newsletter",
				driver);
		System.out.println("Verified the 'Newsletter' Element Is Present");
		Common.assertTextUsingEquals(XPATH_SUBSCRIBE_OR_UNSUBSCRIBE,
				"Subscribe / unsubscribe to newsletter", driver);
		System.out
				.println("Verified the 'Subscribe / unsubscribe to newsletter' Element Is Present");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used verify 'Information' Section At Footer After
	 *         Login
	 */
	public void verifyFooterInformationSectionElements() {
		Common.scrollTillVisibilityOfAnElement(
				XPATH_FOOTER_INFORMATION_HEADING_H3, driver);
		System.out.println("Scrool Down The Page Untill Footer Section");
		Common.assertTextUsingEquals(XPATH_FOOTER_INFORMATION_HEADING_H3,
				"Information", driver);
		System.out.println("Verified the 'Information' Element Is Present");
		Common.assertTextUsingEquals(XPATH_FOOTER_ABOUT_US, "About Us", driver);
		System.out.println("Verified the 'About Us' Element Is Present");
		Common.assertTextUsingEquals(XPATH_FOOTER_DELIVERY_INFORMATION,
				"Delivery Information", driver);
		System.out
				.println("Verified the 'Delivery Information' Element Is Present");
		Common.assertTextUsingEquals(XPATH_FOOTER_PRIVACY_POLICY,
				"Privacy Policy", driver);
		System.out.println("Verified the 'Privacy Policy' Element Is Present");
		Common.assertTextUsingEquals(XPATH_FOOTER_TERMS_AND_CONDITIONS,
				"Terms & Conditions", driver);
		System.out
				.println("Verified the 'Terms & Conditions' Element Is Present");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used verify 'Customer Service' Section At Footer
	 *         After Login
	 */
	public void verifyFooterCustomerServiceSectionElements() {
		Common.assertTextUsingEquals(XPATH_FOOTER_CUSTOMER_SERVICE_HEADING_H3,
				"Customer Service", driver);
		System.out
				.println("Verified the 'Customer Service' Element Is Present");
		Common.assertTextUsingEquals(XPATH_FOOTER_CONTACT_US, "Contact Us",
				driver);
		System.out.println("Verified the 'Contact Us' Element Is Present");
		Common.assertTextUsingEquals(XPATH_FOOTER_RETURNS, "Returns", driver);
		System.out.println("Verified the 'Returns' Element Is Present");
		Common.assertTextUsingEquals(XPATH_FOOTER_SITE_MAP, "Site Map", driver);
		System.out.println("Verified the 'Site Map' Element Is Present");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used verify 'Extras' Section At Footer After Login
	 */
	public void verifyFooterExtrasSectionElements() {
		Common.assertTextUsingEquals(XPATH_FOOTER_EXTRAS_HEADING_H3, "Extras",
				driver);
		System.out.println("Verified the 'Extras' Element Is Present");

		Common.assertTextUsingEquals(XPATH_FOOTER_BRANDS, "Brands", driver);
		System.out.println("Verified the 'Brands' Element Is Present");
		Common.assertTextUsingEquals(XPATH_FOOTER_GIFT_VOCHERS,
				"Gift Vouchers", driver);
		System.out.println("Verified the 'Gift Vouchers' Element Is Present");
		Common.assertTextUsingEquals(XPATH_FOOTER_AFFILIATES, "Affiliates",
				driver);
		System.out.println("Verified the 'Affiliates' Element Is Present");
		Common.assertTextUsingEquals(XPATH_FOOTER_SPECIALS, "Specials", driver);
		System.out.println("Verified the 'Specials' Element Is Present");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used verify 'My Account' Section At Footer After
	 *         Login
	 */
	public void verifyFooterMyAccountSectionElements() {
		Common.assertTextUsingEquals(XPATH_FOOTER_MY_ACCOUNT_HEADING_H3,
				"My Account", driver);
		System.out
				.println("Verified the 'My Account Heading H3' Element Is Present");

		Common.assertTextUsingEquals(XPATH_FOOTER_MY_ACCOUNT, "My Account",
				driver);
		System.out.println("Verified the 'My Account' Element Is Present");
		Common.assertTextUsingEquals(XPATH_FOOTER_ORDER_HISTORY,
				"Order History", driver);
		System.out.println("Verified the 'Order History' Element Is Present");
		Common.assertTextUsingEquals(XPATH_FOOTER_WISH_LIST, "Wish List",
				driver);
		System.out.println("Verified the 'Wish List' Element Is Present");
		Common.assertTextUsingEquals(XPATH_FOOTER_NEWSLETTER, "Newsletter",
				driver);
		System.out.println("Verified the 'Newsletter' Element Is Present");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used for clicking on Edit your Account information
	 *         on My Account Page
	 */
	public void clickOnEditYourAccountInformationOnMyAccountPage() {
		Common.waitForVisibilityOfElement(XPATH_EDIT_YOUR_ACCOUNT_INFO, driver);
		Common.click(XPATH_EDIT_YOUR_ACCOUNT_INFO, driver);
		System.out
				.println("clicked On Edit Your Account Link on my Account Page");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used verify 'My Account Information H1 text and
	 *         Bread Crumbs' Section At Edit Information Page
	 */
	public void verifyMyAccountInformationPageH1AndBreadCrumbs() {
		Common.waitForPresenceOfElement(XPATH_MY_ACCOUNT_INFORMATION_H1_TEXT,
				driver);
		Common.assertTextUsingEquals(XPATH_MY_ACCOUNT_INFORMATION_H1_TEXT,
				"My Account Information", driver);
		System.out
				.println("Verified the 'My Account Information' Text Is Present");
		Common.assertTextUsingEquals(XPATH_HOME_TEXT_BREADCRUMB, "Home", driver);
		Common.assertTextUsingEquals(XPATH_ACCOUNT_TEXT_BREADCRUMB, "Account",
				driver);
		Common.assertTextUsingEquals(
				XPATH_MY_ACCOUNT_BREADCRUMB_EDIT_INFO_TEXT, "Edit Information",
				driver);
		System.out
				.println("Verified the 'Home, Account, Edit Information Bread Crumbs' are Present");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used verify 'Your Personal Details' Section At My
	 *         Account Information
	 */
	public void verifyYourPersonalDetailsSection() {
		Common.assertTextUsingEquals(XPATH_YOUR_PERSONAL_DETAILS_TEXT,
				"Your Personal Details", driver);
		System.out
				.println("Verified the 'Your Personal Details' Element Is Present");
		Common.assertTextUsingEquals(XPATH_CONTACT_PERSON_NAME,
				"Contact person Name: *", driver);
		System.out
				.println("Verified the 'Contact person Name: *' Text Is Present");
		Common.waitForPresenceOfElement(XPATH_CONTACT_PERSON_NAME_VALUE, driver);
		System.out
				.println("Verified the 'Test Account Value' Element Is Present");
		Common.assertTextUsingEquals(XPATH_EMAIL, "E-Mail: *", driver);
		System.out.println("Verified the 'E-Mail: *' Text Is Present");
		Common.waitForPresenceOfElement(XPATH_EMAIL_VALUE, driver);
		System.out.println("Verified the 'Email Id Value' Element Is Present");
		Common.assertTextUsingEquals(XPATH_TELEPHONE, "Telephone: *", driver);
		System.out.println("Verified the 'Telephone: *' Text Is Present");
		Common.waitForPresenceOfElement(XPATH_TELEPHONE_VALUE, driver);
		System.out.println("Verified the 'Telephone Value' Element Is Present");
		Common.assertTextUsingEquals(XPATH_FAX, "Fax:", driver);
		System.out.println("Verified the 'Fax:' Text Is Present");
		Common.waitForPresenceOfElement(XPATH_FAX_VALUE, driver);
		System.out.println("Verified the 'Fax Value' Element Is Present");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used verify 'Your Distributor' Section At My
	 *         Account Information Page
	 */
	public void verifyYourDistributorSection() {
		Common.assertTextUsingEquals(XPATH_YOUR_DISTRIBUTOR_TEXT,
				"Your Distributor", driver);
		System.out.println("Verified the 'Your Distributor' Text Is Present");
		Common.assertTextUsingEquals(XPATH_OM_TELECOM_TEXT, "OM Telecom",
				driver);
		System.out.println("Verified the 'OM Telecom' Text Is Present");
		Common.assertTextUsingEquals(XPATH_PRAKASH_TELECOM_TEXT,
				"Prakash Telecom", driver);
		System.out.println("Verified the 'Prakash Telecom' Text Is Present");
		Common.assertTextUsingEquals(XPATH_AM_MOBILES_TEXT, "AM Mobiles",
				driver);
		System.out.println("Verified the 'AM Mobiles' Text Is Present");
		Common.assertTextUsingEquals(XPATH_SS_ENTERPRISES_TEXT,
				"SS Enterprises", driver);
		System.out.println("Verified the 'SS Enterprises' Text Is Present");
		Common.assertTextUsingEquals(XPATH_NOTE,
				"Note: Touch / Click salesman name to edit them.", driver);
		System.out.println("Verifed The Note Text is present");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used Editing the Personal Details
	 */
	public void editingThePersonalDetails() {
		Common.click(XPATH_CONTACT_PERSON_NAME_VALUE, driver);
		System.out.println("clicking on Person Name Field");
		Common.clear(XPATH_CONTACT_PERSON_NAME_VALUE, driver);
		System.out.println("Clearing the Person Name Field");
		Common.input(XPATH_CONTACT_PERSON_NAME_VALUE, "Test Account", driver);
		System.out.println("Entering the Person Name as Test Account");
		Common.click(XPATH_EMAIL_VALUE, driver);
		System.out.println("clicking on Email Id Field");
		Common.clear(XPATH_EMAIL_VALUE, driver);
		System.out.println("Clearing the Email Id Field");
		Common.input(XPATH_EMAIL_VALUE, "kpr.kkt@gmail.com", driver);
		System.out.println("Entering the Email id as kpr.kkt@gmail.com");
		Common.click(XPATH_TELEPHONE_VALUE, driver);
		System.out.println("clicking on Telephone number Field");
		Common.clear(XPATH_TELEPHONE_VALUE, driver);
		System.out.println("Clearing the Telephone Number Field");
		Common.input(XPATH_TELEPHONE_VALUE, "9177389573", driver);
		System.out.println("Entering the Telephone number as 9177389573");
		Common.scrollTillVisibilityOfAnElement(
				XPATH_CONTINUE_BUTTON_ON_MY_INFO_PAGE, driver);
		System.out.println("Scrooling the page until get the Continue button");
		Common.click(XPATH_CONTINUE_BUTTON_ON_MY_INFO_PAGE, driver);
		System.out.println("Clicking on Continue Button");
		Common.waitForVisibilityOfElement(XPATH_SUCCESSFULLY_UPDATED_MESSGAE,
				driver);
		Common.assertTextUsingEquals(XPATH_SUCCESSFULLY_UPDATED_MESSGAE,
				"Success: Your account has been successfully updated.", driver);
		System.out.println("Verify the Successfully update message text");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used for clicking on Change Your Password on My
	 *         Account Page
	 */
	public void clickOnChangeYourPasswordOnMyAccountPage() {
		Common.waitForVisibilityOfElement(XPATH_CHANGEYOUR_PASSWORD, driver);
		Common.click(XPATH_CHANGEYOUR_PASSWORD, driver);
		System.out
				.println("clicked On Change your Password Link on my Account Page");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used for verifying the change password h1 text and
	 *         bread crumb elements
	 */
	public void verifyChangeYourPasswordH1TextAndBreadCrumbElements() {
		Common.waitForVisibilityOfElement(XPATH_CHANGEPASSWORD_H1_TEXT, driver);
		Common.assertTextUsingEquals(XPATH_CHANGEPASSWORD_H1_TEXT,
				"Change Password", driver);
		System.out.println("Verified the Change Password Text Is present");
		Common.assertTextUsingEquals(XPATH_HOME_TEXT_BREADCRUMB, "Home", driver);
		Common.assertTextUsingEquals(XPATH_ACCOUNT_TEXT_BREADCRUMB, "Account",
				driver);
		Common.assertTextUsingEquals(XPATH_CHANGEPASSWORD_BREADCRUMB,
				"Change Password", driver);
		System.out
				.println("Verified the Home>Account>Change Password Bread crumbs elements are present");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used for verifying the Your Password section
	 *         Elements
	 */
	public void verifyYourPasswordSectionElements() {
		Common.assertTextUsingEquals(XPATH_YOUR_PASSWORD, "Your Password",
				driver);
		System.out.println("Verified the Your Password Text Is present");
		Common.assertTextUsingEquals(XPATH_EMAIL_ID_FIELD, "Email:", driver);
		System.out.println("Verified the Email: Text Is present");
		Common.waitForPresenceOfElement(XPATH_EMAIL_ID_FIELD_VALUE, driver);
		System.out
				.println("Verified the Email id field value element Is present");
		Common.assertTextUsingEquals(XPATH_PASSWORD_FIELD, "Password: *",
				driver);
		System.out.println("Verified the Password: * Text Is present");
		Common.waitForPresenceOfElement(XPATH_PASSWORD_FIELD_VALUE, driver);
		System.out
				.println("Verified the Password field value element Is present");
		Common.assertTextUsingEquals(XPATH_PASSWORD_CONFIRM_FIELD,
				"Password Confirm: *", driver);
		System.out.println("Verified the Password Confirm: * Text Is present");
		Common.waitForPresenceOfElement(XPATH_PASSWORD_CONFIRM_FIELD_VALUE,
				driver);
		System.out
				.println("Verified the Password Confirm field value element Is present");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used for changing the password field
	 */
	public void changingTheNewPassword() {
		Common.click(XPATH_PASSWORD_FIELD_VALUE, driver);
		System.out.println("Clicking on the Password field value");
		Common.clear(XPATH_PASSWORD_FIELD_VALUE, driver);
		System.out.println("Clearing the Password field value");
		Common.input(XPATH_PASSWORD_FIELD_VALUE, "password", driver);
		System.out.println("Enterning the Password field as 'password'");

		Common.click(XPATH_PASSWORD_CONFIRM_FIELD_VALUE, driver);
		System.out.println("Clicking on the Password confirm field value");
		Common.clear(XPATH_PASSWORD_CONFIRM_FIELD_VALUE, driver);
		System.out.println("Clearing the Password confirm field value");
		Common.input(XPATH_PASSWORD_CONFIRM_FIELD_VALUE, "password", driver);
		System.out
				.println("Enterning the Password confirm field as 'password'");
		Common.click(XPATH_CONTINUE_BUTTON_ON_CHANGE_PASSWORD_PAGE, driver);
		System.out.println("Clicking on Continue Button");
		Common.waitForPresenceOfElement(XPATH_SUCCESSFULLY_UPDATED_MESSGAE,
				driver);
		Common.assertTextUsingEquals(XPATH_SUCCESSFULLY_UPDATED_MESSGAE,
				"Success: Your password has been successfully updated.", driver);
		System.out.println("Veirified the successfully updated message");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used for clicking the Modify your address book
	 *         entries link
	 */
	public void clickOnModifyYourAddressBookEntriesOnMyAccountPage() {
		Common.waitForVisibilityOfElement(XPATH_MODIFY_YOUR_ADDRESS_BOOK,
				driver);
		Common.click(XPATH_MODIFY_YOUR_ADDRESS_BOOK, driver);
		System.out
				.println("clicked On Change your Password Link on my Account Page");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used for verifying the Address Book H1 text and
	 *         Bread crumbs
	 */
	public void verifyAddresBookH1TextAndBreadCrumbs() {
		Common.waitForVisibilityOfElement(XPATH_ADDRESS_BOOK_H1_TEXT, driver);
		Common.assertTextUsingEquals(XPATH_ADDRESS_BOOK_H1_TEXT,
				"Address Book", driver);
		System.out.println("Verifed the Address Book H1 Text");
		Common.assertTextUsingEquals(XPATH_HOME_TEXT_BREADCRUMB, "Home", driver);
		Common.assertTextUsingEquals(XPATH_ACCOUNT_TEXT_BREADCRUMB, "Account",
				driver);
		Common.assertTextUsingEquals(XPATH_ADDRESS_BOOK_BREAD_CRUMB,
				"Address Book", driver);
		System.out
				.println("Verifed the Home>Account>Address Book Bread crumbs");
	}

	/**
	 * @author Srikanth.k
	 * 
	 *         This method is used for verifying the Address Book Entries Text
	 */
	public void verifyAddresBookEntriesSection() {
		Common.assertTextUsingEquals(XPATH_ADDRESS_BOOK_BREAD_ENTRIES_TEXT,
				"Address Book Entries", driver);
		System.out.println("Verified the Address Book Entries Text is present");
		Common.assertTextUsingEquals(
				XPATH_ADDRESS_FIELD_VALUE,
				"Badri pvt ltd\nBadri pvt ltd\nMarathahalli, Bangalore\nBangalore 560037\nKarnataka\nIndia",
				driver);
		System.out
				.println("Verified the Address Book Entries Text value is present");
	}

}