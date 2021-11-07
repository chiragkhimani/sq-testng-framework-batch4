package com.automation.tests;

import org.testng.annotations.Test;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utils.PropertyReader;

public class SauceNavigationTest extends BaseTest{

	@Test(groups = { "Smoke", "Chirag", "Navigation" })
	public void verifyUserCanNavigateToProductDetailPageFromHomePage() {
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.doLogin(PropertyReader.getProperty("login.username"), PropertyReader.getProperty("login.password"));
		homePage.verifyHomePage();
		homePage.verifyProductDetailPageNavigation();
	}

}
