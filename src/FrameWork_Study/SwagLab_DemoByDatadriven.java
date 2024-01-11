package FrameWork_Study;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLab_DemoByDatadriven {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		//enter user name
		WebElement user_name = driver.findElement(By.name("user-name"));
		//enter password
		WebElement password = driver.findElement(By.name("password"));
		//click on login
		WebElement loginButton = driver.findElement(By.id("login-button"));
		
		user_name.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		loginButton.click();
		
		//opening next webpage and add two items in to cart
		
	 WebElement tshirt = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
	 tshirt.click();
	 WebElement back_pack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));	
	 back_pack.click();
	 //click on cart button 
	 WebElement cartbutton = driver.findElement(By.id("shopping_cart_container"));
	 cartbutton.click();
	 
	 //Find out total no of item in cart
	 List<WebElement> cart_Items = driver.findElements(By.className("inventory_item_name"));
	 System.out.println("No. of Items are " +cart_Items.size());
	
	//validate items 
	for(WebElement ci:cart_Items)
	{
		System.out.println("Items are " +ci.getText());
	}
	
	Iterator<WebElement> it = cart_Items.iterator();
	WebElement item1 = it.next();
	WebElement item2 = it.next();
	
	if(item1.getText().equals("Test.allTheThings() T-Shirt (Red)"))
	{
		System.out.println("Selected Item is Correct...= Test.allTheThings() T-Shirt (Red)");
	}
	  if(item2.getText().equals("Sauce Labs Backpack"))
	  {
		  System.out.println("Selected Items is Correct..= Sauce Labs Backpack ");
		  driver.findElement(By.id("checkout")).click();
	  }
	  else
	  {
		  System.out.println("Selected item is not Correct!");
	  }
	  
	  //next page - first name
	  WebElement first_name = driver.findElement(By.name("firstName"));
	  WebElement last_name = driver.findElement(By.id("last-name"));
	  WebElement postalcode = driver.findElement(By.id("postal-code"));
	  //clicking on continue button
	  WebElement continueButton = driver.findElement(By.id("continue"));
	  
	  first_name.sendKeys("shubh...");
	  last_name.sendKeys("jain");
	  postalcode.sendKeys("452001");
	  continueButton.click();
	  
	  // next page clicking finish button
	 WebElement finishbutton = driver.findElement(By.id("finish"));
	finishbutton.click();
	
	// next page verify thankyou message
	WebElement textmsg = driver.findElement(By.xpath("//h2[text()='Thank you for your order!']"));
	if(textmsg.getText().equals("Thank you for your order!"))
	{
		System.out.println("Thank you message dispalyed and Loggin out");
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(500);
		driver.findElement(By.id("logout_sidebar_link")).click();
	}
	else
	{
		System.out.println("Thank you message is not dispalyed");
	}
	  
	  
	}

}
