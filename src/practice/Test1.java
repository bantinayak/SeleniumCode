package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium code\\git-seleniumcode\\selenium_testing\\resource\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).isDisplayed();
		driver.findElement(By.name("q")).sendKeys("selenium dev");
		String titleBeforeSubmit = driver.getTitle();
		System.out.println(titleBeforeSubmit);
		driver.findElement(By.name("q")).submit();
		String titleAfterSubmit = driver.getTitle();
		System.out.println(titleAfterSubmit);
		if (titleBeforeSubmit.equals(titleAfterSubmit)) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}

	}

}
