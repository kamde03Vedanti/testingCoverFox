package testNG_Study;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ptestng01 {
  @Test
  public void flipkartlanch() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://www.flipkart.com/account/login?ret=/");
	  Reporter.log("Launching flipkart", true);
	 
 }
  @Test
  public void redBusLaunch()
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.redbus.in/");
	  Reporter.log("Launching RedBus", true);
  }
  
//  @Test
//  public void DiscoveryLaunch()
//  {
//	  WebDriver driver = new ChromeDriver();
//	  driver.get("https://www.discoveryplus.in/");
//	  Reporter.log("Launching Discovery", true);
//  }
  @Test
  public void zomatoLaunch()
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.zomato.com/india");
	  Reporter.log("Launching zomato", true);
	  
  }
}
