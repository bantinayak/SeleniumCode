package priyankaMaamDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxies {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		/* using ancestor */
		String ancestortag = driver.findElement(By.xpath("//div[text()='Cantrell']//ancestor::div")).getTagName();
		System.out.println(ancestortag);
		/* using Parent */
		String Parentrtag = driver.findElement(By.xpath("//div[text()='Cantrell']//parent::div")).getTagName();
		System.out.println(Parentrtag);
		/* using child */
		List<WebElement> list = driver.findElements(By.xpath(""));
		System.out.println(list);

		for (WebElement i : list) {
			System.out.println(i.getText());
		}

	}

}
