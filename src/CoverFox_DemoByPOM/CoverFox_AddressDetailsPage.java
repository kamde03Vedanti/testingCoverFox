package CoverFox_DemoByPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFox_AddressDetailsPage
{
	
	@FindBy(xpath = "(//input[@type='number'])[1]") private WebElement pincodFeild;
	
	@FindBy(xpath = "(//input[@type='number'])[2]") private WebElement mobilenumFeild;
	@FindBy(className = "next-btn") private WebElement continueButton;
	public CoverFox_AddressDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterPincode(String Pincode)
	{
		pincodFeild.sendKeys(Pincode);
	}
	public void enterMobileNum(String Mobno)
	{
		mobilenumFeild.sendKeys(Mobno);
	}
	public void ClickOnContinueButton()
	{
		continueButton.click();
		
	}
	
	
	
	
	

}
