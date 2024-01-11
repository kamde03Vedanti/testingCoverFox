package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathBy_Contains {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		// xpath.by contains using text we can also take partial text 
	
		driver.findElement(By.xpath("//h2[contains(text(),'Facebook ')]"));
		


		
		
	}

}
