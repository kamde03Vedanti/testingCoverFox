package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priorityKeyword_Used {
  @Test(priority=-2)
  public void a()
  {
	  Reporter.log("Tc A is running.", true);
  }
  @Test(priority=-4)
  public void b() 
  {
	  Reporter.log("Tc B is running.", true);
  }
  @Test(priority=2)
  public void c()
  {
	  Reporter.log("Tc C is running.", true);
  }
  @Test
  public void d() 
  {
	  Reporter.log("Tc D is running.", true);
  }











}





