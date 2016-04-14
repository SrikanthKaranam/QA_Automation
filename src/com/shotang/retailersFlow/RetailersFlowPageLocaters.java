package com.shotang.retailersFlow;

import org.openqa.selenium.By;

/**
 * @author srikanth.k
 * 
 *         This class consists of all Locators related to the Shotang Home Page
 */

public class RetailersFlowPageLocaters {

	// **************************** Home Page ********************************
	public static final By XPATH_SIGN_IN_BUTTON = By
			.xpath(".//*[@id='custom-dropdown']/a");
	public static final By XPATH_EMAIL_ID = By.xpath(".//*[@id='login-email']");
	public static final By XPATH_PASSWORD = By
			.xpath(".//*[@id='login-password']");
	public static final By XPATH_GO = By.xpath(".//*[@id='login-go']");
	public static final By XPATH_FORGOT_EMAILID_OR_PASSWORD = By
			.xpath(".//*[@id='need-help']");
	public static final By XPATH_INVALID_EMAILID_OR_PASSWORD_ERROR_TEXT = By
			.xpath("//span[text()=' Invalid Email/Password']");

	// ************************** Dashboard Page ******************************
	public static final By XPATH_RETAILERS_COMPANY_NAME = By
			.xpath(".//*[@id='welcome']/a[1]");
	public static final By XPATH_ORDER_BY_BRANDS = By
			.xpath(".//*[@id='intro_brand_name']/a");
	public static final By XPATH_ORDER_BY_CATEGORIES = By
			.xpath(".//*[@id='intro_cat_mega_name']/a");
	public static final By XPATH_MY_WALLET = By
			.xpath(".//*[@id='intro_reward']/a");
	public static final By XPATH_LOG_OUT = By.xpath("//a[text()='Logout']");

	// ******************** Dashboard Page On User Profile ********************

	public static final By CSS_HOVER_ON_USER_PROFILE_SYMBOL = By
			.cssSelector(".dd-hdl");
	public static final By XPATH_MY_ACCOUNT_LINK_ON_USER_PROFILE = By
			.xpath("//div[2]/div[2]/ul/li[2]/a");
	public static final By XPATH_SHOPPING_CART_LINK_ON_USER_PROFILE = By
			.xpath("//a[text()='Shopping Cart']");
	public static final By XPATH_HOW_TO_ON_USER_PROFILE = By
			.xpath("//a[text()='How To']");

	// **************************Order By Brands *****************************
	public static final By XPATH_NOKIA_BRAND_TEXT = By
			.xpath("//strong[text()='Nokia']");
	public static final By XPATH_CELKON_BRAND_TEXT = By
			.xpath("//strong[text()='Celkon']");
	public static final By XPATH_INTEX_BRAND_TEXT = By
			.xpath("//strong[text()='Intex']");
	public static final By XPATH_LAVA_BRAND_TEXT = By
			.xpath("//strong[text()='Lava']");
	public static final By XPATH_VIVO_BRAND_TEXT = By
			.xpath("//strong[text()='Vivo']");
	public static final By XPATH_MICROMAX_BRAND_TEXT = By
			.xpath("//strong[text()='Micromax']");
	public static final By XPATH_SAMSUNG_BRAND_TEXT = By
			.xpath("//strong[text()='Samsung']");
	public static final By XPATH_PANASONIC_BRAND_TEXT = By
			.xpath("//strong[text()='Panasonic']");
	public static final By XPATH_XOLO_BRAND_TEXT = By
			.xpath("//strong[text()='Xolo']");
	public static final By XPATH_SANSUI_BRAND_TEXT = By
			.xpath("//strong[text()='Sansui']");
	public static final By XPATH_VIDEOCON_BRAND_TEXT = By
			.xpath("//strong[text()='Videocon']");
	public static final By XPATH_SWIPE_BRAND_TEXT = By
			.xpath("//strong[text()='Swipe']");
	public static final By XPATH_SPICE_BRAND_TEXT = By
			.xpath("//strong[text()='Spice']");
	public static final By XPATH_LENOVO_BRAND_TEXT = By
			.xpath("//strong[text()='Lenovo']");
	public static final By XPATH_LG_MOBILES_BRAND_TEXT = By
			.xpath("//strong[text()='LG Mobiles']");
	public static final By XPATH_KARBONN_BRAND_TEXT = By
			.xpath("//strong[text()='Karbonn']");
	public static final By XPATH_IBALL_BRAND_TEXT = By
			.xpath("//strong[text()='I Ball']");
	public static final By XPATH_HUAWEI_BRAND_TEXT = By
			.xpath("//strong[text()='Huawei']");
	public static final By XPATH_HTC_BRAND_TEXT = By
			.xpath("//strong[text()='HTC']");
	public static final By XPATH_DATAWIND_BRAND_TEXT = By
			.xpath("//strong[text()='Datawind']");
	public static final By XPATH_SONY_BRAND_TEXT = By
			.xpath("//strong[text()='Sony']");
	public static final By XPATH_GIONEE_BRAND_TEXT = By
			.xpath("//strong[text()='Gionee']");
	public static final By XPATH_RAGE_BRAND_TEXT = By
			.xpath("//strong[text()='Rage']");
	public static final By XPATH_GRAVITI_BRAND_TEXT = By
			.xpath("//strong[text()='Graviti']");
	public static final By XPATH_RELIANCE_JIO_BRAND_TEXT = By
			.xpath("//strong[text()='Reliance Jio']");
	public static final By XPATH_COPPER_BRAND_TEXT = By
			.xpath("//strong[text()='Copper']");
	public static final By XPATH_ZEDDI_S_LINE_BRAND_TEXT = By
			.xpath("//strong[text()='Zeddi S-Line']");
	public static final By XPATH_INFOCUS_BRAND_TEXT = By
			.xpath("//strong[text()='Infocus']");
	public static final By XPATH_ZIOX_BRAND_TEXT = By
			.xpath("//strong[text()='ZioX']");
	public static final By XPATH_ZTE_BRAND_TEXT = By
			.xpath("//strong[text()='ZTE']");

