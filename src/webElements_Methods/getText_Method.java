package webElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText_Method {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		String expectedResult = "Facebook helps you connect and share with the people in your life.";
		String actualResult=driver.findElement(By.className("_8eso")).getText();
			System.out.println(actualResult);
		
			if(expectedResult.equals(actualResult))
			{
				System.out.println("Text is matching and test case is passed");
				
			}
			else
			{
				System.out.println("Text is not matching and test case is Failed");
			}
	}

}
