package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testqa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.cssSelector("input#userName")).sendKeys("pooja");
		driver.findElement(By.cssSelector("input[placeholder='name@example.com']")).sendKeys("pooja2222@");
		driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("dharmagada");
		//driver.quit();
	}

}
