package com.Staragile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D10LocateByCSSSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.cssSelector("input[type='text']"));
		username.sendKeys("Banti");
		// driver.findElement(By.cssSelector("input[placeholder$='phone number']"))
		                // $ use when starting value always change
		//input[placeholder*='phon']-->* contains all starting value and end value
		WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
		password.sendKeys("Banti");
		
		//^=Starts with
		WebElement Button = driver.findElement(By.cssSelector("button[id^='u_0_5']"));
		Button.click();
		//input[placeholder^='Pass']
	
	}

}
