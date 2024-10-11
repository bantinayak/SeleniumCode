package com.buttonElementActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Click_me_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demoqa.com/buttons");
		// Thread.sleep(1000);
		// Actions action=new Actions(driver);
		// action.click(driver.findElement(By.id("bDxEr"))).build().perform();
		// driver.findElement(By.id("dynamicClickMessage")).isDisplayed();
		driver.findElement(By.xpath("//*[.='Click Me']")).click();
		driver.findElement(By.xpath("//*[@id=\"dynamicClickMessage\"]")).isDisplayed();

	}

}
