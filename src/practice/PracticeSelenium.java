package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSelenium {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		// driver.findElement(By.id("userName")).sendKeys("Guruma");
		// driver.findElement(By.className(" mr-sm-2 form-control")).sendKeys("Guruma");
		int abc = driver.findElements(By.tagName("a")).size();
		System.out.println("total div tags are :" + abc);

	}

}
