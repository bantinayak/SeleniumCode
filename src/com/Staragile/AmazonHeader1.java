package com.Staragile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHeader1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		
		List<WebElement> headers = driver.findElements(By.xpath("//header[@id='navbar-main'] //div[@id='nav-main']"));

		for (WebElement header : headers) {
			System.out.println(header.getAttribute("innerText"));
		}

		driver.quit();

	}

}
