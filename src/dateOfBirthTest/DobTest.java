package dateOfBirthTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonlib.SeleniumUtils;

public class DobTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// wait for an element for the given time period,until the element is loaded is called implicitlyWait object
		// ONCE THE ELEMENT IS LOADED,PERFORM THE ACTION.
		// IF THE ELEMENT IS NOT LOADED IN THE GIVEN,SCRIPT SHOULD TERMINATED.
		// IMPLICIT WAIT IS APPLICABLE THE BROWSER LEVEL.
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.CONTROL, "a");
		//driver.findElement(By.id("dateOfBirthInput")).clear();

		driver.findElement(By.id("dateOfBirthInput")).sendKeys("29 May 2022");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("dateOfBirthInput")));
		// driver.quit();
		System.out.println("hii");
	}

}
