package com.Staragile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D22Synchronization_WebFriverWaitUse {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://dash.bling-center.com/platform/signIn");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.className("forget-password-btn")).click();
		driver.findElement(By.id("email1")).sendKeys("bantinayak888@gmail.com");

		driver.findElement(By.xpath("//p[text()='Reset Password']")).click();
		// Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("resetsuccess")));
		System.out.println("Text is: " + driver.findElement(By.id("resetsuccess")).getText());
		driver.close();
	}

}
