package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();
		/*driver.findElement(By.linkText("Created")).click();
		String create=driver.findElement(By.linkText("Created")).getText();
		System.out.println(create);*/
		
		driver.findElement(By.partialLinkText("Crea")).click();
		String create1=driver.findElement(By.partialLinkText("Crea")).getText();
	
		System.out.println(create1);
	}

}
