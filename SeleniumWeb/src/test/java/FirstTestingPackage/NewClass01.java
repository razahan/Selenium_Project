package FirstTestingPackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.DriverSetup;

public class NewClass01 extends DriverSetup {
	
	  

	@Test
	
	
	public void testDescriptonByClassName() throws InterruptedException {		
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.1");
		WebElement descrption = driver.findElement(By.className("im-description"));
		assertEquals(descrption.getText(),"Automated driver management and other helper features for Selenium WebDriver in Java");
		Thread.sleep(5000);
		driver.quit();
	}



}
