package com.staragileAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class assignment2POMOrangeHRM {
	WebDriver driver;

	public assignment2POMOrangeHRM(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement loginUserName;
	public void enterUserName(String un) {
		loginUserName.sendKeys(un);
	}

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	public void enterPassword(String pw) {
		password.sendKeys(pw);
	}

	@FindBy(xpath = "//input[@name='username']") WebElement login;
	public void login() {
		login.click();
	}
}