	// **************************Order By Categories ***************************

	public static final By XPATH_CATEGORIES_AS_TELECOM = By
			.xpath("//span[text()='Telecom']");

	// **************************Order By Sub Categories **********************
	public static final By XPATH_SUB_CATEGORIE_AS_ACCESSORIES = By
			.xpath("//a[text()='Accessories']");
	public static final By XPATH_SUB_CATEGORIE_AS_BOOK_COVERS = By
			.xpath("//a[text()='Book Covers']");
	public static final By XPATH_SUB_CATEGORIE_AS_CAR_ACCESSORIES = By
			.xpath("//a[text()='Car Accessories']");
	public static final By XPATH_SUB_CATEGORIE_AS_POWER_BANK = By
			.xpath("//a[text()='Power Bank']");
	public static final By XPATH_SUB_CATEGORIE_AS_SCREEN_GUARD = By
			.xpath("//a[text()='Screen Guard']");
	public static final By XPATH_SUB_CATEGORIE_AS_TABLETS = By
			.xpath("//a[text()='Tablets']");
	public static final By XPATH_SUB_CATEGORIE_AS_MOBILES = By
			.xpath("//a[text()='Mobiles']");
	public static final By XPATH_SUB_CATEGORIE_AS_HEADSETS_AND_SPEAKER = By
			.xpath("//a[text()='Headsets & Speaker']");
	public static final By XPATH_SUB_CATEGORIE_AS_MOBILE_COVERS = By
			.xpath("//a[text()='Mobile Covers']");
	public static final By XPATH_SUB_CATEGORIE_AS_CHARGERS = By
			.xpath("//a[text()='Chargers']");
	public static final By XPATH_SUB_CATEGORIE_AS_BATTERIES = By
			.xpath("//a[text()='Batteries']");

	// **************************Order By Brands ******************************
	public static final By XPATH_NOKIA_BRAND = By.xpath("//a[@title='Nokia']");

	// **************************Brands Page***********************************
	public static final By XPATH_H1_TEXT = By.xpath("//h1");
	public static final By XPATH_SELLER_TYPE = By
			.xpath(".//*[@id='35_7394_49']");
	public static final By XPATH_SELECT_DISTRIBUTOR_TYPE_AS_TEST_SELLER_FORNOKIA = By
			.xpath("//option[@value='40_11043_49']");
	public static final By XPATH_SELECT_WHOLESALLER_TYPE_AS_AM_MOBILES_FOR_NOKIA = By
			.xpath("//option[@value='36_9984_49']");
	public static final By XPATH_SELECT_QUANTITY = By
			.xpath(".//*[@id='products']/div[1]/div/div[2]/table/tbody/tr[2]/td/table/tbody/tr[1]/td[3]/input");
	public static final By XPATH_ADD_TO_CART = By
			.xpath(".//*[@id='content']/div[3]/div[3]/div[3]/input");
	public static final By XPATH_CART_TOTAL = By
			.xpath(".//*[@id='cart-total']");
	public static final By XPATH_VIEW_CART = By
			.xpath("//a[text()='View Cart']");
	public static final By XPATH_SHOPPING_CART_TEXT = By.xpath("//h1");
	public static final By XPATH_CASH_ON_DELEVERY_OPTION = By
			.xpath("//label/input");
	public static final By XPATH_PLACE_ORDER_BUTTON = By
			.xpath("//a[text()='Place Order']");
	public static final By XPATH_ORDER_PLACED_MESSAGE = By
			.xpath("//strong[text()='Your Order Has Been Placed!']");
	public static final By XPATH_SORT_BY = By.xpath("//b[text()='Sort By:']");
	public static final By XPATH_SHOW = By.xpath("//b[text()='Show:']");
	public static final By XPATH_SELLERS_TEXT = By
			.xpath("//div[text()='Sellers']");

