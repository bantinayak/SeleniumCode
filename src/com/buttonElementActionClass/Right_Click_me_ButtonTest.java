package com.buttonElementActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click_me_ButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/buttons");

		Actions action = new Actions(driver);
		action.contextClick(driver.findElement(By.id("rightClickBtn"))).build().perform();

		// driver.findElement(By.cssSelector("//button[text='rightClickMessage']")).isDisplayed();
		driver.quit();

	}

}
