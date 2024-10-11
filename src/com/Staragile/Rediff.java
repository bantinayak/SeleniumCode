package com.Staragile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Rediff {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Banti nayak");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("nayak");
		driver.findElement(By.cssSelector("input#newpasswd")).sendKeys("bantinayak888");
		driver.findElement(By.cssSelector("input#newpasswd1")).sendKeys("bantinayak888");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("9861986899");

		Select select = new Select(driver.findElement(By.cssSelector("select#country")));
		select.selectByIndex(210);
		Thread.sleep(2000);
		select.selectByVisibleText("United States");
		Thread.sleep(2000);
		select.selectByValue("6");
		
		
		Select selectDT = new Select(driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]")));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		selectDT.selectByIndex(7);
		//selectDT.selectByValue("06");
		//selectDT.selectByVisibleText("06");
		
		
		
		Thread.sleep(4000);
		
		Select selectMonth = new Select(driver.findElement(By.xpath("(//select[@onchange='fieldTrack(this);'])[3]")));
		selectMonth.selectByVisibleText("MAY");
		Thread.sleep(4000);
		
		Select selectYear = new Select(driver.findElement(By.xpath("(//select[@onchange='fieldTrack(this);'])[4]")));
		selectYear.selectByVisibleText("1996");
		Thread.sleep(4000);
		driver.close();
		
	}

}
