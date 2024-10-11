package com.staragileAssignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Assignment5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destfile = new File(
				"D:\\Selenium code\\git-seleniumcode\\selenium_testing\\resource\\Results\\screen1.png");
		Files.copy(srcfile, destfile);
		//driver.quit();

	}

}
