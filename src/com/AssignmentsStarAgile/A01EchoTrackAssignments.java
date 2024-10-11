package com.AssignmentsStarAgile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01EchoTrackAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expmsg = "Invalid Username/Password";
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		WebElement username = driver.findElement(By.id("txtCustomerID"));
		username.sendKeys("Banti");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("Banti");
		WebElement Button = driver.findElement(By.id("Butsub"));
		Button.click();
		// Button.getText();

		WebElement error = driver.findElement(By.xpath("//span[text()='Invalid Username/Password']"));
		String errormessage = error.getText();
		System.out.println(errormessage);

		if (expmsg.equals(errormessage)) {
			System.out.println("testcase pass");
		} else {
			System.out.println("Test case fail");
		}
		driver.close();

	}

}
