package testNG_Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG_Heirarchy {
  @Test
  public void testMethod1() 
  {
	  Reporter.log("test Method 1 is running", true);
  
  }
  @Test
  public void testmethod2()
  {
	  Reporter.log("test Method 2 is running", true);
	  
  }
  @BeforeMethod
  public void beforemethod()
  {
	  Reporter.log("Before Method will execute first before every test method", true);
  }
  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("After Method will execute after every test method", true);
  }
  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("Before Class will execute before Before Method and Test Method", true);
  }
 













}