	// **********************Categories As AccessoriesPage*********************
	public static final By XPATH_CATEGORIES_ON_ACCESSORIES = By
			.xpath("//div[text()='Categories']");
	public static final By XPATH_APPARELS_ON_ACCESSORIES = By
			.xpath("//a[text()='Apparels']");
	public static final By XPATH_TELECOM_ON_ACCESSORIES = By
			.xpath(".//*[@id='column-left']/div[1]/div[2]/div/ul/li[2]/a");
	public static final By XPATH_SELLERS_ON_ACCESSORIES = By
			.xpath("//div[text()='Sellers']");
	public static final By XPATH_ACCESSORIES_HEADING_H1_ON_ACCESSORIES = By
			.xpath("//strong[text()='Accessories']");
	public static final By XPATH_TELECOM_ON_BREADCRUMB = By
			.xpath(".//*[@id='content']/div[3]/div[1]/div/a[2]");
	public static final By XPATH_ACCESSORIES_ON_BREADCRUMB = By
			.xpath(".//*[@id='content']/div[3]/div[1]/div/a[3]");

	public static final By XPATH_SELECT_DISTRIBUTOR_TYPE_AS_TEST_SELLER_FOR_TELECOM_ACCESSERIES = By
			.xpath("//option[@value='40_10737_55']");
	public static final By XPATH_SELECT_WHOLESALER_AS_SS_ENTERPRISES_FOR_TELECOME_ACCESSORIES = By
			.xpath("//option[@value='35_6903_55']");

	// ************************** My Wallet Page*******************************
	public static final By XPATH_MY_WALLET_LINK = By
			.xpath("//a[@title='My Wallet']");
	public static final By XPATH_YOUR_WALLET_TEXT = By
			.xpath("//strong[text()='Your Wallet']");
	public static final By XPATH_HOME_TEXT_BREADCRUMB = By
			.xpath("//a[text()='Home']");
	public static final By XPATH_ACCOUNT_TEXT_BREADCRUMB = By
			.xpath("//a[text()='Account']");
	public static final By XPATH_WALLET_TEXT_BREADCRUMB = By
			.xpath("//a[text()='Wallet']");
	public static final By XPATH_TOTAL_WALLET_ELEMENT = By.xpath("//div[2]/p");
	public static final By XPATH_DATE_ADDED_TEXT = By
			.xpath("//td[text()='Date Added']");
	public static final By XPATH_DESCRIPTION_TEXT = By
			.xpath("//td[text()='Description']");
	public static final By XPATH_AMOUNT_TEXT = By
			.xpath("//td[text()='Amount(+/- Rs.)']");
	public static final By XPATH_CONTINUE_BUTTON = By
			.xpath("//a[text()='Continue']");

