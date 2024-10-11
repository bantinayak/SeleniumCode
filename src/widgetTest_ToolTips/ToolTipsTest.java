package widgetTest_ToolTips;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/tool-tips");
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.id("toolTipButton"))).build().perform();
		driver.findElement(By.xpath("//*[text()='You hovered over the Button']")).isDisplayed();
	}

}
