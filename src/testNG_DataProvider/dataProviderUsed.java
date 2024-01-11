package testNG_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderUsed {
 
  @DataProvider(name="FbRegression")
  public static String[][] fbData() 
  {
		String data[][]= {{"Pratiksha","Khote","9090888444"},
						  {"Vedanti","Kamde","8080958686"},
						  {"Prajakta","Duratkar","8899966330"}};
		return data;
		
		
  }	  
 
}
  

