package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commonlib.SeleniumUtils;

public class TestngParameterTest {
	@Parameters({ "browsername" })
	@Test
	public void ParameterTest(String browsername) {
		SeleniumUtils seleniumUtil = new SeleniumUtils();
		WebDriver driver = seleniumUtil.launchBrowser(browsername);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("seleniumDev", Keys.ENTER);
		String title = driver.getTitle();
		Reporter.log("titleName :" + title, true);
	}
}
