package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_Atrribute {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		// x.path by attribute and attributes values
		driver.findElement(By.xpath("//span[@class = 'absolute-center']")).click();
		driver.findElement(By.xpath("//input[@ id='login_email1']")).sendKeys("vedantikamde@gamil.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@ class = 'rodal-close']")).click();
		driver.findElement(By.xpath("//input[@ class = 'c-kHzvll bodyRegular16']")).sendKeys("Punjab National Bank");
		Thread.sleep(1500);
		driver.close();
		
		
	}

}
