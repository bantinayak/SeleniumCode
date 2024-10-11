package com.Staragile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D36Slide {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions action=new Actions(driver);
		driver.switchTo().frame(0);
		
		WebElement element=driver.findElement(By.xpath("//div[@id='slider']/span"));
		action.dragAndDropBy(element, element.getLocation().x+180, element.getLocation().y);
		action.build().perform();

	}

}
