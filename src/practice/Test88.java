package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test88 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement stateclick = driver.findElement(By.id("react-select-3-input"));
		stateclick.sendKeys("NCR");
		stateclick.click();
		stateclick.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		WebElement cityclick = driver.findElement(By.id("react-select-4-input"));
		cityclick.sendKeys("Delhi");
		cityclick.click();
		cityclick.sendKeys(Keys.ENTER);

	}
}
