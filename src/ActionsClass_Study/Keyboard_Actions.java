package ActionsClass_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(1000);
	//WebElement day = driver.findElement(By.id("day"));
	//Thread.sleep(1000);
		
	Actions act = new Actions(driver);
//act.click(day).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
//	act.click(day).sendKeys(Keys.ARROW_DOWN).build().perform();
//	Thread.sleep(700);
//	act.sendKeys(Keys.ARROW_DOWN).perform();
//    Thread.sleep(700);	
//	act.sendKeys(Keys.ARROW_DOWN).perform();
//	Thread.sleep(700);		
//	act.sendKeys(Keys.ARROW_DOWN).perform();
//	Thread.sleep(700);	
//	act.sendKeys(Keys.ENTER).perform();
	
//	act.click(day).perform();
//	for(int i=0;i<=15;i++)
//	{
//		act.sendKeys(Keys.ARROW_UP).perform();
//		Thread.sleep(700);
//		
//	}
//	act.sendKeys(Keys.ENTER).perform();
	Thread.sleep(1000);

	WebElement firstnameField = driver.findElement(By.name("firstname"));
	
	//act.sendKeys(firstnameField,"VEDANTI").perform();--> send keys of actions class
		
	//velocity	
	//act.keyDown(firstnameField, Keys.SHIFT).sendKeys("velocity").build().perform();
		
	act.keyDown(firstnameField, Keys.SHIFT).sendKeys("v").keyUp(Keys.SHIFT).sendKeys("edanti").build().perform();
		
		

	}

}
