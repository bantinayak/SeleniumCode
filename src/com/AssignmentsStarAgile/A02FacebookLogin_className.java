package com.AssignmentsStarAgile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A02FacebookLogin_className {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement username = driver.findElement(By.className("_6luy"));
		username.sendKeys("Banti");
		WebElement password = driver.findElement(By.className("_9npi"));
		password.sendKeys("nayak");
		WebElement login = driver.findElement(By.className("_42ft"));
		login.click();
		System.out.println("hi");

	}
}
