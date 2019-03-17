package commonLibs.implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonLibs.contracts.IFrame;

public class FrameControl implements IFrame {

	private WebDriver driver;

	public FrameControl(WebDriver driver) {
		this.driver = driver;
	}

	public void switchToFrame(WebElement element) throws Exception {

		driver.switchTo().frame(element);

	}

	public void switchToFrame(int index) throws Exception {
		driver.switchTo().frame(index);

	}

	public void switchToFrame(String id) throws Exception {
		driver.switchTo().frame(id);

	}

	public void switchToParentpage() throws Exception {
		driver.switchTo().defaultContent();

	}

}
