package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateOfBirth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demoqa.com/automation-practice-form");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).clear();
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).sendKeys(Keys.CONTROL, "a");
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).sendKeys("22 Jan 2023");
		//driver.quit();*/
		
	/*	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		JavascriptExecutor js;
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)", "");
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Naga");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Veni");
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("vnagaveni001@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("9999999999");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[5]/div[2]/div[1]/div/input")).click(); // to select user DOB
		
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[8]")).click(); //month
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[95]")).click();//year
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]")).click();  */  //Date
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		JavascriptExecutor js;
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)", "");
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Naga");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Veni");
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("vnagaveni001@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("9999999999");

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[5]/div[2]/div[1]/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[8]")).click(); //month
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[95]")).click();//year
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]")).click();
	}

}
