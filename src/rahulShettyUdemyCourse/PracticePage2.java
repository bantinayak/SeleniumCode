package rahulShettyUdemyCourse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticePage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out
				.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		// xpath[//header/div/button[3]/preceding-sibling::button[1]]
		System.out.println(driver.findElement(By.xpath("//header/div/button[2]/parent::div/button[3]")).getText());
		// driver.close();
	}

}
