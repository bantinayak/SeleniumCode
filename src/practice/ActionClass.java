package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		// ChromeDriver() driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Select selectColour = new Select(driver.findElement(By.cssSelector("select#oldSelectMenu")));

		selectColour.selectByIndex(2);
		Thread.sleep(1200);
		selectColour.selectByVisibleText("Purple");
		Thread.sleep(1200);
		selectColour.selectByValue("5");
		Thread.sleep(1200);
		driver.findElement(By.cssSelector("select#oldSelectMenu")).click();

	}

}