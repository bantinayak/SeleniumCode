package com.Staragile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OhrmLoginClient {
	WebDriver driver;
	OhrmLoginAssignment2 d;

	@Test
	public void f() {
		d.EnterUserName("Admin");
		d.PassWord("admin123");
		d.Login();
	
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d = new OhrmLoginAssignment2(driver);

	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
