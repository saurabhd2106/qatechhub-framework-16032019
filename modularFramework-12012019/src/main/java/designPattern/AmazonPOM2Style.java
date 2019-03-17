package designPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonLibs.implementation.DropdownControl;
import commonLibs.implementation.ElementControl;

public class AmazonPOM2Style {

	private WebElement searchBox;

	private WebElement searchButton;

	private WebElement searchDropdown;

	private WebElement result;

	ElementControl elementControl;
	DropdownControl dropdownControl;

	public AmazonPOM2Style(WebDriver driver) {

		searchBox = driver.findElement(By.id("twotabsearchtextbox"));

		searchButton = driver.findElement(By.xpath("//input[@value='Go']"));

		searchDropdown = driver.findElement(By.id("searchDropdownBox"));

		result = driver.findElement(By.id("s-result-count"));

		elementControl = new ElementControl();
		dropdownControl = new DropdownControl();
	}

	public void searchProduct(String product, String category) throws Exception {
		elementControl.setText(searchBox, product);
		dropdownControl.selectViaVisibleText(searchDropdown, category);

		elementControl.clickElement(searchButton);

		System.out.println(elementControl.getText(result));
	}

}
