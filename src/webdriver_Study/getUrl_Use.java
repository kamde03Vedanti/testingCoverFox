package webdriver_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getUrl_Use {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		
		Thread.sleep(1000);
		String url = driver.getCurrentUrl();
		System.out.println(" Url is " +url);
		//driver.close();
		
		
	}

}
