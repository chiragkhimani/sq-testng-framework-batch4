package com.automation.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {

	static Properties prop = new Properties();

	public static void initProperties() {
		try {
			prop.load(new FileInputStream("src//test//resources//data//data.properties"));
		} catch (Exception e) {
			
		}
	}

	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}
