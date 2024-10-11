package com.Staragile;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D29HandlingMenus {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.istqb.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> menuList = driver.findElements(By.xpath("//*[@id='sp-menu']/div/nav/ul/li"));
		for (WebElement i : menuList) 
		{
			System.out.println(i.getText());
		}
		driver.quit();

	}

}
