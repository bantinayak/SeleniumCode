package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	/*	JavascriptExecutor js;
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)", "");*/
		
	/*	WebElement subjectadd = driver.findElement(By.id("subjectsInput"));
		subjectadd.click();
		subjectadd.sendKeys("Maths");
		subjectadd.sendKeys(Keys.ENTER);*/
		
		WebElement subjectadd = driver.findElement(By.id("subjectsInput"));
		subjectadd.sendKeys("h");
		subjectadd.click();
		subjectadd.sendKeys(Keys.ENTER);
		

	}
}
