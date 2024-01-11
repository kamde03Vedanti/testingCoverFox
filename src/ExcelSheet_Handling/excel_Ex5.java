package ExcelSheet_Handling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_Ex5 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream myFile = new FileInputStream("D:\\Automation\\MyecxelSheet\\Myexcel1.xlsx");
		Workbook myWorkbook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWorkbook.getSheet("Sheet3");
		
	    int lastRowNo = mySheet.getLastRowNum();
	    int totalNumOfRows = lastRowNo;
	    
	    short lastCellNo = mySheet.getRow(0).getLastCellNum();
	    int totalNumOfCell = lastCellNo-1;
	    
	    //outer for loop --> rows
	    
	    for(int i=0;i<=totalNumOfRows;i++)
	    {
	    	//inner for loop --> cells
	    	for(int j=0;j<=totalNumOfCell;j++)
	    	{
	    		String value = mySheet.getRow(i).getCell(j).getStringCellValue();
	    		System.out.print(value+" ");
	    	}
	    	System.out.println();
	    }
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
