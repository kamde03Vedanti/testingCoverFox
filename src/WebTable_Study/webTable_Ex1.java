package WebTable_Study;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable_Ex1 {

	public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		
		//single row header
		WebElement singleHeader = driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]/th[2]"));
		System.out.println(singleHeader.getText());
		
		//whole row of header
		List<WebElement> header = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
		for(WebElement th:header)
		{
			System.out.print(th.getText()+" ");
		}
		System.out.println();
		
		System.out.println("======================");
		
		// read only one data from table
		WebElement singleData = driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]/td[3]"));
		System.out.println(singleData.getText());
		System.out.println("======================");

		//read complete row data
		
		List<WebElement> rowfifth = driver.findElements(By.xpath("//table[@name='BookTable']//tr[5]/td"));
		for(WebElement tr5:rowfifth)
		{
			System.out.print(tr5.getText()+" ");
		}
		System.out.println();
		System.out.println("======================");
		
		for(int i=2;i<=7;i++)
		{
			WebElement column = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[3]"));
			System.out.println(column.getText());
	    }
		
		
		
		
		
		
	}

}
