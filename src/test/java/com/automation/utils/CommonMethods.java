package com.automation.utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {
	// Switch to new window
	public static String switchToNewWindow(WebDriver driver) {
		String currentWindowID = driver.getWindowHandle();
		Set<String> listOfWindowsId = driver.getWindowHandles();

		for (String windowId : listOfWindowsId) {
			if (!windowId.equals(currentWindowID)) {
				driver.switchTo().window(windowId);
			}
		}
		return currentWindowID;
	}
	
	public void waitForElementToBeClickable(WebElement element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	
}
