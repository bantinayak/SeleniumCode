package com.StarAgileTestNGdemos;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D122WriteDataToExcelDataProvider {
	
	File file;
	FileOutputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int i=0;
	
	
  @Test(dataProvider = "loginDataStatus")
  public void createLoginData(String un, String p )
  {
	 row=sheet.createRow(i);
	 cell=row.createCell(0);
	 cell.setCellValue(un);
	 
	 cell=row.createCell(1);
	 cell.setCellValue(p);
	 
	 cell=row.createCell(2);
	 cell.setCellValue("result");
	 i++;
	  
	  
  }

  @DataProvider
  public Object[][] loginDataStatus() {
    return new Object[][] {
      new Object[] { "username", "place" },
      new Object[] { "Banti", "berhampur" },
      new Object[] { "anita", "hyderabad",},
      new Object[] { "bishal", "bangalore"},
      new Object[] { "Sam", "delhi"},
    };
  }
  @BeforeTest
  public void beforeTest() throws FileNotFoundException 
  {
	  file=new File("D:\\SeleniumCode\\seleniumLearning\\testdata\\OHrmLoginData.xlsx");
	  fis=new FileOutputStream(file);
	  wb=new XSSFWorkbook();
	  sheet=wb.createSheet("dataset");
	  
  }

  @AfterTest
  public void afterTest() throws IOException
  {
	  wb.write(fis);
	  wb.close();
	 fis.close();
	 	  
  }

}
