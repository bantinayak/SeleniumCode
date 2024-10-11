package com.Staragile;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D25RediffHandlingTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		/*
		 * This tells Selenium to wait up to 20 seconds for web elements to load before
		 * throwing an exception. This is important to handle potential delays in
		 * loading web pages.
		 */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Money")).click();
		/*
		 * JavascriptExecutor js; js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(0,550)", "");
		 */

		driver.findElement(By.partialLinkText("More")).click();
		List<WebElement> headers = driver.findElements(By.xpath("//table[@class='dataTable']//tr//th"));
		for (WebElement h : headers) {
			System.out.println(h.getText());

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,550)", "");

			List<WebElement> row = driver.findElements(By.xpath("//div[@id='leftcontainer']//table//tbody//tr"));

			System.out.println("rowCount: " + row.size());
			System.out.println(row.get(4).getText());

			Random rnd = new Random();
			// int number = rnd.nextInt(11);
			int number = rnd.nextInt(row.size());

			System.out.println(number);
			driver.findElements(By.xpath("//div[@id='leftcontainer']//table//tbody//tr[" + (number + 1) + "]"));

			driver.close();

		}
	}

}
