package rahulShettyUdemyCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		Select selectcountry = new Select(
				driver.findElement(By.cssSelector("select[groupcontrolid='ctl00_mainContent_group_details']")));
		selectcountry.selectByVisibleText("Gwalior (GWL)");
	}

}
