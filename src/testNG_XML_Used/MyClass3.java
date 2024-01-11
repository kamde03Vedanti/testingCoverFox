package testNG_XML_Used;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass3 {
  @Test(groups = "Regression")
  public void Tc9()
  {
	  Reporter.log("Tc9 is running..", true);
  }
 
  @Test(groups = "Regression")
  public void Tc10()
  {
	  Reporter.log("Tc10 is running..", true);
  }
  
  @Test(groups = "Sanity")
  public void Tc11()
  {
	  Reporter.log("Tc11 is running..", true);
  }
  
}
