package alertTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickButtontoSeeAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		JavascriptExecutor js;
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//button[@type='button'][@id='alertButton']")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();

		String afterselect = driver.findElement(By.xpath("//button[@type='button'][@id='alertButton']")).getText();
		System.out.println(afterselect);
	}

}
