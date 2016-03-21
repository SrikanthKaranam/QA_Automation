package com.shotang.staticpages;

import org.openqa.selenium.By;

/**
 * @author srikanth.k
 * 
 *         This class consists of all Locators related to the Shotang Home Page
 */

public class StaticPageLocaters {

	// **************************** Home Page ********************************
	public static final By XPATH_WE_ARE_HIRING = By
			.xpath("//a[@class='careers']");
	public static final By XPATH_SELL_ON_SHOTANG = By
			.xpath("//a[@class='sell-on-shotang']");
	public static final By XPATH_ABOUT_US = By.xpath("//a[@class='about-us']");
	public static final By XPATH_CONTACT_US = By
			.xpath("//a[@class='contact-us']");
	public static final By XPATH_RETAILER_SIGNUP = By
			.xpath("//a[text()='Retailer Sign Up']");
	public static final By XPATH_TERMS_AND_CONDITIONS = By
			.xpath("//div[1]/ul/li[2]/a");
	public static final By XPATH_PRIVACY_POLICY = By
			.xpath("//div[1]/ul/li[3]/a");

	// ************************* We're Hiring Page *****************************
	public static final By CSS_COME_JOIN_US = By.cssSelector(".about-vision");
	public static final By XPATH_TEXT_ELEMENT_OF_COME_JOIN_US = By
			.xpath("//div[7]/div/p[2]");
	public static final By XPATH_RESUME_SUBMIT = By
			.xpath(".//*[@id='submit_resume']");

	// ************************ Sell On Shotang Page***************************
	public static final By XPATH_SELL_FROM_ANY_WHERE = By
			.xpath("//td[2]/table[1]/thead/tr/td");
	public static final By XPATH_SUBMIT = By
			.xpath("//input[@class='button_submit']");
	public static final By XPATH_CALL_US = By
			.xpath("//span[@class='call_us_at']");
	public static final By XPATH_REGISTER_SELLER_LEFT_TEXT = By
			.xpath("//tbody/tr[2]/td/span");

	// ************************ About Us Page*********************************
	public static final By XPATH_ABOUT_US_TEXT = By
			.xpath("//li[text()='About Us']");
	public static final By XPATH_RESELLERS_ASSISTED_TEXT = By
			.xpath("//span[text()='Resellers Assisted So For']");
	public static final By XPATH_COMPANIES_ON_NETWORK_TEXT = By
			.xpath("//span[text()='Companies On Network']");
	public static final By XPATH_OUR_AIM_TEXT = By
			.xpath("//p[@class='about-aim']");
	public static final By XPATH_OUR_ENDEAVOUR_TEXT = By
			.xpath("//p[text()='Our Endeavour']");
	public static final By XPATH_OUR_TEAM = By.xpath("//p[text()='Our Team']");
	public static final By XPATH_OUR_TEAM_CO_FOUNDER_NAME1 = By
			.xpath("//p[text()='Anish Basu Roy']");
	public static final By XPATH_OUR_TEAM_CO_FOUNDER_NAME2 = By
			.xpath("//p[text()='Anterpreet Singh']");
	public static final By XPATH_OUR_TEAM_OPERATIONS_DIRECTOR = By
			.xpath("//p[text()='Vishal BG']");
	public static final By XPATH_OUR_INVESTORS = By
			.xpath("//p[text()='Our Investors']");

	// ************************ Contact Us Page*********************************
	public static final By XPATH_HELLO_TEXT = By.xpath("//li[text()='Hello!']");
	public static final By XPATH_WE_ARE_WAITING_TEXT = By
			.xpath("//li[text()='We are waiting to hear from you!']");
	public static final By XPATH_LEAVE_A_MESSAGE_TEXT = By
			.xpath(".//*[@id='contact-us']/div[1]/div/div/div/p");
	public static final By XPATH_CONTACT_US_SEND = By
			.xpath("//input[@id='contact-us-send']");
	public static final By XPATH_CALL_US_NUMBER = By
			.xpath("//span[text()='+91-8861209858']");

}
