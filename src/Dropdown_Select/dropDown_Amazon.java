package Dropdown_Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown_Amazon {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(700);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(1000);
		//For Date
		//1.identify list box to be handled and store it in reference variable
		WebElement Date = driver.findElement(By.id("day"));
		
		//2.create an object of select class which will accept WebElement  as argument 
		Select sDob = new Select(Date);
		
		//3.By using one of the select method we can select values
		sDob.selectByValue("25");
		Thread.sleep(500);
		
		
		//For month
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select sMonth = new Select(month);
		sMonth.selectByIndex(5);
		Thread.sleep(500);
		
		//For Year
		
		WebElement year = driver.findElement(By.id("year"));
		Select sYear = new Select(year);
		sYear.selectByVisibleText("2000");
		}
}
