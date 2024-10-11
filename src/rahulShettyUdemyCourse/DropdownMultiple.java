package rahulShettyUdemyCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownMultiple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * SeleniumUtils seleniumutil = new SeleniumUtils();
		 * System.setProperty("webdriver.chrome.driver", seleniumutil.getProjectPath() +
		 * "\\resource\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"
		 * );
		 */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(2000);
		/*
		 * int i = 1; while (i < 5) { driver.findElement(By.id("hrefIncAdt")).click();
		 * i++; }
		 */
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.cssSelector("input[value='Done']")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.quit();

	}

}
