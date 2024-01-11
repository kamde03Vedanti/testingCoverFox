package ActionsClass_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraganDrop_Ex {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Static.html");
		Thread.sleep(5000);
		
		WebElement source = driver.findElement(By.id("node"));
		WebElement target = driver.findElement(By.id("droparea"));
		
		Actions act =new Actions(driver);
//act.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
	act.dragAndDrop(source, target).perform();
		
		//act.click(source).release(target).build().perform();
		
		

	}

}
