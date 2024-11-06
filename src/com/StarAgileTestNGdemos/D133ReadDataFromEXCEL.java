package com.StarAgileTestNGdemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D133ReadDataFromEXCEL {
	String path = System.getProperty("user.dir") + "\\testdata\\userDetail.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;

	@Test(enabled=false)
	public void readData() {
		row = sheet.getRow(0);
		cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		
		
	}

	@Test
	public void readAllData() {
		int totalRows= sheet.getPhysicalNumberOfRows();
		int totalcells=sheet.getRow(0).getPhysicalNumberOfCells();
		
		for (int i = 0; i < totalRows; i++) {
			row = sheet.getRow(i);

			for (int j = 0; j < totalcells; j++) {
				cell = row.getCell(j);
				System.out.print("\t"+cell.getStringCellValue());
			}
			System.out.println(" ");
		}
	}


	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(path);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("Sheet1");

	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.close();
		fis.close();
	}

}
