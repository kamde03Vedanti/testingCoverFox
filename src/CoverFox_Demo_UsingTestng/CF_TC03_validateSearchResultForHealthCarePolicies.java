package CoverFox_Demo_UsingTestng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CF_TC03_validateSearchResultForHealthCarePolicies {
	
	WebDriver driver;
	CoverFox_HomePage home;
	CoverFox_HealthPlanPage healthplan;
	CoverFox_AddressDetailsPage addressDetails;
	CoverFox_MemeberDetailsPage memberDetails;
	CoverFox_HealthPlanResultPage resultpage;

  @BeforeClass
  public void launchingBrowser() 
  {
	  driver= new ChromeDriver();
	  home = new CoverFox_HomePage(driver);
	  healthplan = new CoverFox_HealthPlanPage(driver);
	  addressDetails = new CoverFox_AddressDetailsPage(driver);
	  memberDetails = new CoverFox_MemeberDetailsPage(driver);
	  
	  
	  Reporter.log("Opening browser", true);
	  driver.get("https://www.coverfox.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	}
  
  @BeforeMethod
  public void enterMemeberDetails() throws InterruptedException
  {
	  Reporter.log("clicking on Female Button", true);
	  home.ClickOnFemaleButton();
	  Thread.sleep(1000);
	  
	  Reporter.log("clicking on Next Button", true);
	  healthplan.ClickOnNextButton();
	  Thread.sleep(1000);
	  
	  Reporter.log("Handeling Age Drop down", true);
	  memberDetails.selectAgeDropDown("30");
	  Thread.sleep(1000);
	  
	  Reporter.log("clicking on Next Button after age", true);
	  memberDetails.ClickOnNextbuttonAfterAge();
	  Thread.sleep(1000);
	  
	  Reporter.log("entering Pincode", true);
	  addressDetails.enterPincode("442401");
	  Thread.sleep(1000);
	  
	  Reporter.log("entering Mobile No.", true);
	  addressDetails.enterMobileNum("9990099999");
	  Thread.sleep(1000);
	  
	  Reporter.log("clicking on Continue Button", true);
	  addressDetails.ClickOnContinueButton();
	  Thread.sleep(1000);
	  
  }
 
  @Test
  public void validateTestPlansFromTextandBanner() throws InterruptedException
  {
	  Thread.sleep(5000);
	  Reporter.log("Fetching no. of result from text", true);
	  int textResult = resultpage.availablePlanNumberFromText();
	  Thread.sleep(7000);
	  Reporter.log("Fetching no. of result from banner", true);
	  int bannerResult = resultpage.availablePlanNumberFromBanner();
	  Thread.sleep(7000);
	  
	  Assert.assertEquals(textResult, bannerResult,"Text result is not equal to banner result, TC is Failed");
	  Reporter.log("TC is Passed", true);
	}
  
  @AfterMethod
  public void closingBrowser() throws InterruptedException
  {
	  Reporter.log("Closing Browser", true); 
	  Thread.sleep(7000);
	  driver.close();
  }
  
  
  
  
}
