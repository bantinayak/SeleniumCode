package linkTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Moved_link_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/links");
		Thread.sleep(3000);
		driver.findElement(By.id("moved")).click();
		driver.findElement(By.id("linkResponse")).isDisplayed();

	}

}
