package com.automation.steps;

import com.automation.pages.LoginPage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps {
	LoginPage loginPage = new LoginPage(DriverUtils.getDriver());

	@Given("user is on website")
	public void user_is_on_website() {
		loginPage.openWebsite();
	}

	@When("user login with valid cred")
	public void user_login_with_valid_cred() {
		loginPage.doLogin("standard_user", "secret_sauce");
	}

}
