package com.Staragile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D03GetTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String Title = driver.getTitle();
		System.out.println("Title name is: " + Title);

	}

}
