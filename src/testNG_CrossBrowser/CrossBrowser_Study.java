package testNG_CrossBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowser_Study {
  @Test
  public void f(String browserName) throws InterruptedException
  {
	  WebDriver driver = null;
	  if(browserName.equals("Chrome"))
	  {
	   driver = new ChromeDriver();
	  }
	  else if(browserName.equals("FireFox"))
	  {
	  driver = new FirefoxDriver(); 
	  }
	  	driver.manage().window().maximize();
	  	driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("vedanti");
	    driver.findElement(By.name("lastname")).sendKeys("kamde");	
	    driver.findElement(By.name("reg_email__")).sendKeys("vedantik03@gmail");	
		Thread.sleep(5000);
		driver.close();
  }
}
