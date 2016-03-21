package com.shotang.staticpages;

import org.openqa.selenium.WebDriver;

import static com.shotang.staticpages.StaticPageLocaters.*;

import com.shotang.common.Common;

public class StaticPageMethods {

	WebDriver driver;

	public StaticPageMethods(WebDriver driver) {
		this.driver = driver;
		driver.manage().window().maximize();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to click on Sell on Shotang link on home page
	 */
	public void clickOnSellOnShotangLinkOnHomePage() {
		Common.click(XPATH_SELL_ON_SHOTANG, driver);
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to check SellFrom Any Where Text On Sell on
	 *         shotang page
	 */
	public void checkSellFromAnyWhereText() {
		Common.waitForVisibilityOfElement(XPATH_SELL_FROM_ANY_WHERE, driver);
		Common.assertTextUsingEquals(XPATH_SELL_FROM_ANY_WHERE,
				"Sell from anywhere, anytime.", driver);
		System.out
				.println("Verified 'Sell from anywhere, anytime.' Text Is present");
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to check submit and call us text on sell on
	 *         shotang page
	 */
	public void checkSubmitButtonAndCallUsText() {
		Common.waitForPresenceOfElement(XPATH_SUBMIT, driver);
		System.out.println("Verified 'Submit' Button Is Present");
		Common.assertTextUsingEquals(XPATH_CALL_US, "+91-886-120-9858", driver);
		System.out.println("Verified '+91-886-120-9858' Text Is Present");
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to check Register Seller Left side text on
	 *         sell on shotang page
	 */
	public void checkRegisterSellerLeftSideText() {
		Common.assertTextUsingEquals(XPATH_REGISTER_SELLER_LEFT_TEXT,
				"discovering the path to improved", driver);
		System.out
				.println("Verified 'discovering the path to improved' Text Is Present");
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to Verify the Elements on Sell on shotang
	 *         page
	 */
	public void verifyElementsOnSellOnShotangPage() {
		clickOnSellOnShotangLinkOnHomePage();
		checkSellFromAnyWhereText();
		checkSubmitButtonAndCallUsText();
		checkRegisterSellerLeftSideText();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to click on About Us link on home page
	 */
	public void clickOnAboutUsLinkOnHomePage() {
		Common.click(XPATH_ABOUT_US, driver);
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to check SellFrom Any Where Text On About Us
	 *         Page
	 */
	public void checkAboutUsText() {
		Common.waitForVisibilityOfElement(XPATH_ABOUT_US_TEXT, driver);
		Common.assertTextUsingEquals(XPATH_ABOUT_US_TEXT, "About Us", driver);
		System.out.println("Verified 'About Us' Text Is present");
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to check Resellers And Companies Text on
	 *         About Us Page
	 */
	public void checkResellersAndCompaniesText() {
		Common.assertTextUsingEquals(XPATH_RESELLERS_ASSISTED_TEXT,
				"Resellers Assisted So For", driver);
		System.out
				.println("Verified 'Resellers Assisted So For' Text Is Present");
		Common.assertTextUsingEquals(XPATH_COMPANIES_ON_NETWORK_TEXT,
				"Companies On Network", driver);
		System.out.println("Verified 'Companies On Network' Text Is Present");
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to check Our Aim And Endeavour text on About
	 *         Us Page
	 */
	public void checkOurAimAndEndeavourText() {
		Common.assertTextUsingEquals(XPATH_OUR_AIM_TEXT, "Our Aim", driver);
		System.out.println("Verified 'Our Aim' Text Is Present");
		Common.assertTextUsingEquals(XPATH_OUR_ENDEAVOUR_TEXT, "Our Endeavour",
				driver);
		System.out.println("Verified 'Our Endeavour' Text Is Present");
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to check Our Aim And Endeavour text on About
	 *         Us Page
	 */
	public void checkOurTeamMembersAndInvestorsText() {
		Common.assertTextUsingEquals(XPATH_OUR_TEAM, "Our Team", driver);
		System.out.println("Verified 'Our Team' Text Is Present");
		Common.assertTextUsingEquals(XPATH_OUR_TEAM_CO_FOUNDER_NAME1,
				"Anish Basu Roy", driver);
		System.out.println("Verified 'Anish Basu Roy' Text Is Present");
		Common.assertTextUsingEquals(XPATH_OUR_TEAM_CO_FOUNDER_NAME2,
				"Anterpreet Singh", driver);
		System.out.println("Verified 'Anterpreet Singh' Text Is Present");
		Common.assertTextUsingEquals(XPATH_OUR_TEAM_OPERATIONS_DIRECTOR,
				"Vishal BG", driver);
		System.out.println("Verified 'Vishal BG' Text Is Present");
		Common.assertTextUsingEquals(XPATH_OUR_INVESTORS, "Our Investors",
				driver);
		System.out.println("Verified 'Our Investors' Text Is Present");
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to Verify the Elements on About Us Page
	 */
	public void verifyElementsOnAboutUsPage() {
		clickOnAboutUsLinkOnHomePage();
		checkAboutUsText();
		checkResellersAndCompaniesText();
		checkOurAimAndEndeavourText();
		checkOurTeamMembersAndInvestorsText();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to click on Contact Us link on home page
	 */
	public void clickOnContactUsLinkOnHomePage() {
		Common.click(XPATH_CONTACT_US, driver);
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to check Hello! And We are waiting to hear
	 *         from you! Text On Contact Us Page
	 */
	public void checkHelloAndWeAreWaitingText() {
		Common.waitForVisibilityOfElement(XPATH_HELLO_TEXT, driver);
		Common.assertTextUsingEquals(XPATH_HELLO_TEXT, "Hello!", driver);
		System.out.println("Verified 'Hello!' Text Is present");
		Common.assertTextUsingEquals(XPATH_WE_ARE_WAITING_TEXT,
				"We are waiting to hear from you!", driver);
		System.out
				.println("Verified 'We are waiting to hear from you!' Text Is present");
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to check 'Please leave a message and we will
	 *         call you back within 24 hours.' Text on Contact Us Page
	 */
	public void checkLeaveAMessageText() {
		Common.assertTextUsingEquals(
				XPATH_LEAVE_A_MESSAGE_TEXT,
				"Please leave a message and we will call you back within 24 hours.",
				driver);
		System.out
				.println("Verified 'Please leave a message and we will call you back within 24 hours.' Text Is Present");
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to check Send button And Call Us Number Text
	 *         On Contact Us Page
	 */
	public void checkSendButtonAndCallusNumberText() {
		Common.waitForPresenceOfElement(XPATH_CONTACT_US_SEND, driver);
		System.out.println("Verified 'Send' button Is Present");
		Common.assertTextUsingEquals(XPATH_CALL_US_NUMBER, "+91-8861209858",
				driver);
		System.out.println("Verified '+91-8861209858' Text Is Present");
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to Verify the Elements on Contact Us Page
	 */
	public void verifyElementsOnContactUsPage() {
		clickOnContactUsLinkOnHomePage();
		checkHelloAndWeAreWaitingText();
		checkLeaveAMessageText();
		checkSendButtonAndCallusNumberText();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This Method is used for Verify the Elements on We Are Hiring Page
	 * @param mainWindowhandle
	 */
	public void verifyElementsOnWeAreHiringPage(String mainWindowhandle) {
		Common.rightClickAndOpenInNewTab(XPATH_WE_ARE_HIRING, driver);
		Common.waitForVisibilityOfElement(CSS_COME_JOIN_US, driver);
		Common.assertTextUsingEquals(CSS_COME_JOIN_US, "Come join us!", driver);
		System.out.println("Verified 'Come join us!' Text Is Present");
		Common.waitForPresenceOfElement(XPATH_TEXT_ELEMENT_OF_COME_JOIN_US,
				driver);
		System.out
				.println("Verified 'Come join us Totoal text' Element Is Present");
		Common.waitForPresenceOfElement(XPATH_RESUME_SUBMIT, driver);
		System.out.println("Verified 'Submit' Button Is Present");
		Common.closeExtraWindowAndSwitchBackToParentWindow(mainWindowhandle,
				driver);
	}
}