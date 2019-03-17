package demo;

import org.openqa.selenium.WebDriver;

import commonLibs.implementation.CommonDriver;
import commonLibs.implementation.DropdownControl;
import commonLibs.implementation.ElementControl;
import commonLibs.implementation.MouseControl;

public class DemoCommonDriver {

	public static void main(String[] args) {

		try {
			
			CommonDriver cmnDriver = new CommonDriver("chrome");
			cmnDriver.setPageLoadTimeout(30);
			cmnDriver.setElementDetectionTimeout(10);
			
			cmnDriver.navigateToFirstUrl("http://demo.guru99.com/v4");
			
			ElementControl elementControl;
			DropdownControl dropControl;
			MouseControl mouseControl;
			WebDriver driver;
			
			driver = cmnDriver.getDriver();
			
			elementControl = new ElementControl();
			dropControl = new DropdownControl();
			mouseControl = new MouseControl(driver);
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
