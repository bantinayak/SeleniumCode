package testBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Current_address {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium code\\git-seleniumcode\\selenium_testing\\resource\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		// driver.get("https://demoqa.com/broken");
		driver.findElement(By.id("currentAddress")).sendKeys("wagholi,pune,412207");
		// driver.findElement(By.xpath("httpdemoqa")).click();
		System.out.println("hi");

	}

}
