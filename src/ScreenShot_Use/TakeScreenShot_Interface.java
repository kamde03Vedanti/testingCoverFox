package ScreenShot_Use;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class TakeScreenShot_Interface 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(1000);
		
			File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			System.out.println(source);
//		LocalDate ld = LocalDate.now();
//			System.out.println(ld);
           	String rs = RandomString.make(3);			//to avoid overwriting
			System.out.println(rs);
			File dest = new File("D:\\MyScreenshot\\ScreenShot"+rs+".png");
			FileHandler.copy(source, dest);
			
			
		
			
			
		
	}

}
