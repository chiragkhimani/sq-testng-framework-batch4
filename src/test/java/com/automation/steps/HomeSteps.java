package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.Given;

public class HomeSteps {
	HomePage homePage = new HomePage(DriverUtils.getDriver());
	
	@Given("verify login successful")
	public void verify_login_successful() {
		homePage.verifyHomePage();
	}
}