	// ************************** My Account Page*******************************
	public static final By XPATH_MY_ACCOUNT_HEADING1 = By.xpath("//h1");
	public static final By XPATH_BREADCRUMB_ACCOUNT = By
			.xpath("//a[text()='Account']");
	public static final By XPATH_MY_ACCOUNT_HEADING2 = By
			.xpath("//h2[text()='My Account']");
	public static final By XPATH_EDIT_YOUR_ACCOUNT_INFO = By
			.xpath("//a[text()='Edit your account information']");
	public static final By XPATH_CHANGEYOUR_PASSWORD = By
			.xpath("//a[text()='Change your password']");
	public static final By XPATH_MODIFY_YOUR_ADDRESS_BOOK = By
			.xpath("//a[text()='Modify your address book entries']");
	public static final By XPATH_MODIFY_YOUR_WISHLIST = By
			.xpath("//a[text()='Modify your wish list']");
	public static final By XPATH_MY_ORDERS_HEADING2 = By
			.xpath("//h2[text()='My Orders']");
	public static final By XPATH_VIEW_YOUR_ORDER = By
			.xpath("//a[text()='View your order history']");
	public static final By XPATH_PAYMENT_HISTORY = By
			.xpath("//a[text()='Payment history']");
	public static final By XPATH_DOWNLOADS = By
			.xpath("//a[text()='Downloads']");
	public static final By XPATH_MY_WALLET_UNDER_MY_ORDERS = By
			.xpath("//a[text()='My Wallet']");
	public static final By XPATH_VIEW_YOUR_RETURN_REQUESTS = By
			.xpath("//a[text()='View your return requests']");
	public static final By XPATH_YOUR_TRANSACTIONS = By
			.xpath("//a[text()='Your Transactions']");
	public static final By XPATH_NEWSLETTER_HEADING2 = By
			.xpath("//h2[text()='Newsletter']");
	public static final By XPATH_SUBSCRIBE_OR_UNSUBSCRIBE = By
			.xpath("//a[text()='Subscribe / unsubscribe to newsletter']");

	// ************************* Shopping Cart Page ****************************
	public static final By XPATH_SHOPPING_CART_HEADING_TEXT_ON_SHOPPING_CART_PAGE = By
			.xpath("//strong[text()='Shopping Cart']");
	public static final By XPATH_SHOPPING_CART_TEXT_ON_BREADCRUMB = By
			.xpath("//div[2]/div[1]/div/a[2]");
	public static final By XPATH_HOME_TEXT_ON_BREADCRUMB = By
			.xpath("//a[text()='Home']");
	public static final By XPATH_YOUR_SHOPPING_CART_IS_EMPTY_TEXT = By
			.xpath("//p[text()='Your shopping cart is empty!']");
	public static final By XPATH_CONTINUE_BUTTON_ON_SHOPPING_CART_PAGE = By
			.xpath("//a[text()='Continue']");
	public static final By XPATH_FREE_DELEVEY_BY_TODAY_TEXT = By
			.xpath("//h[contains(text(),'Free delivery by Today')]");
	public static final By XPTAH_PRODUCT_NAME = By
			.xpath(".//*[@id='thead']/td[1]");
	public static final By XPTAH_QUANTITY = By.xpath(".//*[@id='thead']/td[3]");
	public static final By XPTAH_UNIT_PRICE = By
			.xpath(".//*[@id='thead']/td[4]");
	public static final By XPTAH_TOTAL = By.xpath(".//*[@id='thead']/td[5]");

	// ***********************Footer Page After Login***************************
	public static final By XPATH_FOOTER_INFORMATION_HEADING_H3 = By
			.xpath("//h3[text()='Information']");
	public static final By XPATH_FOOTER_ABOUT_US = By
			.xpath("//a[text()='About Us']");
	public static final By XPATH_FOOTER_DELIVERY_INFORMATION = By
			.xpath("//a[text()='Delivery Information']");
	public static final By XPATH_FOOTER_PRIVACY_POLICY = By
			.xpath("//a[text()='Privacy Policy']");
	public static final By XPATH_FOOTER_TERMS_AND_CONDITIONS = By
			.xpath("//a[text()='Terms & Conditions']");

	public static final By XPATH_FOOTER_CUSTOMER_SERVICE_HEADING_H3 = By
			.xpath("//h3[text()='Customer Service']");
	public static final By XPATH_FOOTER_CONTACT_US = By
			.xpath("//a[text()='Contact Us']");
	public static final By XPATH_FOOTER_RETURNS = By
			.xpath("//a[text()='Returns']");
	public static final By XPATH_FOOTER_SITE_MAP = By
			.xpath("//a[text()='Site Map']");

	public static final By XPATH_FOOTER_EXTRAS_HEADING_H3 = By
			.xpath("//h3[text()='Extras']");
	public static final By XPATH_FOOTER_BRANDS = By
			.xpath("//a[text()='Brands']");
	public static final By XPATH_FOOTER_GIFT_VOCHERS = By
			.xpath("//a[text()='Gift Vouchers']");
	public static final By XPATH_FOOTER_AFFILIATES = By
			.xpath("//a[text()='Affiliates']");
	public static final By XPATH_FOOTER_SPECIALS = By
			.xpath("//a[text()='Specials']");

