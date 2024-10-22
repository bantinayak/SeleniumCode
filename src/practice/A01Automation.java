package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A01Automation {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize(); //for maximize the page
	driver.get("https://practicetestautomation.com/practice-test-login/");
	//navigate to browser
	
	driver.findElement(By.id("username")).sendKeys("student");
	

	driver.findElement(By.id("password")).sendKeys("Password123");

	
	driver.findElement(By.id("submit")).click();
	
	
	

	}

}
