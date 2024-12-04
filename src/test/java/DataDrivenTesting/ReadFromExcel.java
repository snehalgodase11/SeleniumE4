package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcel {

	public static boolean main(String[] args) throws EncryptedDocumentException, IOException  {
	
		
			 
	
		      
    	  FileInputStream fis = new FileInputStream(".\\src\\main\\resources\\DWSlogin.xlsx");
    		Workbook wb = WorkbookFactory.create(fis);
    	      org.apache.poi.ss.usermodel.Sheet sheet =  wb.getSheet("Sheet2");
    	//    
    	      int row = sheet.getPhysicalNumberOfRows();
    	      int  cell=sheet.getRow(0).getPhysicalNumberOfCells(); 
    	  		
    	  		
    	  	
    
      
      
      
      
      
      
//      System.out.println(email1);
//      System.out.println(pass1);
//      System.out.println(email2);
//      System.out.println(pass2);
//      
	
		for(int i=0;i<row;i++)
	      {
	    	  for(int j=0;j<cell;j++)
	    	  {
	    		Integer data = Integer.valueOf(sheet.getRow(i).getCell(j).toString());
	    		System.out.println(data);
	    		boolean flag=false;
	    		if(data.equals(2))
	    		{
	    			return false;
	    		}
	    	    
	    	 else if(data %i ==0 && data %j==0)
	    	 {
	    		 flag=true;
	    		 System.out.println(+i+"is prime");
	    		 break;
	    	 }
	    		return flag;
	    		
	    		
	    	  }
	    		  
		
	}
		return false;

	}


	

//utStream("C:\\Users\\User\\Desktop\\seleniumExcel\\DWSlogin.xlsx");
//Workbook wb = WorkbookFactory.create(fis);
//  org.apache.poi.ss.usermodel.Sheet sheet =  wb.getSheet("Sheet1");
//  String email1 = sheet.getRow(0).getCell(0).toString();
//  String pass1=sheet.getRow(0).getCell(1).toString();
//  String email2 = sheet.getRow(1).getCell(0).toString();
//  String pass2=sheet.getRow(1).getCell(1).toString();
  
  
  
  
  
  
  
//  System.out.println(email1);
//  System.out.println(pass1);
//  System.out.println(email2);
//  System.out.println(pass2);
//  
}



