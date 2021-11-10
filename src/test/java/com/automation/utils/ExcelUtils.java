package com.automation.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public static void initExcelData() {

		try {
			workbook = new XSSFWorkbook("src//test//resources//data//TestData.xlsx");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Create object or sheet ---> sheet = excel sheet (sheet1, sheet2)
		sheet = workbook.getSheetAt(0);
	}

	public static String getData(int rowNum, int colNum) {
		XSSFRow row = sheet.getRow(rowNum);
		return row.getCell(colNum).toString();
	}
}
