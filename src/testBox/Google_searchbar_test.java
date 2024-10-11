package testBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_searchbar_test {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();// browser object
        //webdriver=it is an interface contaning all method with signature
        //chromedriver=it is a class to lunch a chrome browser
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).isDisplayed();// verify search bar exist
		driver.findElement(By.name("q")).sendKeys("selenium dev");// type text on search bar
		String titlebeforesubmit = driver.getTitle();
		driver.findElement(By.name("q")).submit();
		String titleaftersubmit = driver.getTitle();
		if (titlebeforesubmit.equals(titleaftersubmit)) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}
	}

}
