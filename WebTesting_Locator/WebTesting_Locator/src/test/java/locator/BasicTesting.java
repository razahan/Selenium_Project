package locator;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTesting {
	
	@Test
	public void testWebPageTitle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.0");
		driver.manage().window().maximize();
		assertEquals(driver.getTitle(), "Maven Repository: io.github.bonigarcia » webdrivermanager » 5.3.0");
		Thread.sleep(4000);
		driver.quit();
		
	}
	
	
	
	@Test
	public void testDescriptionByCssClass() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.0");
		driver.manage().window().maximize();
		WebElement description = driver.findElement(By.className("im-description"));
		assertEquals(description.getText(), "Automated driver management and other helper features for Selenium WebDriver in Java");
		//System.out.println(description.getText());
		Thread.sleep(4000);
		driver.quit();
		
	}
	
	
	@Test
	public void testNameByLinkText() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.0");
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.linkText("WebDriverManager"));
		assertEquals(name.getText(), "WebDriverManager");
		//System.out.println(name.getText());
		Thread.sleep(4000);
		driver.quit();
		
	}
	
	
	@Test
	public void testNameByPartialLink() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.0");
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.partialLinkText("WebDriverMan"));
		assertEquals(name.getText(), "WebDriverManager");
		//System.out.println(name.getText());
		Thread.sleep(4000);
		driver.quit();
		
	}
	
	
	@Test
	public void testSearchFieldById() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.0");
		driver.manage().window().maximize();
		WebElement searchInput = driver.findElement(By.id("query"));
		searchInput.sendKeys("testing");
		WebElement searchButton = driver.findElement(By.className("button"));
		searchButton.click();
		System.out.println(driver.getTitle());
		//assertEquals(driver.getTitle(), "Just a moment...");
		Thread.sleep(4000);
		driver.quit();
		
	}

}
