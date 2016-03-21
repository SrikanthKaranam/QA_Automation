package com.shotang.homepage;

import org.openqa.selenium.By;

/**
 * @author srikanth.k
 * 
 *         This class consists of all Locators related to the Shotang Home Page
 */

public class HomePageLocaters {

	// **************************** Home Page ********************************
	public static final By XPATH_SHOTANG_LOGO = By
			.xpath("//img[@class='img-responsive logo']");
	public static final By XPATH_WE_ARE_HIRING = By
			.xpath("//a[@class='careers']");
	public static final By XPATH_SELL_ON_SHOTANG = By
			.xpath("//a[@class='sell-on-shotang']");
	public static final By XPATH_ABOUT_US = By
			.xpath("//a[@class='about-us']");
	public static final By XPATH_CONTACT_US = By
			.xpath("//a[@class='contact-us']");
	public static final By XPATH_SIGN_IN_BUTTON = By
			.xpath(".//*[@id='custom-dropdown']/a");
	public static final By XPATH_EMAIL_ID = By
			.xpath(".//*[@id='login-email']");
	public static final By XPATH_PASSWORD = By
			.xpath(".//*[@id='login-password']");
	public static final By XPATH_GO = By.xpath(".//*[@id='login-go']");
	public static final By XPATH_FORGOT_EMAILID_OR_PASSWORD = By
			.xpath(".//*[@id='need-help']");
	public static final By XPATH_BUY_ALL_YOUR_INVENTORY = By
			.xpath("//li[text()='Buy all your inventory']");
	public static final By XPATH_AT_ONE_PLACE = By
			.xpath("//li[text()='At one place! In one go!']");
	public static final By XPATH_RETAILER_SIGNUP = By
			.xpath("//a[text()='Retailer Sign Up']");
	public static final By XPATH_WHY_SHOTANG = By
			.xpath("//p[text()='Why Shotang?']");
	public static final By XPATH_WIDSET_VARIETY = By
			.xpath("//p[text()='Widest Variety! Best Schemes']");
	public static final By XPATH_GREAT_CONVENIENCE = By
			.xpath("//p[text()='Great Convenience']");
	public static final By XPATH_INFORMATION_ON_FINGERTIPS = By
			.xpath("//p[text()='Information on your fingertips']");
	public static final By XPATH_TOP_CATEGORIES = By
			.xpath("//p[text()='Top Categories']");
	public static final By XPATH_TELECOM = By.xpath("//p[text()='TELECOM']");
	public static final By XPATH_APPARELS = By
			.xpath("//p[text()='APPARELS']");
	public static final By XPATH_HOME_APPLIANCES = By
			.xpath("//p[text()='HOME APPLIANCES']");
	public static final By XPATH_TRAVEL_GEAR = By
			.xpath("//p[text()='TRAVEL GEAR']");
	public static final By XPATH_AUTOMOBILES = By
			.xpath("//p[text()='AUTOMOBILES']");
	public static final By XPATH_STATIONERY = By
			.xpath("//p[text()='STATIONERY']");
	public static final By XPATH_COPYRIGHT = By.xpath("//div[1]/ul/li[1]/a");
	public static final By XPATH_TERMS_AND_CONDITIONS = By
			.xpath("//div[1]/ul/li[2]/a");
	public static final By XPATH_PRIVACY_POLICY = By
			.xpath("//div[1]/ul/li[3]/a");
	public static final By XPATH_FACEBOOK_LIKE = By
			.xpath("//div[@data-href='https://www.facebook.com/shotangindia/?fref=ts']");
	public static final By XPATH_TWITTER_LIKE = By
			.xpath("//div[@class='col-xs-3 col-md-2']");

	// ************************* Login User Details****************************
	public static final String RETAILERS_EMAIL_ID = "kpr.kkt@gmail.com";
	public static final String RETAILERS_PASSWORD = "password";

	public static final String DISTRIBUTOR_EMAIL_ID = "srikanth_test_seller";
	public static final String DISTRIBUTOR_PASSWORD = "shotang";

}
