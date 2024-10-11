package com.AssignmentsStarAgile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A08DashBlingAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://dash.bling-center.com/platform/signIn");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.className("forget-password-btn")).click();
		driver.findElement(By.id("email1")).sendKeys("bantinayak888@gmail.com");

		driver.findElement(By.xpath("//p[text()='Reset Password']")).click();
		Thread.sleep(5000);
		System.out.println("Text is: " + driver.findElement(By.id("resetsuccess")).getText());
		driver.close();
	}

}
