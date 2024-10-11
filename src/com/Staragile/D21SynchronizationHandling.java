package com.Staragile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D21SynchronizationHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//synchronization handling
		/*
		 * it is mainly 5 types
		 * 1.Thread.sleep()
		 * 2,implicitlyWait
		 * 3.ExplicitlyWait
		 * 4.FluentWait
		 * 5.PageLoadTimeOut
		 */

		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals("Selenium")) {
			System.out.println("testCase pass");
		} else {
			System.out.println("testCase Fail");
		}
		driver.close();
	}

}
