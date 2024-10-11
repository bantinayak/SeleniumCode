package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import commonlib.SeleniumUtils;

public class GoogleSeleniumTest {

	public static void main(String[] args) throws IOException {
		String projectdirectory = System.getProperty("user.dir");
		System.out.println("projectdirectory : " + projectdirectory);
		System.setProperty("webdriver.chrome.driver",
				projectdirectory + "\\resource\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		SeleniumUtils seleniumutil = new SeleniumUtils();
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File(
				"D:\\Selenium code\\git-seleniumcode\\selenium_testing\\resource\\Results\\screen1.png");
		Files.copy(srcFile, destFile);
		driver.findElement(By.xpath("//input[@class='gLFyf']")).click();
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Selenium dev", Keys.ENTER);
		String title = driver.getTitle();
		seleniumutil.captureScreenshot(driver, "photo.2");
		System.out.println("title :" + title);

		seleniumutil.captureScreenshot(driver, "photo.1");
		driver.quit();

	}

}
