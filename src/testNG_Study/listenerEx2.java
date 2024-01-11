package testNG_Study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class listenerEx2 {
	@Test
	  public void e() 
	  {
		  Reporter.log("e is running ", true);
	  }
	  @Test
	  public void f() 
	  {
		  Assert.fail();
		  Reporter.log("f is running ", true);
		
	  }
	  @Test(dependsOnMethods = {"f"})
	  public void g() 
	  {
		  Reporter.log("g is running ", true);
		  
	  }
	  @Test
	  public void h() 
	  {  Reporter.log("h is running ", true);
		  
	  }
}
