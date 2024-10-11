package practice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import commonlib.SeleniumUtils;

public class RightClickTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium code\\git-seleniumcode\\selenium_testing\\resource\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions action=new Actions(driver);
		action.contextClick(driver.findElement(By.id("rightClickBtn"))).build().perform();
		driver.findElement(By.id("rightClickMessage")).isDisplayed();
		SeleniumUtils seleniumutil = new SeleniumUtils();
		seleniumutil.captureElementScreenshotFor(driver, "photo262", By.id("rightClickMessage"));
		
	}

}
