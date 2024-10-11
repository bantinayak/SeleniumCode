package hobbies;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HobbiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement checkBox = driver.findElement(By.xpath("//label[text()='Reading']//preceding-sibling::input"));
		j.executeScript("arguments[0].scrollIntoView(true);", checkBox);
		driver.findElement(By.xpath("//label[text()='Reading']//preceding-sibling::input")).click();
	//	driver.quit();

	}

}
