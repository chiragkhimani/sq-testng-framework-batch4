package com.automation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	WebElement homePageItemName;

	@FindBy(xpath = "//div[@class='inventory_item_name']")
	List<WebElement> listOfItems;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void verifyHomePage() {
		System.out.println(homePageItemName.isDisplayed());
	}

	public void verifyProductDetailPageNavigation() {
		ProductDetailPage pdpPage = new ProductDetailPage(driver);

		for (int i = 0; i < listOfItems.size(); i++) {

			listOfItems.get(i).click();

			pdpPage.verifyPrice();
			pdpPage.verifyTitle();

			driver.navigate().back();

			listOfItems = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		}
	}
}
