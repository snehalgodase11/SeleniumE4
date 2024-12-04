package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDatausingFORLoop {
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream(".\\src\\main\\resources\\DWSlogin.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	      org.apache.poi.ss.usermodel.Sheet sheet =  wb.getSheet("Sheet2");
//	     
int row = sheet.getPhysicalNumberOfRows();
int  cell=sheet.getRow(0).getPhysicalNumberOfCells();
for(int i=0;i<row;i++)
{
	for(int j=1;j<cell;j++)
	{
		String data = sheet.getRow(i).getCell(j).toString();
		System.out.println(data);
	}
}
	      
	
	   
	      
	}      

}
