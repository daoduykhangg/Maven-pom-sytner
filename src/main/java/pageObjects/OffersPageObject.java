package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class OffersPageObject extends AbstractPage {
	WebDriver driver;

	public OffersPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
