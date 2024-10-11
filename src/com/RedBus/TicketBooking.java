package com.RedBus;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TicketBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-popup-blocking");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.cssSelector("input#src")).sendKeys("Kolkata");
		driver.findElement(By.cssSelector("input#src")).click();

		driver.findElement(By.cssSelector("input#dest")).sendKeys("Baroda");
		driver.findElement(By.xpath("(//text[@class='placeHolderMainText'])[1]")).click();

		List<String> weekdates = getWeekEndDates("june2024");
		System.out.println(weekdates);
	}

	private static List<String> getWeekEndDates(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
