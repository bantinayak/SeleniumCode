package com.Staragile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D35UploadPhoto {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("uploadfile_0")).sendKeys("D:\\RESUME\\BantiResume.pdf");

		WebElement term = driver.findElement(By.xpath("//input[@type='checkbox']"));
		if (term.isSelected() == false) {
			term.click();
		}
		driver.findElement(By.id("submitbutton")).click();
		Thread.sleep(3000);
		System.out.println(
				driver.findElement(By.xpath("//center[normalize-space()='1 file has been successfully uploaded.']"))
						.getText());

	}

}
