package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class FinancePageObject extends AbstractPage{
	WebDriver driver;

	public FinancePageObject(WebDriver driver) {
		this.driver = driver;
	}
}
