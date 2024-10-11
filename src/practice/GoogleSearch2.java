package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class GoogleSearch2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).isDisplayed();
		driver.findElement(By.name("q")).sendKeys("selenium dev");
		String beforeText = driver.getTitle();
		System.out.println(beforeText);
		driver.findElement(By.name("q")).submit();
		String aftertext = driver.getTitle();
		System.out.println(aftertext);

		if (beforeText.equals(aftertext)) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}

		Thread.sleep(2000);
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Banti");
		driver.findElement(By.id("userName-label")).getSize();

		// driver.quit();
		Thread.sleep(2000);
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Banti nayak");
		// driver.findElement(By.cssSelector("form>div:nth-of-type(1)>div>input")).sendKeys("Banti
		// nayak");

		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Bantinayak888");
		driver.findElement(By.cssSelector("textarea[placeholder='Current Address'][id='currentAddress']"))
				.sendKeys("wagholi");
		// driver.findElement(By.cssSelector("form#userForm
		// textarea#currentAddress")).sendKeys("wagholi");
		driver.findElement(By.cssSelector("textarea#permanentAddress")).sendKeys("odisha");
		driver.findElement(By.cssSelector("button#submit")).click();

		Thread.sleep(2000);
		driver.get("https://demoqa.com/links");
		driver.findElement(By.cssSelector("a#simpleLink")).click();
		driver.findElement(By.cssSelector("a#dynamicLink")).click();

		// driver.findElement(By.cssSelector("a#created")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.cssSelector("p#linkResponse")).isDisplayed();

		Thread.sleep(2000);
		driver.get("https://demoqa.com/select-menu");
		Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
		select.selectByIndex(5);
		Thread.sleep(2000);
		select.selectByValue("red");
		Thread.sleep(2000);
		select.selectByValue("2");

		driver.findElement(By.xpath("//*[@id=\"selectOne\"]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[.='Ms.']")).click();
		driver.findElement(By.xpath("//*[.='Ms.']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"withOptGroup\"]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[.='Group 2, option 1']")).click();
		driver.findElement(By.xpath("//*[.='Group 2, option 1']")).click();

		try {
			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]")).click();
			driver.findElement(By.xpath("//.[.='Green']")).click();
			driver.findElement(By.xpath("//.[.='Green']")).click();
			// driver.findElement(By.xpath("//.[.='Blue']")).click();
			// driver.findElement(By.xpath("//.[.='Green']")).click();
		} catch (ElementClickInterceptedException a) {
			System.out.println("hi");
		}
	}

	// driver.get

}
