package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Priya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("patnaik");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8688875178");

		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("12345678");

		Select select = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		select.selectByIndex(5);

		Select select1 = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
		select1.selectByVisibleText("Oct");

		Select select2 = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
		select2.selectByValue("1994");

		driver.findElement(By.xpath("//label[text()='Female']")).click();

		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

		System.out.println("program successfull");
	}

}
