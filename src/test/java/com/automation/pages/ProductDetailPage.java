package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage extends BasePage {

	@FindBy(xpath = "//div[contains(@class,'inventory_details_name')]")
	WebElement itemTitle;

	@FindBy(className = "inventory_details_price")
	WebElement itemPrice;

	public ProductDetailPage(WebDriver driver) {
		// Calling constructor of super class with passing arguments driver which we
		// received from test class
		super(driver);
	}

	public void verifyTitle() {
		System.out.println(itemTitle.getText());
	}

	public void verifyPrice() {
		System.out.println(itemPrice.getText());
	}
}
