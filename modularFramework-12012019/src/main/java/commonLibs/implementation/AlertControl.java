package commonLibs.implementation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import commonLibs.contracts.IAlert;

public class AlertControl implements IAlert {

	WebDriver driver;

	public AlertControl(WebDriver driver) {
		this.driver = driver;
	}

	private Alert getAlert() {
		Alert alert = driver.switchTo().alert();

		return alert;
	}

	public void acceptAlert() throws Exception {

		getAlert().accept();

	}

	public void rejectAlert() throws Exception {
		getAlert().dismiss();

	}

	public String getMessageFromAlert() throws Exception {

		return getAlert().getText();
	}

}
