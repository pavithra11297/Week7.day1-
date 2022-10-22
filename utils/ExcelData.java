package com.testleaf.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static String[][] readSheetData(String excelName)throws IOException {
		//Go to workbook
		XSSFWorkbook workbook=new XSSFWorkbook("Data/"+excelName+".xlsx");
		//go to sheet
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		//get row count
		int rowCount = sheet.getLastRowNum();
		//get coumn count
		short cellCount = sheet.getRow(0).getLastCellNum();
		//newwwww
		String[][] data=new String[rowCount][cellCount];
		//get all row values
		for (int i = 1; i <=rowCount ; i++) {
			XSSFRow row = sheet.getRow(i);
			//get all coumn values
			for (int j = 0; j <cellCount ; j++) {
				XSSFCell cellvalue = row.getCell(j);
				//get values to print from column and row
				String stringCellValue = cellvalue.getStringCellValue();
				System.out.println(stringCellValue);
				data[i-1][j]=stringCellValue;
			}
		}
		workbook.close();
		return data;
	}

}



