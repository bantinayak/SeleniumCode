package locator_type_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium code\\selenium_testing\\resource\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/links");
		driver.findElement(By.linkText("no-content")).isDisplayed();// matching text of link
//int totalElement=driver.findElement(By.linkText("no-content")).size();
//System.out.println("totalElement:"+totalElement);
	}

}
