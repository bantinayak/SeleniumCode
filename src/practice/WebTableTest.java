package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/webtables");
		driver.findElement(By.xpath("//div[text()='Alden']/ancestor::div[@role='rowgroup']/div/div[6] ")).click();
		System.out.println("hi");
		
		driver.quit();
	}

}
