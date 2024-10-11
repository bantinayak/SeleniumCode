package rahulShettyUdemyCourse;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VegPrint {

	public static void main(String[] args) {

		String[] veggies = { "Cucumber", "Brocolli", "Beans" };
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formatedName = name[0].trim();
			List itemsneed = Arrays.asList(veggies);

			if (itemsneed.contains(formatedName)) {
				driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();

			}

		}
		System.out.println("items added successfully");
		//driver.quit();

	}

}
