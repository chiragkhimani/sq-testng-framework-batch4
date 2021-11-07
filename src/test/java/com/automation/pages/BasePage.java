package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.CommonMethods;

public class BasePage extends CommonMethods{
	
	WebDriver driver;
	
	BasePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
