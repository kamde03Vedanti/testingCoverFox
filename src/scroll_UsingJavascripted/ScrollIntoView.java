package scroll_UsingJavascripted;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		Thread.sleep(1000);
		WebElement textOfPaytm = driver.findElement(By.xpath("//h1[text()='Financial Services by Paytm']"));
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", textOfPaytm);
		Thread.sleep(1000);
	File src = textOfPaytm.getScreenshotAs(OutputType.FILE);
	System.out.println(src);
	File dest=new File("D:\\MyScreenshot\\Paytm.png");
	FileHandler.copy(src, dest);
	
		
		
		
		
		
		
	}

}
