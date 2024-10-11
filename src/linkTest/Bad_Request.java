package linkTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bad_Request {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium code\\git-seleniumcode\\selenium_testing\\src\\linkTest\\Bad_Request.java");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(200);
		driver.get("https://demoqa.com/links");
		driver.findElement(By.cssSelector("a#bad-request")).click();
		driver.findElement(By.id("linkResponse")).isDisplayed();
		System.out.println("hi");
	}

}
