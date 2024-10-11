package com.Staragile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D30NavigationMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Best Sellers")).click();
		driver.navigate().back();
		driver.navigate().to("https://demoqa.com/browser-windows");
		driver.navigate().refresh();
		driver.quit();

	}

}
