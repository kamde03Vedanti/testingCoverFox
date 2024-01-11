package testNG_Study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listenersStudy.listenersDemo;

@Listeners(listenersStudy.listenersDemo.class)
public class listenerExample {
  @Test
  public void a() 
  {
	  Reporter.log("A is running ", true);
  }
  @Test
  public void b() 
  {
	  Assert.fail();
	  Reporter.log("B is running ", true);
	
  }
  @Test(dependsOnMethods = {"b"})
  public void c() 
  {
	  Reporter.log("C is running ", true);
	  
  }
  @Test
  public void d() 
  {  Reporter.log("D is running ", true);
	  
  }
}
