package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.Dimension;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class A {
	private WebDriver driver;

	JavascriptExecutor js;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void loginPage() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().setSize(new Dimension(1366, 728));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector(".oxd-button")).click();

		driver.findElement(By.linkText("Logout")).click();

	}

}
