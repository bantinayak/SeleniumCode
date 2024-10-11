package com.staragileAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Select selectValue = new Select(driver.findElement(By.id("oldSelectMenu")));
		selectValue.selectByIndex(2);
		Thread.sleep(4000);
		selectValue.selectByVisibleText("Indigo");
		Thread.sleep(4000);
		selectValue.selectByValue("7");
		driver.quit();
	}

}
