package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {
	public WebDriver driver;
	
	@BeforeSuite
	public void setDriver() {		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@AfterSuite
	public void quitDriver() {
		driver.quit();
		
		
	}
	
}
