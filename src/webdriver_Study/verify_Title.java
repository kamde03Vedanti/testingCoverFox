package webdriver_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify_Title {

	public static void main(String[] args) throws InterruptedException {
		
 String expectedResult="Groww - Online Demat, Trading and Direct Mutual Fund Investment in India";
			
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://groww.in/");
		Thread.sleep(1000);
		//driver.close();
		
		
			String	actualResult= driver.getTitle();
			
			if(expectedResult.equals(actualResult))
			{
				System.out.println("Title is matching and TC is passed");
			}
			else
			{
				System.out.println("Tile is not matching and TC is Failed");
			}
			
	}

}
