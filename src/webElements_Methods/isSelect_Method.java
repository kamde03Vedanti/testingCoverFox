package webElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelect_Method {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		Thread.sleep(700);
		
//		boolean result = driver.findElement(By.xpath("//input[@value='1']")).isSelected();
//		System.out.println("Gender status is " +result);
		
		WebElement gender = driver.findElement(By.xpath("//input[@value='1']"));
		gender.click();
		boolean result=gender.isSelected();
		System.out.println("Gender selection status " +result);

	}

}
