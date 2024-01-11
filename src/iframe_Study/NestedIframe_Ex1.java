package iframe_Study;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedIframe_Ex1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(1000);
		
	String mainpage = driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText();
	System.out.println("Main Page Text is --->"+ mainpage);
	
	driver.switchTo().frame("frame1");   //outer Frame
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Happy Diwali");
	Thread.sleep(1000);
	System.out.println("*********switchto inner frame**************");
	driver.switchTo().frame("frame3");	// inner frame
	driver.findElement(By.id("a")).click();//clicking on Check Box
	Thread.sleep(1000);
	driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//input[@type='text']")).clear();
	Thread.sleep(1000);
	System.out.println("*******switchto mainpage****************");
	driver.switchTo().defaultContent();
//	String text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
//	System.out.println("Text of mainpage="+ text);
	Thread.sleep(1000);
	System.out.println("*********switchto second frame***************");
	
	driver.switchTo().frame("frame2");
	WebElement dropdown = driver.findElement(By.id("animals"));
	Select s = new Select(dropdown);
	s.selectByIndex(2);
	//For traversing 
  List<WebElement> s1 = s.getOptions();
//  System.out.println(s1);
  	Iterator<WebElement> it = s1.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next().getText());
	}
//  for loop	
//	for(int i=0;i<=s1.size()-1;i++)
//	{
//		System.out.println(s1.get(i).getText());
//	}
	System.out.println("************************");
	
	driver.switchTo().defaultContent();//main page
	String text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
	System.out.println("Text of mainpage="+ text);
	
	
	
	
	}

}
