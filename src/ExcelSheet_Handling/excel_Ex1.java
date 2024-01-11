package ExcelSheet_Handling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_Ex1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	//how to read whole row
	FileInputStream myFile = new FileInputStream("D:\\Automation\\MyecxelSheet\\Myexcel1.xlsx");
	Workbook myWorkbook = WorkbookFactory.create(myFile)	;
	Sheet mySheet = myWorkbook.getSheet("Sheet1");	
	
	for(int i=0;i<=2;i++)
	{
		String value = mySheet.getRow(0).getCell(i).getStringCellValue();
		System.out.println("My excel value is " +value);
	}
		
		
		
		
		
		
		
		
		
		

	}

}
