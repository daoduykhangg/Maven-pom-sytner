package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class CarSearchPageObject extends AbstractPage{
	WebDriver driver;

	public CarSearchPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
