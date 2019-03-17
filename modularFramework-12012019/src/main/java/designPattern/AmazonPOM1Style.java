package designPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonPOM1Style {
	
	public WebElement searchBox;
	
	public WebElement searchButton;
	
	public WebElement searchDropdown;
	
	public AmazonPOM1Style(WebDriver driver) {
		
		searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchButton = driver.findElement(By.xpath("//input[@value='Go']"));
		
		searchDropdown = driver.findElement(By.id("searchDropdownBox"));
		
	}

}
