package ActionsClass_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_ContextClick {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.moveToElement(rightClickButton).contextClick().build().perform();
		//act.contextClick().perform(); // contextClick without parameter
		//act.contextClick(rightClickButton).perform();//contextClick  with parameter
		Thread.sleep(700);
//--------------------------------------------------------------------------------
	WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	 act.doubleClick(doubleClick).perform();
	
	
	
	
	
	
	
	
	
	}

}
