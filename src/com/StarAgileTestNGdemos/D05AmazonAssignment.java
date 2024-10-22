package com.StarAgileTestNGdemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D05AmazonAssignment {
	WebDriver driver;

	@Test(priority = 1, groups = "sellor")
	public void testBestSellor() {
		driver.findElement(By.linkText("Best Sellers")).click();
	}

	@Test(priority = 2, groups = "sellor")
	public void testTodaysDeal() {
		driver.findElement(By.linkText("Today's Deals")).click();
	}

	@Test(priority = 3, enabled = false)
	public void testBuyAgain() {
		driver.findElement(By.xpath("//a[text()='Buy Again']")).click();
	}

	@Test(priority = 4, groups = "buyer")
	public void testMxPlayer() {
		driver.findElement(By.linkText("MX Player")).click();
	}

	@Test(priority = 5, groups = "buyer")
	public void testsell() {
		driver.findElement(By.linkText("Sell")).click();
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		System.out.println(driver.getTitle());
	}

	@BeforeTest(alwaysRun = true)
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@AfterTest(alwaysRun = true)
	public void afterTest() {
		driver.close();
	}

}
