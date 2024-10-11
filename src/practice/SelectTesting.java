package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTesting {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// driver.findElement(By.xpath("//*[@id=\"selectOne\"]/div/div[1] ")).click();
		// Thread.sleep(1000);
		Select selectdriver = new Select(driver.findElement(By.xpath("//*[@id=\"oldSelectMenu\"]")));
		selectdriver.selectByIndex(5);
		Thread.sleep(5000);

		selectdriver.selectByVisibleText("White");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"selectOne\"]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[.='Mrs.']")).click();
		driver.findElement(By.xpath("//*[.='Mrs.']")).click();
		System.out.println("hi");

		Thread.sleep(5000);
		
		Select selectcar = new Select(driver.findElement(By.id("cars")));
		boolean hasmultiple = selectcar.isMultiple();
		System.out.println("hasmultiple :" + hasmultiple);
		if (hasmultiple) {
			selectcar.selectByVisibleText("Volvo");
			selectcar.selectByVisibleText("Saab");
			Thread.sleep(5000);
			selectcar.deselectAll();
			System.out.println("complete");

		}

	}
}
