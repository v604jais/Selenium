<<<<<<< HEAD
package iO;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;


public class Readingfromexcel {

	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		path=path+"\\TestData\\TestExcel.xlsx";
		
		try {
			
			FileInputStream fi=new FileInputStream(path);  
			
			XSSFWorkbook wb = new XSSFWorkbook(fi);
			XSSFSheet sheet = wb.getSheetAt(0);
			int rowCount = sheet.getLastRowNum();
            
			for (int i=1;i<=rowCount;i++) {
				Row row=sheet.getRow(i);
				short cellCount=row.getLastCellNum();
			for (int j=0;j<cellCount;j++)
			{
				String stvalue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println("Sheet value :" + stvalue);
			}
		

			
			}
			wb.close();
			
			
	    } catch (Exception e) {
		
		e.printStackTrace();
	   }
		
		// write 
try {
			FileInputStream fi=new FileInputStream(path);
			FileOutputStream fo=new FileOutputStream(path);  
			
			XSSFWorkbook wb = new XSSFWorkbook(fi);
			XSSFSheet sheet = wb.getSheetAt(0);
			Row row=sheet.getRow(3);
			Cell cell=row.getCell(0);
			short cellCount=2;
			for (int i=3;i<=4;i++) {
			
			for (int j=0;j<cellCount;j++)
			{
			 
				cell.setCellType(CellType.STRING);
				cell.setCellValue("Vishal");
				wb.write(fo);
			}
		

			
			}
			wb.close();
			
			
	    } catch (Exception e) {
		
		e.printStackTrace();
	   }
			
	}

}			

			
        

=======
package iO;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;


public class Readingfromexcel {

	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		System.out.println(path);
		path=path+"\\TestData\\TestExcel.xlsx";
		
		try {
			
			FileInputStream fi=new FileInputStream(path);  
			
			XSSFWorkbook wb = new XSSFWorkbook(fi);
			XSSFSheet sheet = wb.getSheet("Sheet1");
			int rowCount = sheet.getLastRowNum();
            
			for (int i=1;i<=rowCount;i++) {
				Row row=sheet.getRow(i);
				short cellCount=row.getLastCellNum();
			for (int j=0;j<cellCount;j++)
			{
				String stvalue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println("Sheet value :" + stvalue);
			}
		

			
			}
			fi.close();
			wb.close();
			
			
	    } catch (Exception e) {
		
		e.printStackTrace();
	   }
		
		// write 
try {
			//FileInputStream fi=new FileInputStream(path);
			
			
			XSSFWorkbook wb = new XSSFWorkbook();
			XSSFSheet sheet = wb.getSheet("Sheet2");
			FileOutputStream fo=new FileOutputStream(path);  
			Row row=sheet.getRow(3);
			Cell cell=row.getCell(0);
			short cellCount=2;
			for (int i=3;i<=4;i++) {
			
			for (int j=0;j<cellCount;j++)
			{
			 
				cell.setCellType(CellType.STRING);
				cell.setCellValue("Bipul");
				wb.write(fo);
			}
		

			
			}
			fo.close();
			wb.close();
			
			
	    } catch (Exception e) {
		
		e.printStackTrace();
	   }
			
	}

}			

			
        

>>>>>>> 008c92ce40e631bf9bc2990aa9afdf9eda581d6b
