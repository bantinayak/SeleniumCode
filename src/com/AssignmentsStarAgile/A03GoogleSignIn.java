package com.AssignmentsStarAgile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A03GoogleSignIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.partialLinkText("Gm")).click();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("identifier")).sendKeys("banti");
		driver.close();
	}

}
