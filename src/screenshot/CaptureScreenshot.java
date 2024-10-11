package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		/*File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destfile = new File("D:\\Selenium code\\selenium_testing\\resource\\Results\\screen1.png");
		File.copy(srcFile, destfile);*/
		
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destfile = new File("D:\\Selenium code\\selenium_testing\\resource\\Results\\screen1.png");
		Files.copy(srcFile, destfile);

	}

}
