package com.Staragile;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.Duration;
import java.util.Currency;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.linkedin.com/checkpoint/lg/sign-in-another-account");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		for (int i = 1; i <= rows.size(); i++) {
			WebElement w = driver.findElement(By.xpath("/html/body/div[2]/div[5]/table/tbody/tr[" + i + "]/td[4]"));
			double price = Double.parseDouble(w.getText().toString().replace(",", ""));
			if (max < price) {
				max = price;
			}

		}

		System.out.println("highest price number:" + max);
		Currency inr = Currency.getInstance("INR");
// Local instance for India
		Locale loc = new Locale("hi", "IN");
		// Create a NumberFormatter with custom currency
		NumberFormat inrFormatter = NumberFormat.getCurrencyInstance(loc);
		inrFormatter.setCurrency(inr);
		// Convert string to BigDecimal and format as
		// currency
		BigDecimal amt = new BigDecimal(max);
		String currInr = inrFormatter.format(amt);
		System.out.println("highest price value::" + currInr);

	}

}
