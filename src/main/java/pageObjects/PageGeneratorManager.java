package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
	public static HomePageOject getHomePage(WebDriver driver) {
		return new HomePageOject(driver);
	}
	
	public static AboutUsPageObject getAboutUsPage(WebDriver driver) {
		return new AboutUsPageObject(driver);
	}
	
	public static NewsPageObject getNewsPage(WebDriver driver) {
		return new NewsPageObject(driver);
	}
	
	public static CustomerServicePageObject getCustomerServicePage(WebDriver driver) {
		return new CustomerServicePageObject(driver);
	}
	
	public static FinancePageObject getFinancePage(WebDriver driver) {
		return new FinancePageObject(driver);
	}

}
