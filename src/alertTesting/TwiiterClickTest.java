package alertTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwiiterClickTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/account/send_password_reset?cause=br");
		// driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//form[@method='post']//input[@type='submit']")).click();
		// driver.findElement(By.xpath("//input[@type='submit'][@value='Next']")).click();
		// driver.findElement(By.cssSelector("input[type='submit'][value='Next']")).click();
		System.out.println("hii");

	}

}
