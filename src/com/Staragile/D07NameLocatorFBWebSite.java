package com.Staragile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D07NameLocatorFBWebSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("banti");
		driver.findElement(By.name("pass")).sendKeys("nayak");
		driver.findElement(By.name("login")).click();
		driver.close();
	}

}
