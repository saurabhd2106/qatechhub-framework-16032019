package demo;

import org.testng.annotations.Test;

import utils.TestDataProvider;

public class DemoTestDataProvider {

	@Test(dataProvider = "getData", dataProviderClass = TestDataProvider.class)
	public void printTestData(String username, String password) {
		System.out.println("Username : " + username);

		System.out.println("Password : " + password);
	}

}
