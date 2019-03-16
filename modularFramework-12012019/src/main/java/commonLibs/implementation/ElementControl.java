package commonLibs.implementation;

import org.openqa.selenium.WebElement;

import commonLibs.contracts.ICommonElements;

public class ElementControl implements ICommonElements {

	public String getText(WebElement element) throws Exception {

		return element.getText();
	}

	public void clickElement(WebElement element) throws Exception {
		element.click();

	}

	public String getAttribute(WebElement element, String attribute) throws Exception {

		return element.getAttribute(attribute);
	}

	public String getCssValue(WebElement element, String csspropertyName) throws Exception {

		return element.getCssValue(csspropertyName);
	}

	public boolean isElementEnabled(WebElement element) throws Exception {

		return element.isEnabled();
	}

	public boolean isElementVisible(WebElement element) throws Exception {

		return element.isDisplayed();
	}

	public boolean isElementSelected(WebElement element) throws Exception {

		return element.isSelected();
	}

	public void setText(WebElement element, String textToWrite) throws Exception {
		element.sendKeys(textToWrite);

	}

	public void clearText(WebElement element) throws Exception {
		element.clear();

	}

	public void changeCheckboxStatus(WebElement element, boolean status) throws Exception {
		
		if((status && !element.isSelected())  || (!status && element.isSelected())){
			element.click();
		}

	}

}
