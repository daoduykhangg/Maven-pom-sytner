package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class NewsPageObject extends AbstractPage{
	WebDriver driver;

	public NewsPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
