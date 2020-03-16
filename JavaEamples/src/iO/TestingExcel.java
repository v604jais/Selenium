package iO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class TestingExcel {

	    private static File file;

		public TestingExcel(String path){
		    file = new File(path);

		     if (!file.exists()) {
		         System.out.println("File does not exist.");
		                file=null;
		        }
		}

		public String getText(String sheetName, int row, int col) throws Exception
		{
		    InputStream ExcelFileToRead = new FileInputStream(file);
		    String Value;
		    XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead);
		    XSSFSheet sheet=wb.getSheet(sheetName);

		    if(row>=0 && col>=0){
		        try{
		            Value = sheet.getRow(row).getCell(col).getStringCellValue();
		            ExcelFileToRead.close();
		            wb.close();
		        }catch(Exception e){
		            System.out.println("Row or Cell not created.");
		            ExcelFileToRead.close();
		            wb.close();
		            return null;
		        }

		        return Value;

		    }else{
		        System.out.println("Plz Enter a positive Row and Column");

		    }
		    ExcelFileToRead.close();
		    wb.close();
		    return null;

		}

		public void setText(String sheetName, int rowNum, int col, String value) throws IOException, InvalidFormatException {

		    FileInputStream fio = new FileInputStream(file);
		    XSSFWorkbook wb = new XSSFWorkbook(fio);
		    XSSFSheet sheet = wb.getSheet(sheetName);
		    XSSFRow row;

		    if(rowNum>=0 && col>=0){
		        try{
		            row = sheet.getRow(rowNum);
		            XSSFCell cell = row.createCell(col);
		            cell.setCellValue(value);
		        }catch(Exception e){
		            System.out.println("Row Creation Required..");
		            row = sheet.createRow(rowNum);
		            XSSFCell cell = row.createCell(col);
		            cell.setCellValue(value);
		        }

		    }else{
		        System.out.println("Plz Enter a positive Row and Column");
		    }

		    fio.close();

		    FileOutputStream  fileOut = new FileOutputStream(file);

		    //write this workbook to an Outputstream.
		    wb.write(fileOut);
		    wb.close();
		    fileOut.flush();
		    fileOut.close();
		}

		
	

}
