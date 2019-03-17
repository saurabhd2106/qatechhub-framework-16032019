package commonLibs.implementation;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import commonLibs.contracts.IWindowHandle;

public class WindowsControl implements IWindowHandle {
	private WebDriver driver;

	public WindowsControl(WebDriver driver) {
		this.driver = driver;
	}

	public void switchToAnyWindow(String windowhandle) throws Exception {

		driver.switchTo().window(windowhandle);
	}

	public void switchToAnyWindow(int childWindowIndex) throws Exception {

		String windowHandle = driver.getWindowHandles().toArray()[childWindowIndex].toString();

		driver.switchTo().window(windowHandle);
	}

	public String getWindowHandle() throws Exception {

		return driver.getWindowHandle();
	}

	public Set<String> getWindowHandles() throws Exception {

		return driver.getWindowHandles();
	}

}
