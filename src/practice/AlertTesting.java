package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTesting {

	public static void main(String[] args) {
	/*	SeleniumUtils seleniumutil = new SeleniumUtils();
		System.setProperty("webdriver.chrome.driver",
				seleniumutil.getProjectPath() + "\\resource\\driver\\chromedriver_win32\\chromedriver.exe");*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().accept();
		String actualtext = driver.findElement(By.id("confirmResult")).getText();

		System.out.println("Afteraccept :" + actualtext);

		driver.findElement(By.id("confirmButton")).click();

		driver.switchTo().alert().dismiss();
		actualtext = driver.findElement(By.id("confirmResult")).getText();

		System.out.println("Aftercancel :" + actualtext);
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		System.out.println("alert is present");
		driver.quit();

	}

}
