package PopupHandler_Study;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow_Ex {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("NewTab")).click();
		Thread.sleep(1000);
		//to switch new tab we need ID by using getWindowHandles()
	Set<String> allWindowID = driver.getWindowHandles();
		Iterator<String> it = allWindowID.iterator();
		String mainpgID = it.next();
		System.out.println("ID Of Main Page is "+ mainpgID);
		String newWindowID = it.next();
		System.out.println("ID Of New window is "+ newWindowID);
		Thread.sleep(1000);
		//switching selenium focus from main page to new window
		driver.switchTo().window(newWindowID);
		Thread.sleep(700);
		//geting text of new window
		WebElement textNewWindow = driver.findElement(By.xpath("//h3[contains(text(),'automation testing techniques')]"));
		System.out.println("Text of new Window---> "+textNewWindow.getText());
	}

}
