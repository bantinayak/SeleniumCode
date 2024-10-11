package com.Staragile;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D15LocateByTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("link size is: " + link.size());

		// print 1st and 2nd link
		System.out.println(link.get(0).getText());
		System.out.println(link.get(1).getText());

		System.out.println("**********************************");
		// print all link
		/*for (int i = 0; i <= 24; i++) {
			System.out.println(link.get(i).getText());
		}*/
		
		for(WebElement i : link)
		{
			System.out.println(i.getText()+ "\t");
		}
		driver.close();
	}

}
