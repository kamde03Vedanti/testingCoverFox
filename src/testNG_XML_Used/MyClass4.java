package testNG_XML_Used;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass4 {
  @Test(groups = "Sanity")
  public void Tc12()
  {
	  Reporter.log("Tc12 is running..", true);
  }
 
  @Test(groups = {"Regression","Sanity"})
  public void Tc13()
  {
	  Reporter.log("Tc13 is running..", true);
  }
 
  @Test(groups = "Sanity")
  public void Tc14()
  {
	  Reporter.log("Tc14 is running..", true);
  }
  
}
