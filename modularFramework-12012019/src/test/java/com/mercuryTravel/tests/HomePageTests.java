package com.mercuryTravel.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class HomePageTests extends BaseTests {

	@Test
	public void verifyLoginToMercuryTravelAsUserWithCorrectCredentials() throws Exception {

		extentTest = extentReport.createTest("TC - 001 - Verify Login to Mercury Travel with correct credentials");
		
		String userEmailId = configProperties.getProperty("userEmailId");

		String userPassword = configProperties.getProperty("userPassword");

		extentTest.log(Status.INFO, "User Email Id used : "+ userEmailId + " and password : "+ userPassword);
		homePage.userLogin(userEmailId, userPassword);

		String expectedWelcomeText = configProperties.getProperty("expectedWelcomeText");
		String actualWelcomeText = homePage.getWelcomeText();

		Assert.assertEquals(actualWelcomeText, expectedWelcomeText);
		extentTest.log(Status.INFO, "Actual welcome Text : "+ actualWelcomeText + " and expected welcome text : "+ expectedWelcomeText);
		
	}
}
