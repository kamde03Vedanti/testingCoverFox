package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enableKeyword_Used {
//  @Test(enabled = true)
//  public void add() 
//  {
//	  Reporter.log("It is true and it will execute",true) ;
//  }
  @Test(enabled = false)
  public void sub() 
  {
	  Reporter.log("It is false and it will not execute",true) ;
  }
}
