package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class ElectricCarsPageObject extends AbstractPage{
	WebDriver driver;

	public ElectricCarsPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
