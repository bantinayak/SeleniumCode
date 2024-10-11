package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D01practice1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		/*
		 * Webdriver is an interface, where we contain all the method with in a
		 * signature The new keyword in Java is used to create a new instance
		 * chromedriver is a class
		 */
		driver.get("https://demoqa.com/automation-practice-form");// navigate to the browser

		// maximize the page
		driver.manage().window().maximize();
		/*
		 * locator is mainly 8types 1.id 2.tagName 3,className 4.cssSelector
		 * 5.xpath(1.absulate, 2.relative) 6.linkTest 7.PartialLinkTest
		 */
		// first name
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[1]/div[2]/input"))
				//.sendKeys("pavani");
		driver.findElement(By.id("firstName")).sendKeys("pavani");
		/*WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("pavani");*/
		/*
		 * WebElement: It basically represents a DOM element : it is an interface
		 */
		// lastname
		// driver.findElement(By.id("lastName")).sendKeys("Ballary");
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("Ballary");
		// email

		// driver.findElement(By.id("userEmail")).sendKeys("pavani111");
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("pavani111");
		// mobno
		// driver.findElement(By.cssSelector("input[placeholder='Mobile
		// Number']")).sendKeys("111");
		//driver.findElement(By.cssSelector("input[placeholder='Mobile Number'][id='userNumber']")).sendKeys("111");
		driver.findElement(By.cssSelector("input#userNumber")).sendKeys("112");
	}

}
