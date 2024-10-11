package com.Staragile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class D06CrossBrowserTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver1 = new EdgeDriver();
		driver1.get("https://www.google.co.in/");
		String url1 = driver1.getCurrentUrl();
		System.out.println("Edgeurl name is: " + url1);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String url = driver.getCurrentUrl();
		System.out.println("chromeUrl name is: " + url);
				
		Thread.sleep(3000);
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://www.google.co.in/");
		String url2 = driver2.getCurrentUrl();
		System.out.println("Firefoxurl name is: " + url2);
	}

}
