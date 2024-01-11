package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class randomList_Ex {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/?authuser=0");
		Thread.sleep(2000);
		
		driver.findElement(By.id("APjFqb")).sendKeys("Iphone");
		Thread.sleep(1000);
		//ul--> un-order List
	 List<WebElement> searchresult = driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]/ul/li"));
	System.out.println("--------using For Each Loop---------");
	
	for(WebElement sr:searchresult)
	{
		System.out.println(sr.getText());
	}
		
//	System.out.println("--------using For Loop---------");
//	for(int i=0;i<=searchresult.size()-1;i++)
//	{
//		System.out.println(searchresult.get(i).getText());
//	}
	System.out.println("---------------------------------");
   String expectedResult = "iphone 13";
   
   for(WebElement sr1:searchresult)
   {
	   String actualResult = "iphone 13";
	   if(actualResult.equals(expectedResult))
	   {
		   sr1.click();
		   System.out.println(actualResult);
		   break;
	   }
   }
		
		
	}

}