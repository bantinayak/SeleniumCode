package com.buttonElementActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click__button_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/buttons");
		Actions action = new Actions(driver);
		Thread.sleep(500);
		action.doubleClick(driver.findElement(By.id("doubleClickBtn"))).build().perform();
		driver.findElement(By.id("doubleClickMessage")).isDisplayed();

	}

}
