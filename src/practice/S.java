package practice;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class S {

	public static void main(String[] args) throws IOException {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        driver.get("https://www.airbus.com/");
//	        Convert web driver object to TakeScreenshot
	        TakesScreenshot screenshot =((TakesScreenshot)driver);
//	        Call getScreenshotAs method to create image file
	        File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
	        //Move image file to new destination
	        File destinationfile=new File("D:\\Selenium code\\git-seleniumcode\\selenium_testing\\target/arun.jpeg");
	        //Copy file at destination
	        //If file already exists,it will override,if not exists it will create
	       FileHandler.copy(sourcefile, destinationfile);
	        driver.close();
	    }
	}


