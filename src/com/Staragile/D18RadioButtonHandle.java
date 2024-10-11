package com.Staragile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D18RadioButtonHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement radioButton = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		System.out.println("Before click");
		System.out.println("enable check: " + radioButton.isEnabled());
		System.out.println("display check: " + radioButton.isDisplayed());
		System.out.println("select check: " + radioButton.isSelected());
		radioButton.click();
		System.out.println("after click:");
		System.out.println("enable check: " + radioButton.isEnabled());
		System.out.println("enable check: " + radioButton.isEnabled());
		System.out.println("enable check: " + radioButton.isEnabled());
		driver.close();
	}

}
