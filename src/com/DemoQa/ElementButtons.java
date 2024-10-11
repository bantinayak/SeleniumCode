package com.DemoQa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ElementButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions action = new Actions(driver);
		/* Buttons */
		/* double click */
		action.doubleClick(driver.findElement(By.id("doubleClickBtn"))).build().perform();
		String DoubleClickText = driver.findElement(By.xpath("//p[@id='doubleClickMessage']")).getText();
		System.out.println("Text print....:" + DoubleClickText);

		/* Right click */
		Thread.sleep(4000);
		action.contextClick(driver.findElement(By.xpath("//button[@id='rightClickBtn']"))).build().perform();
		String RightClickText = driver.findElement(By.xpath("//p[text()='You have done a right click']")).getText();
		System.out.println("Text print...:" + RightClickText);

		/* click */
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		String ClickText = driver.findElement(By.xpath("//*[text()='You have done a dynamic click']")).getText();
		System.out.println("ClickText...: " + ClickText);
		System.out.println("program execution succesfull");

	}

}
