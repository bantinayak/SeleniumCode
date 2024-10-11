package com.Staragile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OhrmLoginAssignment2 {
	WebDriver driver;

	public OhrmLoginAssignment2(WebDriver driver) {
		
		this.driver = driver;
	}

	public void EnterUserName(String un) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
	}

	public void PassWord(String pw) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pw);
	}

	public void Login() {
		driver.findElement(
				By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
				.click();
	}
}

