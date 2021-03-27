package com.sytner.MenuItems;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects.AboutUsPageObject;
import pageObjects.BusinessUsersPagePObject;
import pageObjects.CarSearchPageObject;
import pageObjects.CustomerServicePageObject;
import pageObjects.ElectricCarsPageObject;
import pageObjects.FinancePageObject;
import pageObjects.HomePageOject;
import pageObjects.NewCarsPageObject;
import pageObjects.NewsPageObject;
import pageObjects.OffersPageObject;
import pageObjects.OurLocationsPageObject;
import pageObjects.PageGeneratorManager;
import pageObjects.SellYourCarPageObject;
import pageObjects.ServicingAndPartsPageObject;

public class HomePage_001_MenuItems extends AbstractTest {

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String url) {
		driver = getBrowserDriver(browserName, url);
		homePage = PageGeneratorManager.getHomePage(driver);

		aboutUsPageTitle = "About Us | Sytner Group";
		aboutUsPageURL = "https://www.sytner.co.uk/about-us/";
		newsPageTitle = "Latest News | About Us | Sytner Group";
		newsPageURL = "https://www.sytner.co.uk/news/";
		customerServicePageTitle = "Customer Service | Sytner Group";
		customerServicePageURL = "https://www.sytner.co.uk/customer-service/";
		FinancePageTitle = "Finance | Across the U.K | Sytner Group";
		FinancePageURL = "https://www.sytner.co.uk/finance/";
		CarSearchPageTitle = "Sytner Vehicle Search";
		CarSearchPageURL = "https://supersearch.sytner.co.uk/#/";
		NewCarsPageTitle = "New Cars | Sytner Group";
		NewCarsPageURL = "https://www.sytner.co.uk/new-cars/";
		eletricCarsPageTitle = "Hybrid and Electric Vehicles | Sytner Group";
		eletricCarsPageURL = "https://www.sytner.co.uk/electric-vehicles/";
		servicingAndPartsPageTitle = "Your Workshop Visit | Across the U.K | Sytner Group";
		servicingAndPartsPageURL = "https://www.sytner.co.uk/car-maintenance/your-workshop-visit/";
		offersPageTitle = "Special Car Offers & Promotions | Sytner";
		offerssPageURL = "https://www.sytner.co.uk/promotions/";
		businessUsersPageTitle = "Business & Fleet Cars | Sytner Group";
		businessUsersPageURL = "https://www.sytner.co.uk/business-users/";
		sellYourCarPageTitle = "Sell Your Car | Sytner Group";
		sellYourCarPageURL = "https://www.sytner.co.uk/sell-your-car/";
		ourLocationsPageTitle = "Our Locations | Sytner Group";
		ourLocationsPageURL = "https://www.sytner.co.uk/dealer-locator/";
	}

	@Test
	public void TC_01_MenuItems_AboutUs() {
		log.info("MenuItems [AboutUs] - Step 01: Accept Privacy and Cookies");
		homePage.acceptPrivacyAndCookies(driver, "Accept Recommended");

		log.info("MenuItems [AboutUs] - Step 02: Click to 'About Us' Link");
		homePage.openPageInMenuHeaderByTitle(driver, "About Us");
		aboutUsPage = PageGeneratorManager.getAboutUsPage(driver);

		log.info("MenuItems [AboutUs] - Step 03: Verify 'Current Page Title' is displayed with value '" + aboutUsPageTitle + "'");
		verifyEquals(aboutUsPage.getCurrentPageTitle(driver), aboutUsPageTitle);

		log.info("MenuItems [AboutUs] - Step 04: Verify 'Current Page URL' is displayed with value '" + aboutUsPageURL + "'");
		verifyEquals(aboutUsPage.getCurrentPageUrl(driver), aboutUsPageURL);
	}

	@Test
	public void TC_02_MenuItems_News() {
		log.info("MenuItems [News] - Step 01: Back to 'Home Page'");
		aboutUsPage.backToPage(driver);
		homePage = PageGeneratorManager.getHomePage(driver);

		log.info("MenuItems [News] - Step 02: Click to 'News' Link");
		homePage.openPageInMenuHeaderByTitle(driver, "News");
		newsPage = PageGeneratorManager.getNewsPage(driver);

		log.info("MenuItems [News] - Step 03: Verify 'Current Page Title' is displayed with value '" + newsPageTitle + "'");
		verifyEquals(newsPage.getCurrentPageTitle(driver), newsPageTitle);

		log.info("MenuItems [News] - Step 04: Verify 'Current Page URL' is displayed with value '" + newsPageURL + "'");
		verifyEquals(newsPage.getCurrentPageUrl(driver), newsPageURL);
	}

	@Test
	public void TC_03_MenuItems_Customer_Service() {
		log.info("MenuItems [Customer Service] - Step 01: Back to 'Home Page'");
		newsPage.backToPage(driver);
		homePage = PageGeneratorManager.getHomePage(driver);

		log.info("MenuItems [Customer Service] - Step 02: Click to 'Customer Service' Link");
		homePage.openPageInMenuHeaderByTitle(driver, "Customer Service");
		customerServicePage = PageGeneratorManager.getCustomerServicePage(driver);

		log.info("MenuItems [Customer Service] - Step 03: Verify 'Current Page Title' is displayed with value '" + customerServicePageTitle + "'");
		verifyEquals(customerServicePage.getCurrentPageTitle(driver), customerServicePageTitle);

		log.info("MenuItems [Customer Service] - Step 04: Verify 'Current Page URL' is displayed with value '" + customerServicePageURL + "'");
		verifyEquals(customerServicePage.getCurrentPageUrl(driver), customerServicePageURL);
	}

	@Test
	public void TC_04_MenuItems_Finance() {
		log.info("MenuItems [Finance] - Step 01: Back to 'Home Page'");
		customerServicePage.backToPage(driver);
		homePage = PageGeneratorManager.getHomePage(driver);

		log.info("MenuItems [Finance] - Step 02: Click to 'Finance' Link");
		homePage.openPageInMenuHeaderByTitle(driver, "Finance");
		financePage = PageGeneratorManager.getFinancePage(driver);

		log.info("MenuItems [Finance] - Step 03: Verify 'Current Page Title' is displayed with value '" + FinancePageTitle + "'");
		verifyEquals(financePage.getCurrentPageTitle(driver), FinancePageTitle);

		log.info("MenuItems [Finance] - Step 04: Verify 'Current Page URL' is displayed with value '" + FinancePageURL + "'");
		verifyEquals(financePage.getCurrentPageUrl(driver), FinancePageURL);
	}

	@Test
	public void TC_05_MenuItems_CarSearch() {
		log.info("MenuItems [Car Search] - Step 01: Back to 'Home Page'");
		financePage.backToPage(driver);
		homePage = PageGeneratorManager.getHomePage(driver);

		log.info("MenuItems [Car Search] - Step 02: Click to 'Car Search' Link");
		homePage.openPageInPrimaryMenuByTitle(driver, "Car Search");
		carSearchPage = PageGeneratorManager.getCarSearchPage(driver);

		log.info("MenuItems [Car Search] - Step 03: Verify 'Current Page Title' is displayed with value '" + CarSearchPageTitle + "'");
		verifyEquals(carSearchPage.getCurrentPageTitle(driver), CarSearchPageTitle);

		log.info("MenuItems [Car Search] - Step 04: Verify 'Current Page URL' is displayed with value '" + CarSearchPageURL + "'");
		verifyEquals(carSearchPage.getCurrentPageUrl(driver), CarSearchPageURL);
	}

	@Test
	public void TC_06_MenuItems_NewCars() {
		log.info("MenuItems [New Cars] - Step 01: Back to 'Home Page'");
		carSearchPage.backToPage(driver);
		homePage = PageGeneratorManager.getHomePage(driver);

		log.info("MenuItems [New Cars] - Step 02: Click to 'New Cars' Link");
		homePage.openPageInPrimaryMenuByTitle(driver, "New Cars");
		newCarsPage = PageGeneratorManager.getNewCarsPage(driver);

		log.info("MenuItems [New Cars] - Step 03: Verify 'Current Page Title' is displayed with value'" + NewCarsPageTitle + "'");
		verifyEquals(newCarsPage.getCurrentPageTitle(driver), NewCarsPageTitle);

		log.info("MenuItems [New Cars] - Step 04: Verify 'Current Page URL' is displayed with value'" + NewCarsPageURL + "'");
		verifyEquals(newCarsPage.getCurrentPageUrl(driver), NewCarsPageURL);
	}

	@Test
	public void TC_07_MenuItems_ElectricCars() {
		log.info("MenuItems [Electric Cars] - Step 01: Back to 'Home Page'");
		newCarsPage.backToPage(driver);
		homePage = PageGeneratorManager.getHomePage(driver);

		log.info("MenuItems [Electric Cars] - Step 02: Click to 'Electric Cars' Link");
		homePage.openPageInPrimaryMenuByTitle(driver, "Electric Cars");
		eletricCarsPage = PageGeneratorManager.getEletricCarsPage(driver);

		log.info("MenuItems [Electric Cars] - Step 03: Verify 'Current Page Title' is displayed with value'" + eletricCarsPageTitle + "'");
		verifyEquals(eletricCarsPage.getCurrentPageTitle(driver), eletricCarsPageTitle);

		log.info("MenuItems [Electric Cars] - Step 04: Verify 'Current Page URL' is displayed with value'" + eletricCarsPageURL + "'");
		verifyEquals(eletricCarsPage.getCurrentPageUrl(driver), eletricCarsPageURL);
	}

	@Test
	public void TC_08_MenuItems_ServicingParts() {
		log.info("MenuItems [Servicing & Parts] - Step 01: Back to 'Home Page'");
		eletricCarsPage.backToPage(driver);
		homePage = PageGeneratorManager.getHomePage(driver);

		log.info("MenuItems [Servicing & Parts] - Step 02: Click to 'Servicing & Parts' Link");
		homePage.openPageInPrimaryMenuByTitle(driver, "Servicing & Parts");
		servicingAndPartsPage = PageGeneratorManager.getServicingAndPartsPage(driver);

		log.info("MenuItems [Servicing & Parts] - Step 03: Verify 'Current Page Title' is displayed with value'" + servicingAndPartsPageTitle + "'");
		verifyEquals(servicingAndPartsPage.getCurrentPageTitle(driver), servicingAndPartsPageTitle);
		log.info("MenuItems [Servicing & Parts] - Step 04: Verify 'Current Page URL' is displayed with value'" + servicingAndPartsPageURL + "'");
		verifyEquals(servicingAndPartsPage.getCurrentPageUrl(driver), servicingAndPartsPageURL);
	}

	@Test
	public void TC_09_MenuItems_Offers() {
		log.info("MenuItems [Offers] - Step 01: Back to 'Home Page'");
		servicingAndPartsPage.backToPage(driver);
		homePage = PageGeneratorManager.getHomePage(driver);

		log.info("MenuItems [Offers] - Step 02: Click to 'Offers' Link");
		homePage.openPageInPrimaryMenuByTitle(driver, "Offers");
		offersPage = PageGeneratorManager.getOffersPage(driver);

		log.info("MenuItems [Offers] - Step 03: Verify 'Current Page Title' is displayed with value'" + offersPageTitle + "'");
		verifyEquals(offersPage.getCurrentPageTitle(driver), offersPageTitle);

		log.info("MenuItems [Offers] - Step 04: Verify 'Current Page URL' is displayed with value'" + offerssPageURL + "'");
		verifyEquals(offersPage.getCurrentPageUrl(driver), offerssPageURL);
	}

	@Test
	public void TC_10_MenuItems_BusinessUsers() {
		log.info("MenuItems [Business Users] - Step 01: Back to 'Home Page'");
		offersPage.backToPage(driver);
		homePage = PageGeneratorManager.getHomePage(driver);

		log.info("MenuItems [Business Users] - Step 02: Click to 'Business Users' Link");
		homePage.openPageInPrimaryMenuByTitle(driver, "Business Users");
		businessUsersPage = PageGeneratorManager.getBusinessUsersPage(driver);

		log.info("MenuItems [Business Users] - Step 03: Verify 'Current Page Title' is displayed with value'" + businessUsersPageTitle + "'");
		verifyEquals(businessUsersPage.getCurrentPageTitle(driver), businessUsersPageTitle);

		log.info("MenuItems [Business Users] - Step 04: Verify 'Current Page URL' is displayed with value'" + businessUsersPageURL + "'");
		verifyEquals(businessUsersPage.getCurrentPageUrl(driver), businessUsersPageURL);
	}

	@Test
	public void TC_11_MenuItems_Sellyourcar() {
		log.info("MenuItems [Sell your car] - Step 01: Back to 'Home Page'");
		businessUsersPage.backToPage(driver);
		homePage = PageGeneratorManager.getHomePage(driver);

		log.info("MenuItems [Sell your car] - Step 02: Click to 'Sell your car' Link");
		homePage.openPageInPrimaryMenuByTitle(driver, "Sell your car");
		sellYourCarPage = PageGeneratorManager.getSellYourCarPage(driver);

		log.info("MenuItems [Sell your car] - Step 03: Verify 'Current Page Title' is displayed with value'" + sellYourCarPageTitle + "'");
		verifyEquals(sellYourCarPage.getCurrentPageTitle(driver), sellYourCarPageTitle);

		log.info("MenuItems [Sell your car] - Step 04: Verify 'Current Page URL' is displayed with value'" + sellYourCarPageURL + "'");
		verifyEquals(sellYourCarPage.getCurrentPageUrl(driver), sellYourCarPageURL);
	}

	@Test
	public void TC_12_MenuItems_OurLocations() {
		log.info("MenuItems [Our Locations] - Step 01: Back to 'Home Page'");
		sellYourCarPage.backToPage(driver);
		homePage = PageGeneratorManager.getHomePage(driver);

		log.info("MenuItems [Our Locations] - Step 02: Click to 'Our Locations' Link");
		homePage.openPageInPrimaryMenuByTitle(driver, "Our Locations");
		ourLocationsPage = PageGeneratorManager.getOurLocationsPage(driver);

		log.info("MenuItems [Our Locations] - Step 03: Verify 'Current Page Title' is displayed with value'" + ourLocationsPageTitle + "'");
		verifyEquals(ourLocationsPage.getCurrentPageTitle(driver), ourLocationsPageTitle);

		log.info("MenuItems [Our Locations] - Step 04: Verify 'Current Page URL' is displayed with value'" + ourLocationsPageURL + "'");
		verifyEquals(ourLocationsPage.getCurrentPageUrl(driver), ourLocationsPageURL);
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowserAndDriver(driver);
	}

	WebDriver driver;
	HomePageOject homePage;
	AboutUsPageObject aboutUsPage;
	NewsPageObject newsPage;
	CustomerServicePageObject customerServicePage;
	FinancePageObject financePage;
	CarSearchPageObject carSearchPage;
	NewCarsPageObject newCarsPage;
	ElectricCarsPageObject eletricCarsPage;
	ServicingAndPartsPageObject servicingAndPartsPage;
	OffersPageObject offersPage;
	BusinessUsersPagePObject businessUsersPage;
	SellYourCarPageObject sellYourCarPage;
	OurLocationsPageObject ourLocationsPage;
	
	String aboutUsPageTitle, aboutUsPageURL, newsPageTitle, newsPageURL, customerServicePageTitle, customerServicePageURL;
	String FinancePageTitle, FinancePageURL, CarSearchPageTitle, CarSearchPageURL, NewCarsPageTitle, NewCarsPageURL;
	String eletricCarsPageTitle, eletricCarsPageURL, servicingAndPartsPageTitle, servicingAndPartsPageURL;
	String offersPageTitle, offerssPageURL, businessUsersPageTitle, businessUsersPageURL, sellYourCarPageTitle, sellYourCarPageURL;
	String ourLocationsPageTitle, ourLocationsPageURL;
}
