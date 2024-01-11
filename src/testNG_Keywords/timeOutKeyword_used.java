package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeOutKeyword_used {
  @Test(timeOut = 3000)
  public void method1() throws InterruptedException 
  {
	  Thread.sleep(5000);
	  Reporter.log("Method 1 is running..", true);
  }
  @Test(timeOut = 5000)
  public void method2() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  Reporter.log("Method 2 is running..", true);
  }
  @Test(timeOut = 5000)
  public void method3() throws InterruptedException 
  {
	  Thread.sleep(5000);
	  Reporter.log("Method 3 is running..", true);
  }
    
  
}
