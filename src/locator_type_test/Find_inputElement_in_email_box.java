package locator_type_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_inputElement_in_email_box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		int totalInputElements = driver.findElements(By.tagName("input")).size();
		System.out.println("totalInputElements:" + totalInputElements);
	}

}
