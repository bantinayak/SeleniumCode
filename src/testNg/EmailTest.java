package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.testng.annotations.Test;

public class EmailTest {
	@Test
	public WebDriver launchBrowser(String browserName) {

		
		WebDriver driverOrigin = new ChromeDriver();

		Listener listener = new Listener();

		WebDriver driver = new EventFiringDecorator(listener).decorate(driverOrigin);

		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();

		return driver;
	}

}
