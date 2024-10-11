package com.AssignmentsStarAgile;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A06CheckBoxHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		/*WebElement products = driver.findElement(By.cssSelector("input[name^='option1']"));
		System.out.println("Before click");
		System.out.println("check Display: " + products.isDisplayed());
		System.out.println("check Enable: " + products.isEnabled());
		System.out.println("check Select: " + products.isSelected());

		if (products.isSelected() == false)
			products.click();

		System.out.println("after click");
		System.out.println("check Display: " + products.isDisplayed());
		System.out.println("check Enable: " + products.isEnabled());
		System.out.println("check Select: " + products.isSelected());*/
		
		
		//List<WebElement> product=driver.findElements(By.cssSelector("input[name^=option]"));
		List<WebElement> product=driver.findElements(By.xpath("//input[contains(@name,'option')]"));
		for(WebElement i : product)
		{
			System.out.println("Before click");
			System.out.println(i.getAttribute("type")+"\n"+"check Display: " + i.isDisplayed());
			System.out.println("check Enable: " + i.isEnabled());
			System.out.println("check Select: " + i.isSelected());

			if (i.isSelected() == false)
				i.click();

			System.out.println("after click");
			System.out.println("check Display: " + i.isDisplayed());
			System.out.println("check Enable: " + i.isEnabled());
			System.out.println("check Select: " + i.isSelected());
		}

	}

}
