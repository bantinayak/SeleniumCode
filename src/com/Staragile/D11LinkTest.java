package com.Staragile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D11LinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		String gmailText = gmail.getText();
		System.out.println("gmailText: " + gmailText);
		
		// print attribute
		String urlText = gmail.getAttribute("href");
		System.out.println("urlText: " + urlText);
		gmail.click();
		driver.close();
	}

}
