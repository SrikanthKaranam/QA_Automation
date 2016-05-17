package com.shotang.homepage;

import org.openqa.selenium.WebDriver;
import static com.shotang.homepage.HomePageLocaters.*;

import com.shotang.common.Common;

public class HomePageMethods {

	WebDriver driver;

	public HomePageMethods(WebDriver driver) {
		this.driver = driver;
		driver.manage().window().maximize();
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to check Header Text on Shotang Home Page
	 */
	public void checkHeaderTextElementsOnHomePage() {
		Common.waitForVisibilityOfElement(XPATH_SHOTANG_LOGO, driver);
		System.out.println("Verified Shotang logo is present");
		Common.assertTextUsingEquals(XPATH_WE_ARE_HIRING, "We're Hiring",
				driver);
		System.out.println("Verified We're Hiring Text");
		Common.assertTextUsingEquals(XPATH_SELL_ON_SHOTANG, " Sell on Shotang",
				driver);
		System.out.println("Verified Sell on Shotang Text");
		Common.assertTextUsingEquals(XPATH_ABOUT_US, "About Us", driver);
		System.out.println("Verified About Us Text");
		Common.assertTextUsingEquals(XPATH_CONTACT_US, "Contact Us", driver);
		System.out.println("Verified Contact Us Text");
		Common.assertTextUsingEquals(XPATH_SIGN_IN_BUTTON, "Sign In", driver);
		System.out.println("Verified Sign In Text");
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to check Above Masth Head Image Elements On
	 *         Shotang Home Page
	 */
	public void checkAboveMasthHeadImageElementsOnHomePage() {
		Common.waitForVisibilityOfElement(XPATH_BUY_ALL_YOUR_INVENTORY, driver);
		Common.assertTextUsingEquals(XPATH_BUY_ALL_YOUR_INVENTORY,
				"Buy all your inventory", driver);
		System.out.println("Verified Buy all your inventory Text");
		Common.assertTextUsingEquals(XPATH_AT_ONE_PLACE,
				"At one place! In one go!", driver);
		System.out.println("Verified At one place! In one go! Text");
		Common.assertTextUsingEquals(XPATH_RETAILER_SIGNUP, "Retailer Sign Up",
				driver);
		System.out.println("Verified Retailer Sign Up Text");
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to check Why shotang Element and Under why
	 *         shotang elements On Shotang Home Page
	 */
	public void checkWhyShotangAndUnderElementsOnHomePage() {
		Common.scrollTillVisibilityOfAnElement(XPATH_WHY_SHOTANG, driver);
		Common.assertTextUsingEquals(XPATH_WHY_SHOTANG, "Why Shotang?", driver);
		System.out.println("Verified Why Shotang? Text");
		Common.assertTextUsingEquals(XPATH_WIDSET_VARIETY,
				"Widest Variety! Best Schemes", driver);
		System.out.println("Verified Widest Variety! Best Schemes Text");
		Common.assertTextUsingEquals(XPATH_GREAT_CONVENIENCE,
				"Great Convenience", driver);
		System.out.println("Verified Great Convenience Text");
		Common.assertTextUsingEquals(XPATH_INFORMATION_ON_FINGERTIPS,
				"Information on your fingertips", driver);
		System.out.println("Verified Information on your fingertips Text");
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to check Top Categories elements On Shotang
	 *         Home Page
	 */
	public void checkTopCategoriesElementsOnHomePage() {
		Common.scrollTillVisibilityOfAnElement(XPATH_TOP_CATEGORIES, driver);
		Common.assertTextUsingEquals(XPATH_TOP_CATEGORIES, "Top Categories",
				driver);
		System.out.println("Verified Top Categories Text");
		Common.assertTextUsingEquals(XPATH_TELECOM, "TELECOM", driver);
		System.out.println("Verified TELECOM Text");
		Common.assertTextUsingEquals(XPATH_APPARELS, "APPARELS", driver);
		System.out.println("Verified APPARELS Text");
		Common.assertTextUsingEquals(XPATH_HOME_APPLIANCES, "HOME APPLIANCES",
				driver);
		System.out.println("Verified HOME APPLIANCES Text");
		Common.assertTextUsingEquals(XPATH_TRAVEL_GEAR, "TRAVEL GEAR", driver);
		System.out.println("Verified TRAVEL GEAR Text");
		Common.assertTextUsingEquals(XPATH_AUTOMOBILES, "AUTOMOBILES", driver);
		System.out.println("Verified AUTOMOBILES Text");
		Common.assertTextUsingEquals(XPATH_STATIONERY, "STATIONERY", driver);
		System.out.println("Verified STATIONERY Text");
	}

	/**
	 * @author srikanth.k
	 * 
	 *         This method is used to check Footer Text on Shotang Home Page
	 */
	public void checkFooterTextElementsOnHomePage() {
		Common.scrollTillVisibilityOfAnElement(XPATH_COPYRIGHT, driver);
		Common.assertTextUsingEquals(XPATH_COPYRIGHT, "© 2016 shotang.com",
				driver);
		System.out.println("Verified Copyright Symbol Text On Footer");
		Common.assertTextUsingEquals(XPATH_TERMS_AND_CONDITIONS,
				"Terms & Conditions", driver);
		System.out.println("Verified Terms & Conditions Text");
		Common.assertTextUsingEquals(XPATH_PRIVACY_POLICY, "Privacy Policy",
				driver);
		System.out.println("Verified Privacy Policy Text");
		Common.waitForPresenceOfElement(XPATH_FACEBOOK_LIKE, driver);
		System.out.println("Verified FB Element");
		Common.waitForPresenceOfElement(XPATH_TWITTER_LIKE, driver);
		System.out.println("Verified Twitter Element");
	}

}
