package CoverFox_Demo_UsingTestng;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFox_HealthPlanResultPage {
	
	@FindBy(xpath = "//div[contains(text(),'matching Health')]") private WebElement textOfResultPage;
	
	@FindBy(id = "plans-list") private List<WebElement> planlist;
	
	public CoverFox_HealthPlanResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public int availablePlanNumberFromText()
	{
		String stringText = textOfResultPage.getText();
		
		String ar[]=stringText.split(" "); // using split we are splitting ar=["49","matching","Health"...]
		
		String numberOfResultInString = ar[0];
		//convert String to Integer
		int numberOfResultInInt = Integer.parseInt(numberOfResultInString);
		return numberOfResultInInt;
	}
		
	public int availablePlanNumberFromBanner()
	{
		int totalNumOfPlansList=planlist.size();
		System.out.println(totalNumOfPlansList);
		return totalNumOfPlansList;
	}
		
		
		
		
		
		
//		if(totalNumOfPlansList==numberOfResultInInt)
//		{
//			System.out.println("Plans Number matching with Plans list than,Tc is Passed");
//		}
//		else
//		{
//			System.out.println("Plans Number are not matching with plans list than, Tc failed");
//		}
		
		
	}
	
	
	
	
	
	
	
	
	
	

