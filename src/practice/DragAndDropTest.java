package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropable = driver.findElement(By.xpath("//div[@id='draggable']/ancestor::div[2]/div/div[2]"));
		Actions action = new Actions(driver);
		action.dragAndDrop(draggable, dropable).build().perform();
		System.out.println("hi");
	}

}
