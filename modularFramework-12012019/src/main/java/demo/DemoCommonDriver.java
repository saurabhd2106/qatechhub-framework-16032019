package demo;

import org.openqa.selenium.WebDriver;

import commonLibs.implementation.CommonDriver;
import commonLibs.implementation.DropdownControl;
import commonLibs.implementation.ElementControl;
import commonLibs.implementation.MouseControl;
import commonLibs.implementation.ScreenshotControl;

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
			ScreenshotControl screenShot;
			WebDriver driver;
			
			driver = cmnDriver.getDriver();
			
			elementControl = new ElementControl();
			dropControl = new DropdownControl();
			mouseControl = new MouseControl(driver);
			
			screenShot = new ScreenshotControl(driver);
			
			screenShot.saveAndCaptureScreenshot("C:/Users/Saurabh Dhingra/git/qatechhub-16032019/modularFramework-12012019/screenshots/test.jpeg");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
