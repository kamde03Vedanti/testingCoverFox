package PopupHandler_Study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup_Handle 
{

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(500);
		//switching selenium focus from main page to alert popup
		Alert alt = driver.switchTo().alert();
		alt.dismiss();   //click on cancel button on alert popup 
		//Thread.sleep(1000);
		driver.findElement(By.name("cusid")).sendKeys("H2345");
		Thread.sleep(700);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(700);
		alt.accept();     // clicking on ok button on alert popup
		Thread.sleep(700);
		//getting text on alert pop up
		System.out.println(alt.getText());
		Thread.sleep(700);
		alt.accept();
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
