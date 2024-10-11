package com.Staragile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Subject {

	public static void main(String[] args) {
	

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        // Locate and interact with the date input
        WebElement dateInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='dateOfBirthInput']")));
        dateInput.clear();
        dateInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        dateInput.sendKeys("22 Jan 2023");

        // Use JavascriptExecutor to scroll down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)", "");

        // Locate and interact with the subjects input
        WebElement subjectsInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")));
        subjectsInput.sendKeys("StarAgileAutomation");

        // Optionally, you can submit the form or verify other actions

        // Close the browser
        driver.quit();

	}

}
