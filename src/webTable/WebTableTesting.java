package webTable;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.findElement(By.xpath("//div[text()='Cierra']/ancestor::div[@role='rowgroup']/div/div[6]")).click();
	}

}
