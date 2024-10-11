package com.Staragile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class D28HandlingMultipleHandle {

	public static void main(String[] args) {
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--disable-notifications");
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame("frame1");
		
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();

	}

}
