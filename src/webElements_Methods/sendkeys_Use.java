package webElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys_Use {
	

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//locator type--->id 
		driver.findElement(By.id("email")).sendKeys("Testing@123");
		driver.findElement(By.id("email")).sendKeys("student@123");
		Thread.sleep(700);
		
		//web element type---> clear();
		//driver.findElement(By.id("email")).clear();
		
		//locator type ---> name 
		driver.findElement(By.name("pass")).sendKeys("std2500");
		
		//locator type---> name 
		driver.findElement(By.name("login")).click();

		

	}

}
