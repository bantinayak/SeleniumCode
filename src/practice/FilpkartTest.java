package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilpkartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("7676312795");
		// driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		driver.findElement(By.className("_7Pd1Fp")).click();
		// driver.findElement(By.cssSelector(".QqFHMw.twnTnD._7Pd1Fp")).click();
	}

}
