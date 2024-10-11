package com.Staragile;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D27HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		Alert alt;
		JavascriptExecutor js;

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();

		alt = driver.switchTo().alert();
		System.out.println("Text is: " + alt.getText());
		alt.accept();
		Thread.sleep(4000);

		js.executeScript("argument[0].click()", driver.findElement(By.id("timerAlertButton")));
		alt = driver.switchTo().alert();
		System.out.println("2ndText: " + alt.getText());
		alt.accept();

	}

}
