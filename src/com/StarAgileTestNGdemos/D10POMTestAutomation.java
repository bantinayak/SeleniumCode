package com.StarAgileTestNGdemos;

import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
/*This class contains the actual test case and uses TestNG's 
 * annotations to manage the setup
 *  (@BeforeTest) and teardown (@AfterTest) 
 *  of the WebDriver.*/
public class D10POMTestAutomation {
	WebDriver driver;
	TestAutomation f;
	@Test
	public void login() throws InterruptedException 
	{
		f.userName("student");
		f.loginPassWord("Password123");
		Thread.sleep(2000);
		f.submit();
	}
	@BeforeTest
	public void beforeTest()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		f=new TestAutomation(driver);
		
	}

	@AfterTest
	public void afterTest() 
	{
		driver.close();
	}

}
/*2. D10POMTestAutomation class:
This class contains the actual test case and uses TestNG's annotations to manage the setup (@BeforeTest) and teardown (@AfterTest) of the WebDriver.

Key elements:
WebDriver: A driver object is created to control the Chrome browser.

Test method:

@Test public void login(): This method performs the test scenario where the user logs in by:
Entering the username "student".
Entering the password "Password123".
Clicking the submit button.
Pausing for 2 seconds (Thread.sleep(2000)) before clicking submit, to allow the page to update.
Test setup and teardown:

@BeforeTest public void beforeTest(): This method runs before the test starts.
Initializes the ChromeDriver (driver = new ChromeDriver();).
Maximizes the browser window.
Sets an implicit wait of 20 seconds (driver.manage().timeouts().implicitlyWait(...)).
Navigates to the login page at "https://practicetestautomation.com/practice-test-login/".
Instantiates the TestAutomation class, passing the driver to it.
@AfterTest public void afterTest(): This method runs after the test finishes, closing the browser (driver.close();).
Summary:
The TestAutomation class encapsulates the web page's functionality (username, password, and submit button).
The D10POMTestAutomation class sets up the WebDriver, runs the login test by interacting with the elements using methods in TestAutomation, and then closes the browser after the test.*/























