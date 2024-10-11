package com.Staragile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).clear();
		//Assert.assertEquals(driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).sendKeys("22 Jan 2023"), "22 Jan 2023");
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).sendKeys("22 Jan 2023");
	}

}
