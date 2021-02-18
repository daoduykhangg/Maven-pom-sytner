package com.sytner.MenuItems;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects.AboutUsPageObject;
import pageObjects.CustomerServicePageObject;
import pageObjects.FinancePageObject;
import pageObjects.HomePageOject;
import pageObjects.NewsPageObject;
import pageObjects.PageGeneratorManager;

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
	}

	@Test
	public void TC_01_MenuItems_AboutUs() {
		log.info("MenuItems [AboutUs] - Step 01: Accept Privacy and Cookies");
		homePage.acceptPrivacyAndCookies(driver, "Accept Recommended");

		log.info("MenuItems [AboutUs] - Step 02: Click to 'About Us' Link");
		homePage.openPageInMenuByTitle(driver, "About Us");
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
		homePage.openPageInMenuByTitle(driver, "News");
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
		homePage.openPageInMenuByTitle(driver, "Customer Service");
		customerServicePage = PageGeneratorManager.getCustomerServicePage(driver);

		log.info("MenuItems [Customer Service] - Step 03: Verify 'Current Page Title' is displayed with value '" + customerServicePageTitle + "'");
		verifyEquals(customerServicePage.getCurrentPageTitle(driver), customerServicePageTitle);

		log.info("MenuItems [Customer Service] - Step 04: Verify 'Current Page URL' is displayed with value '" + customerServicePageURL + "'");
		verifyEquals(customerServicePage.getCurrentPageUrl(driver), customerServicePageURL);
	}

	@Test
	public void TC_04_MenuItems_Finance() {
		log.info("MenuItems [News] - Step 01: Back to 'Home Page'");
		customerServicePage.backToPage(driver);
		homePage = PageGeneratorManager.getHomePage(driver);
		
		log.info("MenuItems [Finance] - Step 01: Click to 'Finance' Link");
		homePage.openPageInMenuByTitle(driver, "Finance");
		financePage = PageGeneratorManager.getFinancePage(driver);

		log.info("MenuItems [Finance] - Step 02: Verify 'Current Page Title' is displayed with value '" + FinancePageTitle + "'");
		verifyEquals(financePage.getCurrentPageTitle(driver), FinancePageTitle);

		log.info("MenuItems [Finance] - Step 03: Verify 'Current Page URL' is displayed with value '" + FinancePageURL + "'");
		verifyEquals(financePage.getCurrentPageUrl(driver), FinancePageURL);
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
	String aboutUsPageTitle, aboutUsPageURL, newsPageTitle, newsPageURL, customerServicePageTitle, customerServicePageURL;
	String FinancePageTitle, FinancePageURL;
}
