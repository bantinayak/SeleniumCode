package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// driver.findElement(By.id("userName")).sendKeys("banti");
		driver.findElement(By.cssSelector("form>div:nth-of-type(2)>div>input")).sendKeys("Banti");
		driver.findElement(By.cssSelector("form#userForm div#userEmail-wrapper")).sendKeys("Banti");
		driver.findElement(By.cssSelector("input[placeholder=\"name@example.com\"]")).sendKeys("banti111");
		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Banti");
		driver.findElement(By.xpath("//label[text()='Current Address']")).sendKeys("Banti");
		driver.findElement(By.xpath("//label[contains(.,'Current Address')]")).sendKeys("Banti");

		// driver.quit();
		Thread.sleep(200);
		driver.get("https://demoqa.com/links");
		driver.findElement(By.linkText("moved")).click();

	}

}
