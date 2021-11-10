package com.automation.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {

	static Properties prop = new Properties();

	// it'll load all key-value pair from data.properties to prop object. 
	// We need to call this method only once in the project
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
