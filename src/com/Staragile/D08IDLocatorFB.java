package com.Staragile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D08IDLocatorFB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("banti");
		driver.findElement(By.id("pass")).sendKeys("nayak");
		driver.findElement(By.cssSelector("button[id^='u_0']")).click();
		System.out.println("program success");
		driver.close();
	}

}