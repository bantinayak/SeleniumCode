package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/buttons");

		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		String TextPrint = driver.findElement(By.xpath("//p[text()='You have done a dynamic click']")).getText();
		System.out.println(TextPrint);

		Actions action = new Actions(driver);
		action.contextClick(driver.findElement(By.xpath("//button[text()='Right Click Me']"))).build().perform();

		Thread.sleep(5000);

		action.doubleClick(driver.findElement(By.xpath("//button[@id='doubleClickBtn']"))).build().perform();

	}

}
