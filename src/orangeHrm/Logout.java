package orangeHrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class Logout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(
				By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
				.click();
          //assert condition
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Login Fail");
		System.out.println("Login Successfull");
		// logout
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		System.out.println("Logout Succesfull");
	}

}
