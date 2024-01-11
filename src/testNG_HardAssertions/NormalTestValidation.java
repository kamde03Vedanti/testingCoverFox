package testNG_HardAssertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NormalTestValidation {
  @Test
  public void f() throws InterruptedException
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.linkText("Create new account")).click();
	  Thread.sleep(1000);
  boolean radioButtonSelection = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
  
  //if Female radio button is selected the TC is Pass otherwise failed
   System.out.println("Female radio button Status is" +radioButtonSelection);
  
    Assert.assertTrue(radioButtonSelection, "Radio Button is not selected TC is failed");
  
  
  
//  if(radioButtonSelection)
//  {
//	System.out.println("Radio Button is Selected,TC is Passed"); 
//  }
//  else
//  {
//	System.out.println("Radio Button is not Selected, TC is failed");  
//  }
 }
}
