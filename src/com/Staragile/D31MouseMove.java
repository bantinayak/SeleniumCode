package com.Staragile;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D31MouseMove {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://istqb.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Actions action = new Actions(driver);
		WebElement menu = driver.findElement(By.linkText("SPECIALIST"));
		action.moveToElement(menu);
		action.build().perform();
		List<WebElement> menus = driver.findElements(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[6]/div/div/ul/li"));

		for (WebElement i : menus) {
			System.out.println(i.getText());
		}
		driver.quit();

	}

}
