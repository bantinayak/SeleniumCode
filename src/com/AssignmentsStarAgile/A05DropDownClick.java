package com.AssignmentsStarAgile;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A05DropDownClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// driver.get("https://echoecho.com/");
		driver.get("https://echoecho.com/htmlforms11.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		/*
		 * driver.findElement(By.linkText("Tutorials")).click();
		 * driver.findElement(By.linkText("HTML")).click();
		 * driver.findElement(By.linkText("HTML FORMS")).click();
		 * driver.findElement(By.partialLinkText("DROP")).click();
		 */

		Select select = new Select(driver.findElement(By.name("mydropdown")));
		select.selectByIndex(1);
		System.out.println("Text is: " + select.getFirstSelectedOption().getText());

		select.selectByIndex(1);
		System.out.println("2nd Text is: " + select.getFirstSelectedOption().getText());
		System.out.println("***************");
		List<WebElement> alloptions=select.getOptions();
		for(WebElement i : alloptions)
		{
			System.out.println(i.getText());
		}

		driver.close();

	}

}
