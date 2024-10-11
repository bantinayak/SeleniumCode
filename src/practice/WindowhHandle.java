package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowhHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium code\\git-seleniumcode\\selenium_testing\\resource\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		String parentwindowid = driver.getWindowHandle();
		System.out.println("parentwindowid : " + parentwindowid);
		driver.findElement(By.cssSelector("button#tabButton")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowid : windowHandles) {
			System.out.println("windowid : " + windowid);
			if (windowid.equals(parentwindowid)) {
				driver.switchTo().window(windowid);
			}
		}

	}

}
