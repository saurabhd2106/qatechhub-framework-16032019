package demo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commonLibs.implementation.CommonDriver;
import designPattern.AmazonPOM2Style;

public class DemoAmazonPOM2Style {

	CommonDriver cmnDriver;
	String url = "https://www.amazon.in/";

	WebDriver driver;

	AmazonPOM2Style homePage;

	@BeforeClass
	public void invokeBrowser() throws Exception {
		cmnDriver = new CommonDriver("chrome");

		cmnDriver.navigateToFirstUrl(url);

		driver = cmnDriver.getDriver();

		homePage = new AmazonPOM2Style(driver);
	}

	@AfterClass
	public void closeBrowser() throws Exception {
		cmnDriver.closeAllBrowsers();
	}

	@Test
	public void searchProduct() throws Exception {
		homePage.searchProduct("Apple Watch", "Electronics");
	}

}
