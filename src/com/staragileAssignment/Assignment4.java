package com.staragileAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		// firstName
		driver.findElement(By.id("firstName")).sendKeys("Banti");
		
		//LastName
		driver.findElement(By.id("lastName")).sendKeys("nayak");
		
		//Email
		driver.findElement(By.cssSelector("input#userEmail")).sendKeys("bantinayak888@gmail.com");
        
		//choose gender
		JavascriptExecutor js;
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)", "");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='gender-radio-1']")));
		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
        
		//fill mobile number
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9861986899");
        
		//fill dob
		//driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).clear();
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).sendKeys(Keys.CONTROL, "a");
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).sendKeys("18 Jun 2024");
        
		//subject
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 550)", "");
		WebElement subjectadd = driver.findElement(By.id("subjectsInput"));
		subjectadd.sendKeys("h");
		subjectadd.click();
		subjectadd.sendKeys(Keys.ENTER);
		
		//hobbies  
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 550)", "");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='hobbies-checkbox-1']")));
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
        
		//uploadpic
		driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("D:\\RESUME\\Banti resume1.pdf");
        
		//address
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("pune");
        
		//select state
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 550)", "");
		WebElement stateclick = driver.findElement(By.id("react-select-3-input"));
		stateclick.sendKeys("NCR");
		stateclick.click();
		stateclick.sendKeys(Keys.ENTER);
	
		//selectcity
		Thread.sleep(4000);
		WebElement cityclick = driver.findElement(By.id("react-select-4-input"));
		cityclick.sendKeys("Delhi");
		cityclick.click();
		cityclick.sendKeys(Keys.ENTER);
        //submit
		driver.findElement(By.xpath("//button[@id='submit']")).submit();
		//driver.quit();

	}

}
