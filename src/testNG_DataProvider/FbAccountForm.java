package testNG_DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FbAccountForm {
  
	@Test(dataProvider = "FbRegression",dataProviderClass = dataProviderUsed.class)
  public void FbSingin(String firstName, String lastName, String mobNum) throws InterruptedException 
  {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("firstname")).sendKeys(firstName);
    driver.findElement(By.name("lastname")).sendKeys(lastName);	
    driver.findElement(By.name("reg_email__")).sendKeys(mobNum);	
	Thread.sleep(5000);
	driver.close();
	  
  }
}
