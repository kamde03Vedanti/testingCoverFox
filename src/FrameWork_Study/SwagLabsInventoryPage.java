package FrameWork_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SwagLabsInventoryPage {

	
 @FindBy(id = "add-to-cart-sauce-labs-backpack") private WebElement backPackAddtoCart;
 @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")private WebElement tshirtAddtoCart;
 @FindBy(id = "shopping_cart_container")private WebElement AddtoCartButton;
		
 public SwagLabsInventoryPage(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
 }
	
 public void ClickOnBackpackAddtoCartButton()
 {
	 backPackAddtoCart.click();
 }
	
 public void ClickOntshirtAddtoCartButton()
 {
	 tshirtAddtoCart.click();
 }
 public void ClickOnAddtoCartButton()
 {
	 AddtoCartButton.click();
 }
		
		

	

}
