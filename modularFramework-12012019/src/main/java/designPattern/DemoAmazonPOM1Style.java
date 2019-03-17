package designPattern;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commonLibs.implementation.CommonDriver;
import commonLibs.implementation.DropdownControl;
import commonLibs.implementation.ElementControl;

public class DemoAmazonPOM1Style {

	CommonDriver cmnDriver;
	String url = "https://www.amazon.in/";

	ElementControl elementControl;
	DropdownControl dropdownControl;
	WebDriver driver;

	AmazonPOM1Style homePage;

	@BeforeClass
	public void invokeBrowser() throws Exception {
		cmnDriver = new CommonDriver("chrome");

		cmnDriver.navigateToFirstUrl(url);

		elementControl = new ElementControl();
		dropdownControl = new DropdownControl();
		driver = cmnDriver.getDriver();

		homePage = new AmazonPOM1Style(driver);
	}

	@AfterClass
	public void closeBrowser() throws Exception {
		cmnDriver.closeAllBrowsers();
	}

	@Test
	public void searchProduct() throws Exception {
		elementControl.setText(homePage.searchBox, "Apple Watch");

		dropdownControl.selectViaVisibleText(homePage.searchDropdown, "Electronics");

		elementControl.clickElement(homePage.searchButton);
	}

}
