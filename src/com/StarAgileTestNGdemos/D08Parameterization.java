package com.StarAgileTestNGdemos;

import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class D08Parameterization {
	WebDriver driver;

	@Parameters({ "username", "password" })
	@Test
	public void login(String un, String pw) throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pw);
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
	}

	@AfterMethod
	public void afterMethod() {
		if (driver.getPageSource().contains("Logged In Successfully")) {
			driver.findElement(By.linkText("Log out")).click();
		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
