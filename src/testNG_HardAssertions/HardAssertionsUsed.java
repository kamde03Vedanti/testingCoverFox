package testNG_HardAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionsUsed {
  @Test
  public void equals_notEquals()
  {
	  String a="Mumbai";
	  String b="Pune";
	  String c="Mumbai";
	  
	 // Assert.assertEquals(a, c,"A & B are not matching, Tc will Failed");
	  
	  Assert.assertNotEquals(b,c , "B & C are matching than Tc will Failed");
	  
  }

  @Test
  public void null_Notnull()
  {
	  String d="Vedanti";
	  String e=null;
	  
	  // both validating point will not execute 
	 Assert.assertNotNull(d,"D is Null than test case is Failed");
	   
	 Assert.assertNull(e,"E is Not Null than Test Case is Failed");
  }
  @Test
  public void trueAndfalse()
  {
	  boolean a=true;
	  boolean b=false;
	  
	  Assert.assertTrue(b, "B not true than TC is Failed");
	 // Assert.assertFalse(a, "A is true than Tc is Failed");
  }
  








}
