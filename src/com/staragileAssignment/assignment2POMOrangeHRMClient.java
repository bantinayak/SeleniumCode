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
	public void login() throws InterruptedException {
		e.enterUserName("admin");
		e.enterPassword("admin123");
		Thread.sleep(2000);
		e.login();
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
