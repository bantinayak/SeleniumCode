package orangeHrm;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Menulist1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(
				By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
				.click();
		Thread.sleep(6000);
    	List<WebElement> mlist=driver.findElements(By.xpath
			    ("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li"));
	System.out.println("Menu list count is: "+mlist.size());
	
	for(WebElement m:mlist)
	{
		System.out.println("Menu List: "+m.getText());
	if(m.getText().contains("Buzz"))
		{
			m.click();
			break;
		}
	}

	}

}
