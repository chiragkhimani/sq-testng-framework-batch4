package com.automation.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.utils.DriverUtils;
import com.automation.utils.ExcelUtils;
import com.automation.utils.PropertyReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void setUp() {
		DriverUtils.initDriver();

		PropertyReader.initProperties();

		ExcelUtils.initExcelData();

	}

	@After
	public void cleanUp() {
		DriverUtils.getDriver().close();
	}
}
