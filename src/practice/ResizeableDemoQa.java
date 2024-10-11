package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeableDemoQa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/resizable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement resizeable = driver.findElement(By.xpath(
				"//div[@id='resizableBoxWithRestriction']//span[@class='react-resizable-handle react-resizable-handle-se']"));
		Actions action = new Actions(driver);
		action.clickAndHold(resizeable);
		action.moveByOffset(150, 150);
		action.release().perform();
		System.out.println("hi");

	}

}
