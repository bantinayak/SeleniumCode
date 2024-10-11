package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium code\\git-seleniumcode\\selenium_testing\\resource\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/links");
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.cssSelector("a#dynamicLink")).click();

		System.out.println("hi");

	}

}
