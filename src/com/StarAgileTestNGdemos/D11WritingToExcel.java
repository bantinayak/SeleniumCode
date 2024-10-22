package com.StarAgileTestNGdemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D11WritingToExcel {
	String fpath = System.getProperty("user.dir") + "\\testdata\\writeExcelData.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet s;
	XSSFRow row;
	XSSFCell cell;

	@Test
	public void writeData() {
		row = s.createRow(0); // create 1st row inside the row
		cell = row.createCell(0); // create 1st row inside the cell
		cell.setCellValue("Banti"); // put the data inside the cell

		// row = s.createRow(0);//create only once, if you create 2nd time it will
		// override the data
		cell = row.createCell(1);
		cell.setCellValue("Odisha");

		// for create 2nd row
		s.createRow(1).createCell(0).setCellValue("Nayak");
		s.getRow(1).createCell(1).setCellValue("Banti");

	}

	@BeforeTest
	public void beforeTest() throws FileNotFoundException {
		file = new File(fpath);
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook(); // create a workbook
		s = wb.createSheet("my sheet");// create a sheet
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos); // write the data physically to the file
		wb.close();
		fos.close();
	}

}
