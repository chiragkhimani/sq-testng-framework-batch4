package com.automation.utils;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	public static void main(String args[]) throws Exception {
		// Create object or workbook ---> workbook = excel file
		XSSFWorkbook workbook = new XSSFWorkbook("src//test//resources//data//TestData.xlsx");

		// Create object or sheet ---> sheet = excel sheet (sheet1, sheet2)
		XSSFSheet sheet = workbook.getSheetAt(0);

		// Get row at given index
		XSSFRow row = sheet.getRow(3);
		
		
		System.out.println(row.getCell(0));
		System.out.println(row.getCell(1));
	}
}
