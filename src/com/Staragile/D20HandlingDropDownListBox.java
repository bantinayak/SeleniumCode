package com.Staragile;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D20HandlingDropDownListBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement drplist = driver.findElement(By.id("cars"));
		Select select = new Select(drplist);
		List<WebElement> cars = select.getOptions();
		for (WebElement d : cars) {
			System.out.println(d.getText());
		}
		System.out.println("***************");
		if (select.isMultiple()) {
			select.selectByIndex(0);
			// System.out.println("select car name is: " +
			// select.getFirstSelectedOption().getText());
			select.selectByIndex(1);
			System.out.println("***************");

			List<WebElement> carlist = select.getAllSelectedOptions();
			for (WebElement c : carlist) {
				System.out.println("total selected car: " + c.getText());
			}

		}

	}

}
