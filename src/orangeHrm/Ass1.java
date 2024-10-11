package orangeHrm;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(
				By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
				.click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[.='Admin'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[normalize-space()='Admin'])[2]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("running success");


	}

}


