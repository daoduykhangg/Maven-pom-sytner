package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class OurLocationsPageObject extends AbstractPage{
	WebDriver driver;

	public OurLocationsPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
