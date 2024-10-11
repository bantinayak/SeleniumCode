package locator_cssLSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_hierchy_element_username {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");

		driver.findElement(By.cssSelector("form#userForm>div:nth-of-type(1)>div>input")).sendKeys("banti888@");
		//driver.findElement(By.cssSelector("form#userForm input#userName")).click();//sendKeys("banti888@");
	}

}
