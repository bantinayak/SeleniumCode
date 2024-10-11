package com.Staragile;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class D23Synchronization_FluentWaitUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://dash.bling-center.com/platform/signIn");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));// it is used for session timeout exception
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		driver.findElement(By.className("forget-password-btn")).click();
		driver.findElement(By.id("email1")).sendKeys("bantinayak888@gmail.com");
		
        wait.withTimeout(Duration.ofSeconds(30))
        .ignoring(NoSuchElementException.class)
        .pollingEvery(Duration.ofMillis(1))
        .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Reset Password']")));
        
		driver.findElement(By.xpath("//p[text()='Reset Password']")).click();
		
	
		System.out.println("Text is: " + driver.findElement(By.id("resetsuccess")).getText());
		driver.close();
	
	}

}
