package com.Staragile;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D19HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement drplist = (driver.findElement(By.xpath("//select[@id='country']")));
		Select select = new Select(drplist);
		System.out.println(select.getFirstSelectedOption().getText());
		System.out.println("****************************");

		// print all dropdown country list
		List<WebElement> countrylist = select.getOptions();
		System.out.println("Total countryList: " + countrylist.size());
		System.out.println("****************************");

		// print all country name
		/*
		 * for (WebElement country : countrylist) 
		 * { System.out.println("countryName: " + country.getText()); }
		 */
		int i = 0;
		for (WebElement country : countrylist) {
			System.out.println(i + "." + country.getText());
			i++;
		}
		System.out.println("****************************");
		Thread.sleep(3000);
		// select.selectByVisibleText("Anguilla");
		select.selectByValue("6");
		// select.selectByIndex(4);
		System.out.println("selected Text is: " + select.getFirstSelectedOption().getText());
		// driver.close();
	}

}
