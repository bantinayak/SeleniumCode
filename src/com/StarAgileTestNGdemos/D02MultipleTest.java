package com.StarAgileTestNGdemos;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D02MultipleTest {
	@Test(priority = 2)
	public void Meesho() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Title is: " + driver.getTitle());
		driver.close();
	}

	@Test(priority = 1)
	public void Flipkart() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Title is: " + driver.getTitle());
		driver.close();
	}

	@Test(priority = 4)
	public void Amazon() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Title is: " + driver.getTitle());
		driver.close();

	}

	@Test(priority = 3)
	public void Zudio() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zudio.com/collections/men");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Title is: " + driver.getTitle());
		driver.close();
	}
}
