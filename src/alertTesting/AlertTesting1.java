package alertTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTesting1 {

	public static void AlertTesting() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/alerts");

		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

		String afterclick = driver.findElement(By.id("confirmResult")).getText();
		System.out.println("afterclickOk:" + afterclick);
		Thread.sleep(3000);
		driver.findElement(By.id("confirmButton")).click();

		driver.switchTo().alert().dismiss();
		driver.findElement(By.id("confirmButton")).click();

		String afterclick1 = driver.switchTo().alert().getText();
		Thread.sleep(3000);
		System.out.println("afterclickcancel:" + afterclick1);

	}

}
