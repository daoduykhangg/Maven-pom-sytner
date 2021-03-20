package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class NewCarsPageObject extends AbstractPage {
	WebDriver driver;

	public NewCarsPageObject(WebDriver driver) {
		this.driver = driver;
	}

}
