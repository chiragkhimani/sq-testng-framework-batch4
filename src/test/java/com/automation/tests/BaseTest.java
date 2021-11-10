package com.automation.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automation.utils.ExcelUtils;
import com.automation.utils.PropertyReader;

public class BaseTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "src//test//resources//driver//chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// Maximize
		driver.manage().window().maximize();

		PropertyReader.initProperties();
		
		ExcelUtils.initExcelData();

		// Loading url in the browser
		driver.get(PropertyReader.getProperty("application.url"));
	}

	@AfterMethod
	public void cleanUp() {
		driver.close();
	}

}
