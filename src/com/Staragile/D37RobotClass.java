package com.Staragile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D37RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.linkText("Automobile")).click();
		driver.findElement(By.linkText("Enter Insurant Data")).click();
		driver.findElement(By.xpath("//button[@id='open']")).click();

		Robot robot = new Robot(); // Creates an instance of the Robot class. 
		                            //This class allows you to simulate keyboard and mouse actions.

		for (int i = 0; i <= 8; i++) {
			robot.delay(1000);
			robot.keyPress(KeyEvent.VK_TAB);
		}
		for (int j = 0; j <= 2; j++) {
			robot.delay(1000);
			robot.keyPress(KeyEvent.VK_UP);

		}
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);

		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_TAB);

		for(int k=0 ; k<=3 ; k++)
		{
			robot.delay(1000);
			robot.keyPress(KeyEvent.VK_TAB);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		

	}
}
