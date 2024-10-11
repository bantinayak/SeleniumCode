package com.AssignmentsStarAgile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A07RedBusAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notification");// for disable notification

		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		/*1. it doesn't take mandatory delay
		  2.it is applicable through out the script*/

		// source
		driver.findElement(By.id("src")).sendKeys("Bangalore");
		// driver.findElement(By.xpath("(//text[@class='placeHolderMainText'])[1]")).click();
		driver.findElement(By.xpath("//text[@class='placeHolderMainText'][normalize-space()='Bangalore']")).click();

		// destination
		driver.findElement(By.id("dest")).sendKeys("Pune");
		driver.findElement(By.xpath("//text[@class='placeHolderMainText'][normalize-space()='Pune']")).click();
		
		Thread.sleep(3000);/*1.Thread.sleep it takes mandatory delay
		                     2.it is applicable to only single statement*/
		// date
		driver.findElement(By.xpath("//span[text()[normalize-space()='Date']]")).click();
		
		// driver.findElement(By.xpath("//span[text()[normalize-space()='16']]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='26']")).click();

		// submit
		driver.findElement(By.id("search_button")).click();

		// result
		System.out.println(driver.findElement(By.xpath("//*[.='Volvo Multi Axle Sleeper B11R (2+1)']")).getText());

		System.out.println("code success");

		// driver.close();

	}

}
