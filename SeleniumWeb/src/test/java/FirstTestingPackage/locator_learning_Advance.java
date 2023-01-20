package FirstTestingPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.DriverSetup;

public class locator_learning_Advance extends DriverSetup {
	
	@Test
	public void LocateRadioButton1ByCssSelector1() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radio_Btton_one = driver.findElement(By.cssSelector("input[value='radio1']"));
		radio_Btton_one.click();
		Thread.sleep(4000);
		
	}
	
	@Test
	public void LocateRadioButton2ByXpath() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radio_Btton_two = driver.findElement(By.xpath("//input[@value='radio2']"));
		radio_Btton_two.click();
		Thread.sleep(4000);
		
	}
	
	@Test
	public void LocateHeadingByCssSelectorTagname() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement h1 = driver.findElement(By.cssSelector("h1"));
		System.out.println(h1.getText());
		Thread.sleep(4000);
		
	}
	
	@Test
	public void LocateHeadingByXpathTagname() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement h1 = driver.findElement(By.xpath("//h1"));
		System.out.println(h1.getText());
		Thread.sleep(4000);
		
	}
	
	@Test
	public void LocateRadioButtonExampleByCssSelectorDirectChild() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement RadioButtonExample = driver.findElement(By.cssSelector("fieldset > legend"));
		System.out.println(RadioButtonExample.getText());
		Thread.sleep(4000);

		
	}
	
	@Test
	public void LocateRadioButtonExampleByXpathDirectChild() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement RadioButtonExample = driver.findElement(By.xpath("//fieldset /legend"));
		System.out.println(RadioButtonExample.getText());
		Thread.sleep(4000);

		
	}
	
	
	@Test
	public void LocateCheckBox1ByCssSelectorMutipleAttributes() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement Check_Box_One = driver.findElement(By.cssSelector("input[type=\"checkbox\"][id=\"checkBoxOption1\"]"));
		Check_Box_One.click();
		Thread.sleep(4000);

		
	}
	
	
	@Test
	public void LocateCheckBox1ByXpathMutipleAttributes() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement Check_Box_One = driver.findElement(By.xpath("//input[@type=\"checkbox\"][@id=\"checkBoxOption1\"]"));
		//WebElement Check_Box_One = driver.findElement(By.xpath("//input[@type=\"checkbox\" and @id=\"checkBoxOption1\"]")); --------Original Way to find Element by Xpath.
		Check_Box_One.click();
		Thread.sleep(4000);

		
	}
	
	
	@Test
	public void LocateSelectOptionByCssSelectorSubString() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement Select_Option = driver.findElement(By.cssSelector("select[id *='dropdown-class-']"));
		Select_Option.click();
		Thread.sleep(4000);

		
	}
	
	
	@Test
	public void LocateSelectOptionByXpathSubString() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement Select_Option = driver.findElement(By.xpath("//select[contains(@id,'dropdown-class-')]"));
		Select_Option.click();
		Thread.sleep(4000);

		
	}
	
	
	@Test
	public void LocateSelectOptionByCssSelectorStartWith() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement Select_Option = driver.findElement(By.cssSelector("select[id ^='dropdown-class']"));
		Select_Option.click();
		Thread.sleep(4000);

		
	}
	
	
	@Test
	public void LocateSelectOptionByXpathStartsWith() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement Select_Option_StartWith = driver.findElement(By.xpath(" "));
		Select_Option_StartWith.click();
		Thread.sleep(4000);

		
	}
	
	
	@Test
	public void LocateSelectOptionByCssSelectorEndtWith() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement Select_Option = driver.findElement(By.cssSelector("select[id $='down-class-example']"));
		Select_Option.click();
		Thread.sleep(4000);

		
	}
	
	// ********************Ends With Locator didn't work in Selenium update version !!!
	//@Test
	//public void LocateSelectOptionByXpathEndsWith() throws InterruptedException {
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//WebElement Select_Option_StartWith = driver.findElement(By.xpath("//select[starts-with(@id,'dropdown-class-')]"));
		//Select_Option_StartWith.click();
		//Thread.sleep(4000);
	//}
	
	

}












