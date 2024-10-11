package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonlib.SeleniumUtils;

public class TestngDataProvider {
	@DataProvider(name = "browsername1")
	public Object[][] createData1() {
		return new Object[][] { { "chrome", "selenium dev" }, { "edge", "testng.org" } ,{"Firefox" , "eclipse"} };
	}

	@Test(dataProvider = "browsername1")
	public void ParameterTest(String browsername, String searchkey) {
		SeleniumUtils seleniumUtil = new SeleniumUtils();
		WebDriver driver = seleniumUtil.launchBrowser(browsername);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys(searchkey, Keys.ENTER);
		String title = driver.getTitle();
		Reporter.log("titleName :" + title, true);
	}

	@Test(dataProvider = "browsername1")
	public void DataName(String browsername, String searchkey) {
		Reporter.log("browsername :" + browsername, true);
		Reporter.log("searchkey :" + searchkey, true);

	}
}
