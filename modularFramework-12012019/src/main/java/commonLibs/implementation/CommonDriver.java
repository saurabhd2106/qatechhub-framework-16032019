package commonLibs.implementation;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import commonLibs.contracts.IDriver;

public class CommonDriver implements IDriver {

	private WebDriver driver;

	private ChromeOptions chromeOptions;
	private int pageLoadTimeout;
	private int elementDetectionTimeout;

	public WebDriver getDriver() {
		return driver;
	}

	public void setPageLoadTimeout(int pageLoadTimeout) {
		this.pageLoadTimeout = pageLoadTimeout;
	}

	public void setElementDetectionTimeout(int elementDetectionTimeout) {
		this.elementDetectionTimeout = elementDetectionTimeout;
	}

	public CommonDriver(String browserType) throws Exception {

		elementDetectionTimeout = 10;
		pageLoadTimeout = 30;

		browserType = browserType.trim();

		if (browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver2.45/chromedriver.exe");

			driver = new ChromeDriver();
		} else if (browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/geckodriver-v0.20.1-win64/geckodriver.exe");

			driver = new FirefoxDriver();
		} else if (browserType.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/MicrosoftWebDriver.exe");

			driver = new EdgeDriver();
		} else if (browserType.equalsIgnoreCase("headless")) {
			chromeOptions = new ChromeOptions();
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver2.45/chromedriver.exe");

			chromeOptions.addArguments("headless");

			driver = new ChromeDriver(chromeOptions);
		}

		else if (browserType.equalsIgnoreCase("remote-chrome")) {

			chromeOptions = new ChromeOptions();

			URL remoteUrl = new URL("http://192.168.1.5:4444/wd/hub");
			driver = new RemoteWebDriver(remoteUrl, chromeOptions);
		
		} else if (browserType.equalsIgnoreCase("remote-firefox")) {

			FirefoxOptions firefoxOptions = new FirefoxOptions();

			URL remoteUrl = new URL("http://192.168.1.5:4444/wd/hub");
			driver = new RemoteWebDriver(remoteUrl, firefoxOptions);
		} else {
			throw new Exception("Invalid Browser ... " + browserType);
		}

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
	}

	public void navigateToFirstUrl(String url) throws Exception {

		url = url.trim();

		driver.manage().timeouts().pageLoadTimeout(pageLoadTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(elementDetectionTimeout, TimeUnit.SECONDS);

		driver.get(url);

	}

	public String getTitle() throws Exception {

		return driver.getTitle();
	}

	public String getCurrentUrl() throws Exception {

		return driver.getCurrentUrl();
	}

	public String getPageSource() throws Exception {

		return driver.getPageSource();
	}

	public void navigateToUrl(String url) throws Exception {

		url = url.trim();
		driver.navigate().to(url);

	}

	public void navigateForward() throws Exception {
		driver.navigate().forward();

	}

	public void navigateBackward() throws Exception {
		driver.navigate().back();

	}

	public void refresh() throws Exception {
		driver.navigate().refresh();

	}

	public void closeBrowser() throws Exception {
		if (driver != null) {
			driver.close();
		}

	}

	public void closeAllBrowsers() throws Exception {
		if (driver != null) {
			driver.quit();
		}
	}

}
