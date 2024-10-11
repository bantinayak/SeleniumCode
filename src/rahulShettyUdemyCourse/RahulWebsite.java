package rahulShettyUdemyCourse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RahulWebsite {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Banti");
		// driver.findElement(By.cssSelector("input#inputUsername")).clear();
		// driver.findElement(By.xpath("//form/input[1]")).sendKeys("banti");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[contains(@name,'chkboxOne')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'chkboxTwo')]")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit signInBtn')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText(),
				"You are successfully logged in.");
		System.out.println(driver.findElement(By.xpath("//div[@class='login-container'] /h2")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container'] /h2")).getText(),
				"Hello Banti,");
		driver.findElement(By.xpath("//button[text()=\"Log Out\"]")).click();
		driver.close();
	}

}
