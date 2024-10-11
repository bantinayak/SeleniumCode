package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// webdriver=it is an interface, containing all the methods with signature
		// chrome driver=it is an class, by uising this class we run chrome driver
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();

		driver.findElement(By.id("userName")).sendKeys("banti");
		//driver.findElement(By.cssSelector("input[placeholder='name@example.com']")).sendKeys("RAMYA234");
		driver.findElement(By.cssSelector("")).sendKeys("RAMYA234");
		

	}

}