	public static final By XPATH_FOOTER_MY_ACCOUNT_HEADING_H3 = By
			.xpath("//h3[text()='My Account']");
	public static final By XPATH_FOOTER_MY_ACCOUNT = By
			.xpath(".//*[@id='footer']/div[4]/ul/li[1]/a");
	public static final By XPATH_FOOTER_ORDER_HISTORY = By
			.xpath("//a[text()='Order History']");
	public static final By XPATH_FOOTER_WISH_LIST = By
			.xpath("//a[text()='Wish List']");
	public static final By XPATH_FOOTER_NEWSLETTER = By
			.xpath("//a[text()='Newsletter']");

	// ************************ My Account Information**************************
	public static final By XPATH_MY_ACCOUNT_INFORMATION_H1_TEXT = By
			.xpath("//strong[text()='My Account Information']");
	public static final By XPATH_MY_ACCOUNT_BREADCRUMB_EDIT_INFO_TEXT = By
			.xpath("//a[text()='Edit Information']");
	public static final By XPATH_YOUR_PERSONAL_DETAILS_TEXT = By
			.xpath("//h2[text()='Your Personal Details']");
	public static final By XPATH_CONTACT_PERSON_NAME = By
			.xpath("//div[2]/form/div[1]/table/tbody/tr[1]/td[1]");
	public static final By XPATH_CONTACT_PERSON_NAME_VALUE = By
			.xpath("//input[@name='firstname']");
	public static final By XPATH_EMAIL = By
			.xpath("//div[2]/form/div[1]/table/tbody/tr[2]/td[1]");
	public static final By XPATH_EMAIL_VALUE = By
			.xpath("//input[@value='kpr.kkt@gmail.com']");
	public static final By XPATH_TELEPHONE = By
			.xpath("//div[2]/form/div[1]/table/tbody/tr[3]/td[1]");
	public static final By XPATH_TELEPHONE_VALUE = By
			.xpath("//input[@value='9177389573']");
	public static final By XPATH_FAX = By
			.xpath("//div[2]/form/div[1]/table/tbody/tr[4]/td[1]");
	public static final By XPATH_FAX_VALUE = By.xpath("//input[@value='']");
	public static final By XPATH_YOUR_DISTRIBUTOR_TEXT = By
			.xpath("//h2[text()='Your Distributor']");
	public static final By XPATH_TEST_DISTRIBUTOR_TEXT = By
			.xpath("//span[text()='test distributor pvt ltd']");
	public static final By XPATH_TEST_SELLER_FIRM_TEXT = By
			.xpath("//span[text()='test seller firm']");
	public static final By XPATH_OM_TELECOM_TEXT = By
			.xpath("//span[text()='OM Telecom']");
	public static final By XPATH_PRAKASH_TELECOM_TEXT = By
			.xpath("//span[text()='Prakash Telecom']");
	public static final By XPATH_AM_MOBILES_TEXT = By
			.xpath("//span[text()='AM Mobiles']");
	public static final By XPATH_SS_ENTERPRISES_TEXT = By
			.xpath("//span[text()='SS Enterprises']");
	public static final By XPATH_NOTE = By
			.xpath(".//*[@id='your_distributor']/div/span[1]");
	public static final By XPATH_CONTINUE_BUTTON_ON_MY_INFO_PAGE = By
			.xpath(".//*[@id='continueButton']");
	public static final By XPATH_SUCCESSFULLY_UPDATED_MESSGAE = By
			.xpath(".//*[@id='content']/div[2]/div[3]");

	// ************************** Change Password*******************************
	public static final By XPATH_CHANGEPASSWORD_H1_TEXT = By
			.xpath("//strong[text()='Change Password']");
	public static final By XPATH_CHANGEPASSWORD_BREADCRUMB = By
			.xpath("//a[text()='Change Password']");
	public static final By XPATH_YOUR_PASSWORD = By
			.xpath("//h2[text()='Your Password']");
	public static final By XPATH_EMAIL_ID_FIELD = By
			.xpath("//td[text()='Email:']");
	public static final By XPATH_EMAIL_ID_FIELD_VALUE = By
			.xpath("//input[@disabled='true']");
	public static final By XPATH_PASSWORD_FIELD = By
			.xpath("//td[text()='Password: ']");
	public static final By XPATH_PASSWORD_FIELD_VALUE = By
			.xpath("//input[@name='password']");
	public static final By XPATH_PASSWORD_CONFIRM_FIELD = By
			.xpath("//td[text()='Password Confirm: ']");
	public static final By XPATH_PASSWORD_CONFIRM_FIELD_VALUE = By
			.xpath("//input[@name='confirm']");
	public static final By XPATH_CONTINUE_BUTTON_ON_CHANGE_PASSWORD_PAGE = By
			.xpath("//input[@value='Continue']");

