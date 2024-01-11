package webElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnable_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id = 'mobileNumber']")).sendKeys("9988877440");
		//driver.findElement(By.xpath("//button[text()='Get OTP'])")).click();	
		
	boolean	result=driver.findElement(By.xpath("driver.findElement(By.xpath(\"//button[text()='Get OTP']")).isEnabled();
		System.out.println("Get OTP Button status" +result);
		
	}

}
