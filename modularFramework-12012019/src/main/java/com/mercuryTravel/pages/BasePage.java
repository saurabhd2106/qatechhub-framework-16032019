package com.mercuryTravel.pages;

import org.openqa.selenium.WebDriver;

import commonLibs.implementation.ElementControl;
import commonLibs.implementation.MouseControl;

public class BasePage {
	
	MouseControl mouseControl;
	ElementControl elementControl;

	public BasePage(WebDriver driver) {
		mouseControl = new MouseControl(driver);

		elementControl = new ElementControl();
	}
}
