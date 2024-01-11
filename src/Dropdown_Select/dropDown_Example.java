package Dropdown_Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown_Example {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(700);
		
		WebElement dropDown_Field = driver.findElement(By.id("dropdown-class-example"));
		
		Select s = new Select(dropDown_Field);
		s.selectByValue("option3");;
	}

}
