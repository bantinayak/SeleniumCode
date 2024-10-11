package commonlib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class SeleniumUtils {
	private String projectDirectory;

	public SeleniumUtils() {
		setProjectPath(System.getProperty("user.dir"));
	}

	public void captureScreenshot(WebDriver driver, String filename) throws IOException {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destfile = new File(this.getProjectPath() + "\\resource\\Results\\" + filename + ".png");
		Files.copy(srcFile, destfile);

	}

	public String getProjectPath() {
		return this.projectDirectory;
	}

	private void setProjectPath(String projectPath) {
		this.projectDirectory = projectPath;
	}

	/* capture screenshot for single element */
	public void captureElementScreenshotFor(WebDriver driver, String filename, By locator) throws IOException {
		File srcfile = driver.findElement(locator).getScreenshotAs(OutputType.FILE);
		File destfile = new File(this.getProjectPath() + "\\resource\\Results\\" + filename + ".png");
		Files.copy(srcfile, destfile);
	}

	public WebDriver launchBrowser(String browsername) {
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectDirectory
					+ "\\resource\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			return new ChromeDriver();

		} else if (browsername.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					projectDirectory + "\\resource\\driver\\edgedriver_win64\\msedgedriver.exe");

			return new EdgeDriver();
		} else {
			System.setProperty("webdriver.gecko.driver",
					projectDirectory + "\\resource\\driver\\geckodriver-v0.34.0-win32\\geckodriver.exe");
			return new FirefoxDriver();
		}

	}
}
