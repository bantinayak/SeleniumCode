package rahulShettyUdemyCourse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DynamicallyPWchange {
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Reset Login']")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		// Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = passwordText.split("'");

		String password = passwordArray[1].split("'")[0];
		System.out.println("password= " + password);
		return password;

		// 0th index=Please use temporary password
		// 1st index=rahulshettyacademy' to Login.

		// 0th index=rahulshettyacademy
		// 1st index=to Login.

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "Banti";
	

		WebDriver driver = new ChromeDriver();
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(name);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[contains(@name,'chkboxOne')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'chkboxTwo')]")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit signInBtn')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText());

		driver.findElement(By.xpath("//button[text()=\"Log Out\"]")).click();
		driver.close();

	}

}
