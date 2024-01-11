package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethod_Used {
  @Test(dependsOnMethods = {"z"} )
  public void w() 
  {
	  Reporter.log("w is running..", true);
  }
  @Test
  public void x() 
  {
	  Reporter.log("x is running..", true);
  }
  @Test
  public void y() 
  {
	  Reporter.log("y is running..", true);
  }
  @Test
  public void z() 
  {
	  Reporter.log("z is running..", true);
  }
  
}
