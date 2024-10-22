package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("banti");
		driver.findElement(By.id("pass")).sendKeys("123");
		
		driver.findElement(By.id("loginbutton")).click();

	}

}
