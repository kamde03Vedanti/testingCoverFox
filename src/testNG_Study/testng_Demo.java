package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testng_Demo {
  @Test
  public void reporter() 
  {
	System.out.println("Hi this is Printing Statment..."); 
	Reporter.log("Hi this is Reporter without boolean parameter");
	Reporter.log("Hi this is Reporter with Boolean Parameter", true);
	 
  }
}
