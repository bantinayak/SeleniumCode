package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame("frame1");
		int countheader = driver.findElements(By.xpath("//*[text()='This is a sample page']")).size();
		System.out.println("countheader = " + countheader);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		int countheader2 = driver.findElements(By.xpath("//*[text()='This is a sample page']")).size();
		System.out.println("countheader2 = " + countheader2);

	}

}
