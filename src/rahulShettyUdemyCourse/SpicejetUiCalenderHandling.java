package rahulShettyUdemyCourse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SpicejetUiCalenderHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-jwli3a r-xb2eav r-majxgm r-q4m81j'])[1]")).click();
	}

}
