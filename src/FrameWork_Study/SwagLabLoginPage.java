package FrameWork_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage 
{
   // variables
	@FindBy(id = "user-name")private WebElement userNameField;
	@FindBy(name = "password") private WebElement passwordField;
	@FindBy(id = "login-button") private WebElement loginButton;
	
	//constructor
	
	public SwagLabLoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	//Methods
	public void enterUsername()
	{
		userNameField.sendKeys("standard_user");
	}
	public void enterPassword()
	{
		passwordField.sendKeys("secret_sauce");
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
