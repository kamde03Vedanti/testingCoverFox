package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathBy_Text {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
    driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//x.path by attribute ---> Make my trip
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("nagpur");
		Thread.sleep(1000);
		driver.close();
		
		//x.path by attribute taking id 
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("pune");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Mumbai");
		Thread.sleep(500);
		//x.path by text 
		driver.findElement(By.xpath("//button[text()='SEARCH BUSES']")).click();
		Thread.sleep(1500);
		driver.close();
		

	}

}
