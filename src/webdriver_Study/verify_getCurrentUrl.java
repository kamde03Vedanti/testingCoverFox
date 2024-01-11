package webdriver_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify_getCurrentUrl {

	public static void main(String[] args) throws InterruptedException 
	{
		String excpectedResult= "https://www.zomato.com/india";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		
		Thread.sleep(1000);
		//driver.close();
		
		String url = driver.getCurrentUrl();
		System.out.println("Url is -->" +url);
		
		if(excpectedResult.equals(url))
		{
			System.out.println("Url is Matching and Test Case is Passed");
		}
		else
		{
			System.out.println("Url is not Matching and Test Case is Failed");
		}
		
		
	}

}
