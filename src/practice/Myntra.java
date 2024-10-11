package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) {

		// webdriver= it is an interface, where contain all the method with in
		// asignature
		// chromedriver= it is a class
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");// navigate to the url
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    //id
		/*
		 * driver.findElement(By.id("email")).sendKeys("Bhagawati");
		 * driver.findElement(By.id("pass")).sendKeys("Naik");
		 */
		
		//cssSelector
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Bhagawati");
		driver.findElement(By.cssSelector("input[type='password'][id='pass']")).sendKeys("naik");
		
	}

}
