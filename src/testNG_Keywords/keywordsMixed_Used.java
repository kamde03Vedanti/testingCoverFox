package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keywordsMixed_Used {
  @Test(timeOut=1000)
  public void a()
  {
	  Reporter.log("a method is running...", true);
  }
  @Test(invocationCount = 2)
  public void b()
  {
	  Reporter.log("b method is running...", true); 
  }
  @Test(dependsOnMethods = {"a"} )
  public void c()
  {
	  Reporter.log("c method is running...", true);  
  }
  @Test(priority = -2)
  public void d()
  {
	  Reporter.log("d method is running...", true);
  }
 









}
