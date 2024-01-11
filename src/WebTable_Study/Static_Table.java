package WebTable_Study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Table {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));

		//to read complete table data
		System.out.println("------------------------------------------");
		for(int h=1;h<=7;h++)
		{
			for(int j=1;j<=4;j++ )
				
				if(h==1)
				{
					WebElement tableData = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+h+"]/th["+j+"]"));
					System.out.print(tableData.getText()+" ");
				}
				else
				{
					WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+h+"]/td["+j+"]"));
					System.out.print(data.getText()+" ");
					//System.out.println("------------------------------------------");

				}
				System.out.println();
				System.out.println("------------------------------------------");

				
		}
		
		
		
		
		
		
		
		
		
		
	}

}
