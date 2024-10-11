package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String parentwindowid = driver.getWindowHandle();

		System.out.println("parentwindowid: " + parentwindowid);

		driver.findElement(By.xpath("//button[@id='tabButton'][@type='button']")).click();
		Set<String> windowhandle = driver.getWindowHandles();

		for (String windowId : windowhandle) {
			System.out.println("windowId: " + windowId);
			if (!windowId.equals(parentwindowid)) {
				driver.switchTo().window(windowId);
			}

		}
		String headertitle = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("headertitle: " + headertitle);

		driver.close();// closing current window
		driver.switchTo().window(parentwindowid);// change to parent window
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		driver.quit();
	}

}
