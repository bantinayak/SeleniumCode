package com.StarAgileTestNGdemos;

import org.testng.annotations.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D111WritingToExcel {
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;

	@Test
	public void writeData() {
		row = sheet.createRow(0);
		cell = row.createCell(0);
		cell.setCellValue("Banti");

		cell = row.createCell(1);
		cell.setCellValue("nayak");
		sheet.createRow(1).createCell(0).setCellValue("adika");
		sheet.getRow(1).createCell(1).setCellValue("jadhav");

	}

	@BeforeTest
	public void beforeTest() throws FileNotFoundException {
		file = new File("D:\\SeleniumCode\\seleniumLearning\\testdata\\excelnew.xlsx");
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("My sheet");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fos.close();

	}

}
