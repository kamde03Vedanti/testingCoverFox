package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector_Use {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/login.php");
		Thread.sleep(1000);
        //css=Id and tags
	    driver.findElement(By.cssSelector("input#email")).sendKeys("testing@123");
	    //css=tag and attribute
		driver.findElement(By.cssSelector("button[name='login']")).click();
		Thread.sleep(1000);
		//css= tags and class
		driver.findElement(By.cssSelector("a._97w4")).click();
		Thread.sleep(1000);
	
		//css=tags, class and attribute
		driver.findElement(By.cssSelector("input.inputtext[name='email']")).sendKeys("Shreyas@123");
       
	}

}
