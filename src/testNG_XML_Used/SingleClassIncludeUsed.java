package testNG_XML_Used;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SingleClassIncludeUsed {
  @Test
  public void Tc1() 
  {
	  Reporter.log("Tc1 is running..", true); 
  }
  @Test
  public void Tc2() 
  {
	  Reporter.log("Tc2 is running..", true); 
  }
  @Test
  public void Tc3() 
  {
	  Reporter.log("Tc3 is running..", true); 
  }
  @Test
  public void Tc4() 
  {
	  Reporter.log("Tc4 is running..", true); 
  }
}
