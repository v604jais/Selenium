package iO;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class Reading {

	public static void main(String[] args) throws Exception {
		
		String path="C:\\Users\\vishal jaiswal\\Desktop\\selenium\\JavaEamples\\TestData\\TestExcel.xlsx";
		 
		TestingExcel t=new TestingExcel(path);
		try {
		
		     System.out.println(t.getText("Sheet1", 2, 0));   
		
			//t.setText("Sheet1", 2, 0,"Sania");
			
		} catch (InvalidFormatException | IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
