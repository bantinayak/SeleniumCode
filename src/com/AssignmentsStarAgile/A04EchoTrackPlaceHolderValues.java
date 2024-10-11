package com.AssignmentsStarAgile;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A04EchoTrackPlaceHolderValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List<WebElement> attribute = driver.findElements(By.className("form-control"));
		// System.out.println(attribute.get(0).getAttribute("placeholder"));
		// System.out.println(attribute.get(1).getAttribute("placeholder"));

		for (WebElement l : attribute)
			System.out.println(l.getAttribute("placeholder"));
		driver.close();

	}

}
