package ExcelSheet_Handling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_Ex {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream myFile = new FileInputStream("D:\\Automation\\MyecxelSheet\\Myexcel1.xlsx");
		
//	   String myWorkbook = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//	 System.out.println("Value from excel sheet is " +myWorkbook);
	Workbook myWorkbook = WorkbookFactory.create(myFile);
    Sheet mySheet = myWorkbook.getSheet("Sheet1");
	
    Row myRow = mySheet.getRow(0);
	  
    Cell myCell = myRow.getCell(0);
	 String value = myCell.getStringCellValue();
	System.out.println(value);
	  
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
