package CoverFox_DemoByPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ValidateCoverFoxPageandMatchingPlans {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		CoverFox_HomePage home = new CoverFox_HomePage(driver);
		Thread.sleep(500);
		home.ClickOnFemaleButton();
		
		CoverFox_HealthPlanPage page2 = new CoverFox_HealthPlanPage(driver);
		Thread.sleep(500);
		page2.ClickOnNextButton();
		
		CoverFox_MemeberDetailsPage page3= new CoverFox_MemeberDetailsPage(driver);
		Thread.sleep(1500);
		page3.selectAgeDropDown("29");
	    page3.ClickOnNextbuttonAfterAge();
		
		CoverFox_AddressDetailsPage page4= new CoverFox_AddressDetailsPage(driver);
		Thread.sleep(1500);
		page4.enterPincode("442402");
		page4.enterMobileNum("9090988900");
		Thread.sleep(1500);
		page4.ClickOnContinueButton();
		
		CoverFox_ResultPage page5 = new CoverFox_ResultPage(driver);
		Thread.sleep(7000);
		//page5.validatePlanListResult();
		
//		Thread.sleep(7000);
//		driver.close();
//		
		
		
		
		
		
		
		
		
		
		
	}

}
