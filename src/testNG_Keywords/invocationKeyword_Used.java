package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationKeyword_Used {
  @Test
  public void test()
  {
	  Reporter.log("Test 1 is running..", true);
  }
  @Test(invocationCount = 3)
  public void test1()
  {
	  Reporter.log("Test  2is running..", true);
  }
  
}
