package linkdlnTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.linkedin.com/checkpoint/lg/sign-in-another-account");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// driver.findElement(By.cssSelector("input[name='session_key'][type='text']")).sendKeys("bantinayak8898");
		// driver.findElement(By.cssSelector("input#username")).sendKeys("bantinayak888");
	// driver.findElement(By.id("username")).sendKeys("bantinayak888");
		driver.findElement(By.cssSelector("form>div:nth-of-type(1)>input")).sendKeys("bantinayak888");
		// driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/form/div[1]/input")).sendKeys("bantinayak888");
		// driver.findElement(By.xpath("/html/body//div[1]/input")).sendKeys("bantinayak888");
	//	driver.findElement(By.xpath("//div[1]/input[@name='session_key']")).sendKeys("bantinayak888@gamil.com");
		// driver.findElement(By.cssSelector("input#password")).sendKeys("bantinayak888");
		// driver.findElement(By.cssSelector("input[id='password']")).sendKeys("bantinayak888");
		// driver.findElement(By.cssSelector("input[id='password'][name='session_password']")).sendKeys("nayak888");
		// driver.findElement(By.cssSelector("form>div:nth-of-type(2)>input")).sendKeys("nayak8988");
		// driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/form/div[2]/input")).sendKeys("bantinayak888");
		// driver.findElement(By.xpath("//html//div[2]/input")).sendKeys("bantinayak888");
//		driver.findElement(By.xpath("//html//div[2]/input[@name='session_password']")).sendKeys("B9692143458");
		// driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/form/div[3]/button")).click();
		//driver.findElement(By.cssSelector("button[data-litms-control-urn='login-submit']")).click();
	//	driver.findElement(By.cssSelector("a[class='btn__tertiary--medium forgot-password']")).click();
	//	driver.findElement(By.xpath("/html//form/a")).click();
		

	}

}
