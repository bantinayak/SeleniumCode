package linkTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AllTestTogether {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("Created")).click();
		driver.findElement(By.id("created")).isDisplayed();

		driver.findElement(By.linkText("No Content")).click();
		driver.findElement(By.id("linkResponse")).isDisplayed();

		driver.findElement(By.linkText("Moved")).click();
		driver.findElement(By.id("linkResponse")).isDisplayed();

		driver.findElement(By.linkText("Bad Request")).click();
		driver.findElement(By.id("linkResponse")).isDisplayed();

		driver.findElement(By.linkText("Unauthorized")).click();
		driver.findElement(By.id("linkResponse")).isDisplayed();

		driver.findElement(By.linkText("Forbidden")).click();
		driver.findElement(By.id("linkResponse")).isDisplayed();

		driver.findElement(By.linkText("Not Found")).click();
		driver.findElement(By.id("linkResponse")).isDisplayed();

	}

}
