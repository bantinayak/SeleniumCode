package xpath_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonlib.SeleniumUtils;

public class Element_to_form_how_to_go {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumUtils seleniumutil = new SeleniumUtils();
		System.setProperty("webdriver.chrome.driver", seleniumutil.getProjectPath()
				+ "\\resource\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/links");

		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/following-sibling::div[2]"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/preceding-sibling::div[1]"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/parent-sibling::div[1]"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/ancestor::div[1]")).click();
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/ancestor::div[@class='container playgound-bod"))
				.click();
	}

}
