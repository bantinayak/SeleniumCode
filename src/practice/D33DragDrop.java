package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D33DragDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame(0);
		WebElement dragable = driver.findElement(By.id("draggable"));
		WebElement dropable = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(dragable, dropable).build().perform();

	}

}
