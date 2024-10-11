package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// web-driver=it is an interface, containing all the with signature
		// ChromeDriver=it ia an class
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("Priya");
		//driver.findElement(By.cssSelector("input[placeholder='name@example.com']")).sendKeys("priya123");
		//driver.findElement(By.cssSelector("input[id='userEmail'][placeholder='name@example.com']")).sendKeys("priya123");
		driver.findElement(By.cssSelector("textarea#currentAddress")).sendKeys("Bangalore");
		
	}
}
