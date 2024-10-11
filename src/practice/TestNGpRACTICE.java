package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGpRACTICE extends Base {
	

	@Test(description = "to verify google search for keyword selenium dev", priority = 3)
	public void GoogSearchTest() throws InterruptedException {

		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("seleniumDev", Keys.ENTER);
		String title = driver.getTitle();
		Reporter.log("Search result title :" + title, true);

	}

	@Test(description = "to verify google search for keyword javatpoint", priority = 2 , groups="group1")
	public void JavatpointTest() throws InterruptedException {

		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("javatpoint", Keys.ENTER);
		String title = driver.getTitle();
		Reporter.log("Search result title :" + title, true);

	}

	@Test(description = "to verify google search for keyword BrowserStack", priority = 1)
	public void BrowserStackTest() throws InterruptedException {

		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("BrowserStackTest", Keys.ENTER);
		String title = driver.getTitle();
		Reporter.log("Search result title :" + title, true);

	}
}
