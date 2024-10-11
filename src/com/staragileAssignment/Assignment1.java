package com.staragileAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		JavascriptExecutor js;
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//div[@id='linkWrapper'] //a[@id='created']")).click();
		boolean createdTextVerify = driver.findElement(By.id("created")).isDisplayed();
		System.out.println(createdTextVerify);

		Thread.sleep(4000);
		driver.findElement(By.linkText("No Content")).click();
		String NoContentText = driver.findElement(By.id("linkResponse")).getText();
		System.out.println(NoContentText);

		Thread.sleep(4000);
		driver.findElement(By.linkText("Moved")).click();
		String MovedText = driver.findElement(By.id("linkResponse")).getText();
		System.out.println(MovedText);

		Thread.sleep(4000);
		driver.findElement(By.linkText("Bad Request")).click();
		String badrequestText = driver.findElement(By.id("linkResponse")).getText();
		System.out.println(badrequestText);

		Thread.sleep(4000);
		driver.findElement(By.linkText("Unauthorized")).click();
		String UnauthorizedText = driver.findElement(By.id("linkResponse")).getText();
		System.out.println(UnauthorizedText);

		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.linkText("Forbidden")).click();
		String ForbiddenText = driver.findElement(By.id("linkResponse")).getText();
		System.out.println(ForbiddenText);

		driver.findElement(By.linkText("Not Found")).click();
		String NotFoundText = driver.findElement(By.id("linkResponse")).getText();
		System.out.println(NotFoundText);

		System.out.println("program run succesfully");

		driver.quit();
	}

}
