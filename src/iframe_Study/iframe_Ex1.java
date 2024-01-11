package iframe_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_Ex1 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(1000);
		driver.switchTo().frame("singleframe");
		String mytext = driver.findElement(By.xpath("//h5[text()='iFrame Demo']")).getText();
		System.out.println("Text is "+ mytext);
		
		driver.switchTo().defaultContent();
		boolean button = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).isDisplayed();
		System.out.println("Button status is-->" + button);
	}

}
