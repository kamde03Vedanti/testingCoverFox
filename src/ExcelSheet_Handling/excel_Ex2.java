package ExcelSheet_Handling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_Ex2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile = new FileInputStream("D:\\Automation\\MyecxelSheet\\Myexcel1.xlsx");
        Workbook myWoorkbook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWoorkbook.getSheet("Sheet1");
		//to read whole excelSheet
		
		//outer for loop --> row= 0 and 1
		for(int i=0;i<=1;i++)
		{
			//inner for loop--> cell= 0,1,2
			for(int j=0;j<=2;j++)
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
