package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGdEPENDANCY1 extends Base {


	@Test(description = "to verify google search for keyword selenium dev")
	public void GoogSearchTest() throws InterruptedException {

		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("seleniumDev", Keys.ENTER);
		String title = driver.getTitle();
		Assert.assertEquals(title, "seleniumDev ", "it is passed");
		Reporter.log("Search result title :" + title, true);

	}

	@Test(description = "to verify google search for keyword javatpoint", dependsOnMethods = "GoogSearchTest")
	public void JavatpointTest() throws InterruptedException {

		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("javatpoint", Keys.ENTER);
		String title = driver.getTitle();
		Reporter.log("Search result title :" + title, true);

	}

	@Test(description = "to verify google search for keyword BrowserStack", dependsOnMethods = "JavatpointTest", alwaysRun = true)
	public void BrowserStackTest() throws InterruptedException {

		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("BrowserStackTest", Keys.ENTER);
		String title = driver.getTitle();
		Reporter.log("Search result title :" + title, true);

	}
}
