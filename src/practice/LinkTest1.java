package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		/*
		 * driver.findElement(By.linkText("Gmail")).click();
		 * driver.navigate().back();//back to the main page
		 * driver.findElement(By.linkText("Images")).click(); driver.navigate().back();
		 * driver.findElement(By.linkText("Advertising")).click();
		 */
		
		driver.findElement(By.partialLinkText("Gm")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Im")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Adver")).click();
		//driver.close();

	}

}
