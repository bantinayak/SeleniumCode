package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement dragable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropable = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		Actions action = new Actions(driver);
		action.dragAndDrop(dragable, dropable).build().perform();
		System.out.println("hi");

	}

}
