package com.StarAgileTestNGdemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*1. TestAutomation class (Page Object Model - POM):
This class follows the Page Object Model (POM) pattern, 
which separates the test logic (actions) from the element locators (UI objects). 
It handles the interaction with the web elements on the login page.*/
public class TestAutomation {
	WebDriver driver;
	
	/*Constructor:
Initializes the driver object and uses PageFactory.initElements(driver, this) 
to initialize the web elements 
(using the @FindBy annotations).*/

	public TestAutomation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	WebElement logInUsername;
	public void userName(String un) {
		logInUsername.sendKeys(un);
	}

	@FindBy(id = "password")
	WebElement password;
	public void loginPassWord(String pw) {
		password.sendKeys(pw);
	}

	@FindBy(id = "submit")
	WebElement clickSubmit;
	public void submit() {
		clickSubmit.click();
	}

}
