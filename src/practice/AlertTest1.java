package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertTest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions action = new Actions(driver);
		Thread.sleep(1000);
		action.moveToElement(driver.findElement(By.id("toolTipButton"))).build().perform();
		driver.findElement(By.xpath("//*[text()='You hovered over the Button']")).isDisplayed();
	}

}
