package misc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class CommonlyUsedMethod {


	//taking screenShot method
	public static void takeScreenshot(WebDriver driver, String fileName) throws IOException
	{
	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File dest = new File("D:\\MyScreenshot"+fileName+".png");
	 FileHandler.copy(src, dest);
	}
		
	public static String readExcelData(String sheet, int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile = new FileInputStream("D:\\Automation\\MyecxelSheet\\Myexcel1.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("CoverFoxData");
		String StringValue = mySheet.getRow(row).getCell(cell).getStringCellValue();
		return StringValue;
		
	}
		
		
		
		
		
		
		
		

	}

