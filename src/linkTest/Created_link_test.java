package linkTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Created_link_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://demoqa.com/links");
		driver.findElement(By.xpath("//a[@id='created']")).click();
		System.out.println("hi");
		//driver.findElement(By.id("created")).click();

	}

}
