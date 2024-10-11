package rahulShettyUdemyCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement dragable = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropable = new Select(dragable);
		dropable.selectByIndex(3);
		Thread.sleep(2000);
		System.out.println(dropable.getFirstSelectedOption().getText());
		dropable.selectByVisibleText("INR");
		System.out.println(dropable.getFirstSelectedOption().getText());
		driver.close();

	}

}
