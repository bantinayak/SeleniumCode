package com.Staragile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D05ReadURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String url = driver.getCurrentUrl();
		System.out.println("url name is: " + url);
	}

}
