package com.Staragile;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class D34ScreenShot {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File(
				System.getProperty("user.dir") +"\\Screenshot\\filename.png");
		Files.copy(srcFile, destFile);
		System.out.println("screenshot saved successfully");
	}

}
