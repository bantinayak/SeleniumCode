package com.Staragile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D17HandlingCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		WebElement chkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("before clicking: ");
		System.out.println("selected: " + chkbox.isSelected());
		System.out.println("enable check: " + chkbox.isEnabled());
		System.out.println("displayed check: " + chkbox.isDisplayed());
		// if (chkbox.isSelected() == false)
		if (chkbox.isSelected() != true)
			chkbox.click();
		System.out.println("after clicking: ");
		System.out.println("selected: " + chkbox.isSelected());
		System.out.println("enable check: " + chkbox.isEnabled());// it is return true or false
		System.out.println("displayed check: " + chkbox.isDisplayed());
		if (chkbox.isSelected() == true)
			driver.close();// https://echoecho.com/htmlforms09.htm#google_vignette

	}

}