	// ******************** Modify your address book entries********************
	public static final By XPATH_ADDRESS_BOOK_H1_TEXT = By
			.xpath("//strong[text()='Address Book']");
	public static final By XPATH_ADDRESS_BOOK_BREAD_CRUMB = By
			.xpath("//a[text()='Address Book']");
	public static final By XPATH_ADDRESS_BOOK_BREAD_ENTRIES_TEXT = By
			.xpath("//h2[text()='Address Book Entries']");
	public static final By XPATH_ADDRESS_FIELD_VALUE = By
			.xpath(".//*[@id='content']/div[2]/div[3]/ul/li");

	// ********************** Order By Search For Wholesaler ******************
	public static final By XPATH_SEARCH_BOX = By
			.xpath("//input[@placeholder='Search']");
	public static final By XPATH_SELECT_LAVA_ATOM_IN_DROPDOWN = By
			.xpath("//a[text()='Lava ATOM 2  Silicon Case (Zeddi S-Line)']");
	public static final By XPATH_LAVA_ATOM_2_SILICON_H1_TEXT = By
			.xpath("//strong[text()='Lava ATOM 2  Silicon Case']");
	public static final By XPATH_LAVA_ATOM_2_SILICON_BREADCRUMB = By
			.xpath(".//*[@id='content']/div[3]/div[1]/div/a[2]");

	public static final By XPATH_WHOLESALER_TEXT = By
			.xpath("//td[text()='Wholesaler:']");
	public static final By XPATH_PRAKASH_TELECOM_TEXT_ON_SEARCH_PAGE = By
			.xpath("//td[text()='Prakash Telecom']");
	public static final By XPATH_BLACK_TEXT = By.xpath("//td[text()='Black:']");
	public static final By XPATH_BLACK_QUANTITY = By
			.xpath(".//*[@id='products']/div[2]/table/tbody/tr[1]/td[4]/input");
	public static final By XPATH_RED_TEXT = By.xpath("//td[text()='Red:']");
	public static final By XPATH_RED_QUANTITY = By
			.xpath(".//*[@id='products']/div[2]/table/tbody/tr[2]/td[4]/input");
	public static final By XPATH_BLUE_TEXT = By.xpath("//td[text()='Blue:']");
	public static final By XPATH_BLUE_QUANTITY = By
			.xpath(".//*[@id='products']/div[2]/table/tbody/tr[3]/td[4]/input");
	public static final By XPATH_PURPLE_TEXT = By
			.xpath("//td[text()='Purple:']");
	public static final By XPATH_PURPLE_QUANTITY = By
			.xpath(".//*[@id='products']/div[2]/table/tbody/tr[4]/td[4]/input");
	public static final By XPATH_CLICK_ADD_TO_CART = By
			.xpath(".//*[@id='button-cart']");

	// ********************** Order By Search For Distributor ******************
	public static final By XPATH_SELECTING_DISTRIBUTOR_PRODUCT_DROPDOWN = By
			.xpath(".//*[@id='livesearch_search_results']/li[1]/a");
	public static final By XPATH_C180CELKON_H1_TEXT = By
			.xpath("//strong[text()='C180(Celkon)']");
	public static final By XPATH_C180CELKON_BREADCRUMB = By
			.xpath(".//*[@id='content']/div[3]/div[1]/div/a[2]");
	public static final By XPATH_DISTRIBUTOR_TEXT = By
			.xpath("//td[text()='Distributor:']");
	public static final By XPATH_TEST_SELLERS_TEXT_ON_CELKON = By
			.xpath("//td[text()='test seller']");
	public static final By XPATH_BLACK_QUANTITY_FOR_DISRTIBUTOR = By
			.xpath(".//*[@id='products']/div[2]/table/tbody/tr/td[4]/input");

	// ************************* Login User Details*****************************
	public static final String RETAILERS_EMAIL_ID = "kpr.kkt@gmail.com";
	public static final String RETAILERS_PASSWORD = "password";

	public static final String RETAILERS_WRONG_EMAIL_ID = "kpr.kt@kmail.com";
	public static final String RETAILERS_WRONG_PASSWORD = "passwords";

	public static final String DISTRIBUTOR_EMAIL_ID = "srikanth_test_seller";
	public static final String DISTRIBUTOR_PASSWORD = "shotang";
}
