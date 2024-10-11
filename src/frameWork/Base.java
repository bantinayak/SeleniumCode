package frameWork;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base {
	protected WebDriver driver;

	@BeforeGroups("group1")
	public void beforeGroups() {
		System.out.println("BeforeGroups");
	}

	@AfterGroups("group1")
	public void afterGroups() {
		System.out.println("AfterGroups");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
	}

	@AfterMethod(groups = "group1")
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	@BeforeMethod(groups = "group1")
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium code\\git-seleniumcode\\selenium_testing\\resource\\driver\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.google.com/");
	}
}
