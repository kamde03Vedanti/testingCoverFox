package scroll_UsingJavascripted;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_Demo {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	Thread.sleep(1000);
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,600)");
	Thread.sleep(1000);
	jse.executeScript("window.scrollBy(0,1900)");
	Thread.sleep(1000);
    jse.executeScript("window.scrollBy(0,-1000)");
	Thread.sleep(1000);
	


		
		
		
		
		
		
		
	}

}
