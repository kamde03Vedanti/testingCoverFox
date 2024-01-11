package iframe_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Iframe 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(1000);
		//Switch focus from main Page to iframe
		driver.switchTo().frame("singleframe");
		String mytext = driver.findElement(By.xpath("//h5[text()='iFrame Demo']")).getText();
		System.out.println("Text is "+ mytext);
		
		//Switch focus from iframe to main page
		
		driver.switchTo().defaultContent();
		boolean button = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).isDisplayed();
		
		System.out.println("Button status is ---> " + button);
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		int frame = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("Total frames are " + frame);
		
		driver.switchTo().frame(2);  // outer frame
		String Ntext = driver.findElement(By.xpath("//h5[text()='Nested iFrames']")).getText();
		
		System.out.println("outer frame text is "+ Ntext);
		
		
		
		//driver.switchTo().frame(15);  //inner frame
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
