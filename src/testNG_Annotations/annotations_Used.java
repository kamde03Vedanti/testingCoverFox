package testNG_Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotations_Used {
  @Test
  public void method1() 
  {
	  Reporter.log("Test method1 is running..", true);
  }
  @Test
  public void method2()
  {
	  Reporter.log("Test method2 is running..", true);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("Login is Done..", true);
  }
  @AfterMethod
  public void AfterMethod()
  {
	  Reporter.log("LogOut is Done..", true);
  }
  
  













}
