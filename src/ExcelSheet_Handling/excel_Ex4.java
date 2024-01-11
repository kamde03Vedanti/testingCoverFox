package ExcelSheet_Handling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_Ex4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myFile = new FileInputStream("D:\\Automation\\MyecxelSheet\\Myexcel1.xlsx");
		Workbook myWorkbook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWorkbook.getSheet("Sheet2");
		
	    int lastRowNo = mySheet.getLastRowNum();
	    int totalNumOfRow = lastRowNo;
	    System.out.println(totalNumOfRow);
		System.out.println("-----------------------------");
		
		short lastCellNo = mySheet.getRow(0).getLastCellNum();
		short totalNumOfCell = lastCellNo;
		System.out.println(totalNumOfCell);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
