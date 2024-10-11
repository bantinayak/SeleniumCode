package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.linkText("Gmail")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Ima")).click();
		System.out.println("program succesfull");
		
		

	}

}
