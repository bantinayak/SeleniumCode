package com.DemoQa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsSectionTextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//Text box 
		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Banti nayak");
		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("bantinayak888@gmail.com");
		driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("pune");
		driver.findElement(By.cssSelector("textarea#permanentAddress")).sendKeys("Odisha");
		driver.findElement(By.xpath("//button[@id='submit'][@type='button']")).click();
		Thread.sleep(4000);
	/*	// Buttons 
		// double click 
		driver.navigate().to("https://demoqa.com/buttons");
		Actions action = new Actions(driver);
		action.doubleClick(driver.findElement(By.id("doubleClickBtn"))).build().perform();

	String DoubleClickText = driver.findElement(By.xpath("//p[@id='doubleClickMessage']")).getText();
		System.out.println("Text print....:" + DoubleClickText);
		// Right click 
		Thread.sleep(4000);
		action.contextClick(driver.findElement(By.xpath("//button[@id='rightClickBtn']"))).build().perform();
		String RightClickText = driver.findElement(By.xpath("//p[text()='You have done a right click']")).getText();
		System.out.println("Text print...:" + RightClickText);
		// click 
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		String ClickText = driver.findElement(By.xpath("//*[text()='You have done a dynamic click']")).getText();
		System.out.println("ClickText...: " + ClickText);
		System.out.println("program execution succesfull");*/
		driver.quit();

	}

}
