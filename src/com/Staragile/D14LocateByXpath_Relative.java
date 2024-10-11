package com.Staragile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D14LocateByXpath_Relative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("banti");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("nayak");
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
