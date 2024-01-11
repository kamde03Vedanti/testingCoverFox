package PopupHandler_Study;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow_Popup {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		// getting main page text 
		WebElement mainPageText = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']"));
		System.out.println("Text of main page is "+ mainPageText.getText());
		
		// clicking on New Window button
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
//without switching working on element of child window gives exception NoSuchElementException  		
//driver.findElement(By.id("the7-search")).sendKeys("Wednesday");
	
		//to switch to child window we need ID of child window
		String mainPgID = driver.getWindowHandle();
		System.out.println("ID of Main Page is "+ mainPgID);
		
		//Using getWindowHandles() to get all page Id
		Set<String> allWindowID = driver.getWindowHandles();
		
		Iterator<String> it = allWindowID.iterator();
		String mainPageID = it.next();//id of main page
		String childID = it.next();// id of child 1 window
	
	System.out.println("Main Page ID " + mainPageID);
	System.out.println("Child Window ID "+ childID);
	
	//switching the focus from main page to child window
	driver.switchTo().window(childID);
	Thread.sleep(1000);
	
	driver.manage().window().maximize();
	//driver.close(); NoSuchWindowException
	driver.findElement(By.id("the7-search")).sendKeys("Wednesday");
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
