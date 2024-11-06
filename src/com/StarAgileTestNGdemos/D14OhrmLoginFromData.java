package com.StarAgileTestNGdemos;

import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D14OhrmLoginFromData {
	String path = System.getProperty("user.dir") + "\\testdata\\LoginData.xlsx";
	File file;
	FileInputStream fis;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int i=1;
	
	WebDriver driver;
	

	@Test(dataProvider = "getLoginData")
	public void OHrmlogin(String un, String ps) 
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();

	}

	@AfterMethod
	public void afterMethod() {
		row=sheet.getRow(i);
		cell=row.getCell(2);
		
		if (driver.getCurrentUrl().contains("dashboard")) {

			driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
			driver.findElement(By.xpath("//a[.='Logout']")).click();
		cell.setCellValue("pass");
		} else {
			System.out.println("TestCase fail Beacause of: "+driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText());
			cell.setCellValue("fail");
		}
		i++;

	}

	@DataProvider
	public Object[][] getLoginData() {
		int totalrow=sheet.getPhysicalNumberOfRows();
		String[][]loginData=new String[totalrow-1][2];
		for(int i=0 ; i<totalrow-1 ; i++)
		{
			row=sheet.getRow(i+1);
			for(int j=0 ; j<2 ; j++)
			{
				cell=row.getCell(j);
				loginData[i][j]=cell.getStringCellValue();
			}
		}
		return loginData;
	}

	@BeforeTest
	public void beforeTest() throws IOException
	{
		file=new File(path);
		fis=new FileInputStream(file);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheetAt(0);
		fos=new FileOutputStream(file);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

	@AfterTest
	public void afterTest() throws IOException 
	{
		wb.write(fos);
		wb.close();
		fis.close();
		driver.close();
	}

}
