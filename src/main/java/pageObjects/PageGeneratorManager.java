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

	public static CarSearchPageObject getCarSearchPage(WebDriver driver) {
		return new CarSearchPageObject(driver);
	}

	public static NewCarsPageObject getNewCarsPage(WebDriver driver) {
		return new NewCarsPageObject(driver);
	}

	public static ElectricCarsPageObject getEletricCarsPage(WebDriver driver) {
		return new ElectricCarsPageObject(driver);
	}

	public static ServicingAndPartsPageObject getServicingAndPartsPage(WebDriver driver) {
		return new ServicingAndPartsPageObject(driver);
	}

	public static OffersPageObject getOffersPage(WebDriver driver) {
		return new OffersPageObject(driver);
	}

	public static BusinessUsersPagePObject getBusinessUsersPage(WebDriver driver) {
		return new BusinessUsersPagePObject(driver);
	}

	public static SellYourCarPageObject getSellYourCarPage(WebDriver driver) {
		return new SellYourCarPageObject(driver);
	}
	
	public static OurLocationsPageObject getOurLocationsPage(WebDriver driver) {
		return new OurLocationsPageObject(driver);
	}
}
