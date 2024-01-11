package testNG_ParallelandSerialExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class amazon_launch {
  @Test
  public void amazon() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://www.amazon.in/");
	  Reporter.log("Lanching amazon", true);
 }
}
