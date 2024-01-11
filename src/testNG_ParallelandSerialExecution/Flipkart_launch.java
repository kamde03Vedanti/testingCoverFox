package testNG_ParallelandSerialExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart_launch {
  @Test
  public void flipkart()
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://www.flipkart.com/account/login?ret=/");
	  Reporter.log("Launching flipkart", true);
	  
	  
  }
}
