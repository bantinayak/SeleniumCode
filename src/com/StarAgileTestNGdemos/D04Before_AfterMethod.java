package com.StarAgileTestNGdemos;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D04Before_AfterMethod {
	WebDriver driver;

	@BeforeTest
	public void OpenBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("BeforeTest");
	}

	@AfterTest
	public void CloseBrowser() {
		System.out.println("after Test");
		driver.close();
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void getTitle() {
		System.out.println("Title is: " + driver.getTitle());
		System.out.println("After Method");
	}

	@Test(priority = 2)
	public void Meesho() {

		driver.get("https://www.meesho.com/");
	}

	@Test(priority = 1)
	public void Flipkart() {

		driver.get("https://www.flipkart.com/");
	}

	@Test(priority = 4)
	public void Amazon() {

		driver.get("https://www.amazon.in/");
	}

	@Test(priority = 3)
	public void Zudio() {

		driver.get("https://www.zudio.com/collections/men");
	}
}
