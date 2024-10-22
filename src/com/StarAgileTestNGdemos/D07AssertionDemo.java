package com.StarAgileTestNGdemos;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class D07AssertionDemo {
	WebDriver driver;
	String expUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index",actUrl;

	@Test(dataProvider = "getLoginData")
	public void logIn(String n, String s) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(n);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(s);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		actUrl=driver.getCurrentUrl();
		//Assert.assertEquals(actUrl, expUrl, "invalid Username and pw");
		Assert.assertTrue(actUrl.contains("dash"), "invalid Username and pw"); //it is use for validation of testcase

	}

	@AfterMethod
	public void afterMethod() {
	
		if (driver.getCurrentUrl().contains("dashboard")) {

			driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
			driver.findElement(By.xpath("//a[.='Logout']")).click();
			System.out.println("Tescase Pass");
		} else {
			System.out.println("TestCase fail Beacause of: "+driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText());
		}

	}

	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] { new Object[] { "admin", "admin123" },
			new Object[] { "Banti", "banti123" },
			new Object[] { "priya", "priya123" },
			new Object[] { "darshan", "darshan123" },
			new Object[] { "admin", "admin123" },
			};
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
