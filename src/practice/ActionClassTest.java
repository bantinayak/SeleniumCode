package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

public class ActionClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//button[@id='toolTipButton']"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Hover me to see']")).isDisplayed();

		driver.quit();
		Reporter.log("hi");
	}

}
