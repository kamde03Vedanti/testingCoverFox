package CoverFox_DemoByPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFox_ResultPage {
	
	@FindBy(xpath = "//div[contains(text(),'matching Health')]") private WebElement textOfResultPage;
	
	@FindBy(id = "plans-list") private List<WebElement> planlist;
	
	public CoverFox_ResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validatePlanListResult()
	{
		String stringText = textOfResultPage.getText();
		
		String ar[]=stringText.split(" "); // using split we are splitting ar=["49","matching","Health"...]
		
		String numberOfResultInString = ar[0];
		//convert String to Integer
		int numberOfResultInInt = Integer.parseInt(numberOfResultInString);
		
		int totalNumOfPlansList=planlist.size();
		System.out.println("Total no. of Plan list are " +totalNumOfPlansList);
		
		if(totalNumOfPlansList==numberOfResultInInt)
		{
			System.out.println("Plans Number matching with Plans list than,Tc is Passed");
		}
		else
		{
			System.out.println("Plans Number are not matching with plans list than, Tc failed");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
