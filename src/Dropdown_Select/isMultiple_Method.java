package Dropdown_Select;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultiple_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		 WebElement dropDown = driver.findElement(By.id("multiselect1"));
		 
		 Select s = new Select(dropDown);
		 System.out.println(s.isMultiple());
		 Thread.sleep(700);
		 s.selectByIndex(2);
		 Thread.sleep(700);
		 s.selectByValue("volvox");
		 Thread.sleep(500);
		 s.selectByVisibleText("Swift");
		 Thread.sleep(500);
		 s.deselectByIndex(0);
		 Thread.sleep(700);
		// s.deselectByValue("swift");
		 // Thread.sleep(700);
		// s.deselectAll();
		 
		
		
		System.out.println(s.getFirstSelectedOption().getText());	// to get text of first selected options
		System.out.println("============To get all options============");
			List<WebElement> options = s.getOptions();
			//System.out.println(options);
			for(WebElement o:options)
			{
				System.out.println(o.getText());
				
			}
			System.out.println("============To get selected options============");	
		List<WebElement> selectedOptions = s.getAllSelectedOptions();
		for(WebElement sos:selectedOptions)
		{
			System.out.println(sos.getText());
		}
		System.out.println("============For Loop============");	
		for(int i=0;i<=options.size()-1;i++)
		{
			System.out.println(options.get(i).getText());
		}
		System.out.println("============Using Iterator============");	
	    Iterator<WebElement> it = options.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		System.out.println("============Using ListIterator============");	
		 ListIterator<WebElement> lt = options.listIterator();
		 
		 while(lt.hasNext())
		 {
			 System.out.println(lt.next().getText());
		 }

			
			


		 
		 
		 
		 
		 
		 
	}

}
