package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium code\\git-seleniumcode\\selenium_testing\\resource\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("D:\\RESUME\\Mamali.docx");
		driver.quit();
	}

}
