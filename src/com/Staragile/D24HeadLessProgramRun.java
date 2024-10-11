package com.Staragile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class D24HeadLessProgramRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions op = new ChromeOptions();
		//op.addArguments("--headless"); //IF You run without opening browser 
		op.addArguments("--incognito"); //IF You run with incogniti mode
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
	}

}
