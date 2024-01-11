package FrameWork_Study;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateSwagLabLoginPage {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		SwagLabLoginPage login = new SwagLabLoginPage(driver);
		login.enterUsername();
		login.enterPassword();
		login.clickOnLoginButton();
		
		SwagLabsInventoryPage inventory = new SwagLabsInventoryPage(driver);
		inventory.ClickOnBackpackAddtoCartButton();
		inventory.ClickOntshirtAddtoCartButton();
		inventory.ClickOnAddtoCartButton();
		
		
		
		
		
	}

}
