package testBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

public class UserNameTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driverOrigin = new ChromeDriver();
		Listener listener = new Listener();
		WebDriver driver = new EventFiringDecorator(listener).decorate(driverOrigin);
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("pooja");

	}

}
