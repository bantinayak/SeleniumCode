package orangeHrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*
		 * ChromeOptions option = new ChromeOptions();
		 * option.addArguments("--remote-allow-origins=*");
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(
				By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
				.click();
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Banti");
		driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys("");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Nayak");
		driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")).click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("Banti");
		//driver.findElement(By.xpath("")).sendKeys("Banti");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Banti123");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Banti123");
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Banti");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Banti123");
		driver.findElement(
				By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
				.click();
	


	}

}
