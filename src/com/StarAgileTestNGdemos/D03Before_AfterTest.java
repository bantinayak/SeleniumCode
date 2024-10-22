package com.StarAgileTestNGdemos;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D03Before_AfterTest {

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

	@Test(priority = 2)
	public void Meesho() {

		driver.get("https://www.meesho.com/");
		System.out.println("Title is: " + driver.getTitle());

	}

	@Test(priority = 1)
	public void Flipkart() {

		driver.get("https://www.flipkart.com/");
		System.out.println("Title is: " + driver.getTitle());

	}

	@Test(priority = 4)
	public void Amazon() {

		driver.get("https://www.amazon.in/");
		System.out.println("Title is: " + driver.getTitle());

	}

	@Test(priority = 3)
	public void Zudio() {

		driver.get("https://www.zudio.com/collections/men");
		System.out.println("Title is: " + driver.getTitle());

	}

}
