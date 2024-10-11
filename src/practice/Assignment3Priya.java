package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3Priya {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Select select=new Select(driver.findElement(By.id("oldSelectMenu")));
		select.selectByIndex(2);//green
		Thread.sleep(5000);
		select.selectByVisibleText("Black");//black
		Thread.sleep(5000);
		select.selectByValue("7");//voilet
		System.out.println("hi");
		
	}

}
