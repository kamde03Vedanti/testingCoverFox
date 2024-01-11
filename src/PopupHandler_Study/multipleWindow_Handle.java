package PopupHandler_Study;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindow_Handle {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='MNC']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Marketing']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Banking & Finance']")).click();
		Thread.sleep(1000);
		
		Set<String> allTabsId = driver.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<>(allTabsId);
		
		for(int i=0;i<al.size();i++)
		{
			Thread.sleep(1000);
			driver.switchTo().window(al.get(i));
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
