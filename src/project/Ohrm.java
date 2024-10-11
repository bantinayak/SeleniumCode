package project;

import java.io.File;
import java.io.FileInputStream;
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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ohrm {
	String fpath = System.getProperty("user.dir") + "git-seleniumcode\\selenium_testing\\resource\\Results";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;

	WebDriver driver;

	@Test(dataProvider = "loginData")
	public void Ohrmlogin(String un, String ps) {
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
	}

	@DataProvider
	public Object[][] loginData() {
		int totalrows = sheet.getPhysicalNumberOfRows();
		String[][] logindata = new String[totalrows - 1][2];

		for (int i = 0; i < totalrows - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < 2; j++) {
				cell = row.getCell(j);
				logindata[i][j] = cell.getStringCellValue();
			}
		}
		return logindata;

	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fpath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterMethod
	public void afterMethod() throws IOException {
		String current_url = driver.getCurrentUrl();
		SoftAssert s = new SoftAssert();
		s.assertTrue(current_url.contains("dashboard"), "Test Case Fail");

		if (current_url.contains("dashboard"))

		{
			System.out.println("Test Case Pass");

			driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]")).click();
			driver.findElement(By.linkText("Logout")).click();
			Utils.getScreenshot(driver);

		} else {
			System.out.println("Test Case Fail");

		}

	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.close();
		fis.close();
		driver.quit();
	}
}
