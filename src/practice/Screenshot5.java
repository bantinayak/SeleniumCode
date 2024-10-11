package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
		File srcFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile=new File("D:\\Selenium code\\git-seleniumcode\\selenium_testing\\target\\priya.png");
		Files.copy(srcFile, destFile);
	}

}
