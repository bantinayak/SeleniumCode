package uploadTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/automation-practice-form");

		//driver.findElement(By.id("uploadPicture")).sendKeys("D:\\SELENEUM TEST_SCRIPT\\boat earphone.pdf");
		driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("D:\\RESUME\\Banti resume1.pdf");

	}

}
