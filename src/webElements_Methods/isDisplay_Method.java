package webElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class isDisplay_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
       // driver.findElement(By.id("hide-textbox")).click();
        boolean Result = driver.findElement(By.name("show-hide")).isDisplayed();
        System.out.println("Displayed status " + Result);
        
        driver.findElement(By.id("displayed-text")).sendKeys("Have a nice day");
        Thread.sleep(400);
        driver.findElement(By.id("hide-textbox")).click();
        
      }
}