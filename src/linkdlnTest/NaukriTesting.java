package linkdlnTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriTesting {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/ul/li[1]/a/div")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		

		//driver.findElement(By.cssSelector("input[type='text'][class='err-border']")).sendKeys("bantinayak888@");
		driver.findElement(By.cssSelector("//*[@id=\"root\"]//div[2]/input")).sendKeys("bantinayak888@");
	}

}
