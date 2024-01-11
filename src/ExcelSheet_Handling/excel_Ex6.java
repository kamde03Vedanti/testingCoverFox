package ExcelSheet_Handling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_Ex6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile = new FileInputStream("D:\\Automation\\MyecxelSheet\\Myexcel1.xlsx");
        Workbook myWoorkbook = WorkbookFactory.create(myFile);
        
       Sheet mySheet = myWoorkbook.getSheet("Sheet4");
       int lastRowNum = mySheet.getLastRowNum();
       int totalRowNum = lastRowNum;
       
       short lastCellNum = mySheet.getRow(0).getLastCellNum();
       int totalCellNum = lastCellNum-1;
       
       for(int i=0;i<totalRowNum;i++) 
       {
    	  for(int j=0;j<=totalCellNum;j++) 
    	  {
    		 CellType typeOfData = mySheet.getRow(i).getCell(j).getCellType();
    		 //System.out.println(typeOfData);
    		 
    		 if(typeOfData==CellType.STRING) 
    		 {
    			String value = mySheet.getRow(i).getCell(j).getStringCellValue();
    			System.out.print(value+" ");
    		 }
    		 else if(typeOfData==CellType.BOOLEAN)
    		 {
    			 boolean value = mySheet.getRow(i).getCell(j).getBooleanCellValue();
    			 System.out.print(value+" ");
    		 }
    		 else if(typeOfData==CellType.NUMERIC)
    		 {
    			double value = mySheet.getRow(i).getCell(j).getNumericCellValue();
    			System.out.print(value+" ");
    		 }
    	 }
    	  		System.out.println();
    	
       }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
