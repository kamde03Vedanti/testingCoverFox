package ActionsClass_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickUsingActionsClass
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		//find the element locator where we have to take action
		WebElement Button = driver.findElement(By.id("loginbutton"));
	   //create Actions class object to use actions method 
		Actions act = new Actions(driver);
	   act.moveToElement(Button).click().build().perform();  // move to element and than click
	   // act.click().perform();  if are not using click in method chaining
	    Thread.sleep(2000);
	 //-------------------------------------------
  
	    driver.get("https://groww.in/");
	    Thread.sleep(1000);
	    WebElement login_Button = driver.findElement(By.xpath("//span[text()='Login/Register']"));
	    act.click(login_Button).perform(); // click with passing parameters
	    Thread.sleep(500);
   
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
