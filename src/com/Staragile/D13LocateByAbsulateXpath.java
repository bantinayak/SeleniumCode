package com.Staragile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D13LocateByAbsulateXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[3]/div[1]/div/div[2]/div/div[3]/form/div[4]/div[1]/div/div/input"))
				.sendKeys("Banti");
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[3]/div[1]/div/div[2]/div/div[3]/form/div[4]/div[3]/div/div/div/div[1]/div/input"))
				.sendKeys("nayak");
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[3]/div[1]/div/div[2]/div/div[3]/form/div[5]/div[1]/button"))
				.click();

	}

}
