package ExcelSheet_Handling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_Ex3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myFile = new FileInputStream("D:\\Automation\\MyecxelSheet\\Myexcel1.xlsx");
		Workbook myWorkbook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWorkbook.getSheet("Sheet2");
		
	    int lastRow = mySheet.getLastRowNum();
	    System.out.println(lastRow);
	    
	    System.out.println("---------------------");
	     
	    short lastCell = mySheet.getRow(0).getLastCellNum();
	    System.out.println(lastCell);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
