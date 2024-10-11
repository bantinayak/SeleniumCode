package com.Staragile;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AA {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

	    try {
	        // Open the URL
	        driver.get("https://demoqa.com/automation-practice-form");

	        // Maximize the browser window
	        driver.manage().window().maximize();

	        // Fill in the first name
	        WebElement firstName = driver.findElement(By.id("firstName"));
	        firstName.sendKeys("John");

	        // Fill in the last name
	        WebElement lastName = driver.findElement(By.id("lastName"));
	        lastName.sendKeys("Doe");

	        // Fill in the email
	        WebElement email = driver.findElement(By.id("userEmail"));
	        email.sendKeys("johndoe@example.com");

	        // Select the gender
	        WebElement genderMale = driver.findElement(By.xpath("//label[contains(text(), 'Male')]"));
	        Thread.sleep(8000);
	        genderMale.click();

	        // Fill in the mobile number
	        WebElement mobileNumber = driver.findElement(By.id("userNumber"));
	        mobileNumber.sendKeys("1234567890");
	        Thread.sleep(4000);

	        // Set the date of birth
	        WebElement dateOfBirth = driver.findElement(By.id("dateOfBirthInput"));
	        Thread.sleep(6000);

	        dateOfBirth.click();
	        Select month = new Select(driver.findElement(By.className("react-datepicker__month-select")));
	        month.selectByVisibleText("April");
	        Select year = new Select(driver.findElement(By.className("react-datepicker__year-select")));
	        year.selectByVisibleText("1990");
	        WebElement day = driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day') and text()='15']"));
	        day.click();

	        // Fill in the subjects
	        WebElement subjects = driver.findElement(By.id("subjectsInput"));
	        subjects.sendKeys("Maths");
	        subjects.sendKeys("\n");

	        // Select hobbies
	        WebElement hobbySports = driver.findElement(By.xpath("//label[contains(text(), 'Sports')]"));
	        Thread.sleep(4000);

	        hobbySports.click();

	        // Upload a picture
	        WebElement uploadPicture = driver.findElement(By.id("uploadPicture"));
	        uploadPicture.sendKeys("D:\\RESUME\\Banti resume1.pdf");

	        // Fill in the current address
	        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
	        currentAddress.sendKeys("123 Main St, Anytown, USA");

	        // Select state and city
	        WebElement state = driver.findElement(By.id("react-select-3-input"));
	        state.sendKeys("NCR");
	        state.sendKeys("\n");
	        WebElement city = driver.findElement(By.id("react-select-4-input"));
	        city.sendKeys("Delhi");
	        city.sendKeys("\n");

	        // Submit the form
	        WebElement submitButton = driver.findElement(By.id("submit"));
	        Thread.sleep(4000);

	        submitButton.click();
	        Thread.sleep(6000);

	        submitButton.sendKeys(Keys.ENTER);
	       

	        // Wait for a few seconds to observe the result

	    } catch (Exception e) {
	        e.printStackTrace();
	  
		}
	}

}
