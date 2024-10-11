package com.Staragile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D32MouseClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Actions action = new Actions(driver);
		/*
		 * WebElement doubleClick=driver.findElement(By.id("doubleClickBtn"));
		 * action.moveToElement(doubleClick).doubleClick().build().perform();
		 */

		action.doubleClick(driver.findElement(By.id("doubleClickBtn"))).build().perform();
		System.out.println(driver.findElement(By.xpath("//p[text()='You have done a double click']")).getText());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,255)", "");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[text()='Right Click Me']")));

		/*
		 * WebElement rightClick =
		 * driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		 * action.moveToElement(rightClick).contextClick().build().perform();
		 */

		action.contextClick(driver.findElement(By.xpath("//button[text()='Right Click Me']"))).build().perform();
		System.out.println(driver.findElement(By.id("rightClickMessage")).getText());
        
		
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		System.out.println(driver.findElement(By.id("dynamicClickMessage")).getText());
		
		driver.quit();

	}

}
