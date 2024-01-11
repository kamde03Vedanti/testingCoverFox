package PopupHandler_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision_Popup {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
//without handling Hidden div popup working on main page it gives exception 'ElementClickInterceptedException'
		driver.findElement(By.xpath("//span[@role='button']")).click(); 
		
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("shoes");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
