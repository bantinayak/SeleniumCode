package rahulShettyUdemyCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/");

		String pagesource = driver.getPageSource();
		System.out.println("PageSource: " + pagesource);

		if (pagesource.equals("Selenium"))
			System.out.println("Pagesource Matching!!!\nTest Case Pass :)");
		else
			System.out.println("Pagesource not Matching!!!\nTest Case Fail :(");
		//Reporter.log("program ok");

		driver.close();
	}

}
