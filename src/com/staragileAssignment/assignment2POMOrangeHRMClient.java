package com.staragileAssignment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class assignment2POMOrangeHRMClient {
	WebDriver driver;
	assignment2POMOrangeHRM e;

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		e = new assignment2POMOrangeHRM(driver); 
	}

	@Test
	public void g() {
		e.enterUserName("admin");
		e.enterPassword("admin123");
		e.login();
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
