package com.AssignmentsStarAgile;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class A09_OHrmLogin {
	WebDriver driver;

	@Test
	public void login1() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();

	}

	@Test
	public void login2() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Banti");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Banti123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();

	}

	@Test
	public void login3() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("kavita");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("kavita123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();

	}

	@AfterMethod
	public void afterMethod() {
		if (driver.getCurrentUrl().contains("dashboard")) {

			driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
			driver.findElement(By.xpath("//a[.='Logout']")).click();
		} else {
			System.out.println(driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText());
		}

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("BeforeTest");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
