package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

import com.google.common.io.Files;

import commonlib.SeleniumUtils;

public class ButtonsTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium code\\git-seleniumcode\\selenium_testing\\resource\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driverOrigin = new ChromeDriver();
		Listener listener = new Listener();
		WebDriver driver = new EventFiringDecorator(listener).decorate(driverOrigin);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/buttons");
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		File srcfile = driver.findElement(By.xpath("//button[text()='Click Me']")).getScreenshotAs(OutputType.FILE);
		File destfile = new File(
				"D:\\Selenium code\\git-seleniumcode\\selenium_testing\\resource\\Results\\test123.png");
		Files.copy(srcfile, destfile);

//		File srcfile = driver.findElement(By.xpath("//button[text()='Click Me']")).getScreenshotAs(OutputType.FILE);
//		File destfile = new File(System.getProperty("user.dir") + "\\resource\\Results\\" + "element123" + ".png");
//		Files.copy(srcfile, destfile);

		driver.findElement(By.xpath("//*[@id='dynamicClickMessage']")).isDisplayed();
		SeleniumUtils seleniumUtils = new SeleniumUtils();
		seleniumUtils.captureElementScreenshotFor(driver, "element13", By.xpath("//*[@id='dynamicClickMessage']"));
		System.out.println("hi");
		driver.quit();
	}

}
