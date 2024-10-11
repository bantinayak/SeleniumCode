package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickTest {

	public static void main(String[] args) {
		// String projectDirectory = System.getProperty("user.dir");
		// System.out.println("driver1 :" + projectDirectory);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions action = new Actions(driver);
		action.doubleClick(driver.findElement(By.id("doubleClickBtn"))).build().perform();
		driver.findElement(By.id("doubleClickMessage")).isDisplayed();
	}

}
