package frame_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.switchTo().frame("frame1");
		int totalSampleHeaderText = driver.findElements(By.xpath("//*[text()='This is a sample page']")).size();
		System.out.println("totalSampleHeaderText:" + totalSampleHeaderText);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		int totalSampleHeaderText1 = driver.findElements(By.xpath("//*[text()='This is a sample page']")).size();
		System.out.println("totalSampleHeaderText1:" + totalSampleHeaderText1);

	}

}
