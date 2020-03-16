package iO;


import java.io.*;

//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Bi {

	
	public static void main(String[] args)  {
		//XSSFWorkbook wb = new XSSFWorkbook();
		String path = System.getProperty("user.dir");
		 path= path+"\\TestData\\Test.txt";
		  //to read the input stream
	     
	     System.out.println(path);
	    
	     try {
	    	 FileInputStream fi=new FileInputStream(path);
		     BufferedInputStream bi=new BufferedInputStream(fi);
		      System.out.println(bi.available());
		     int i=0;    
		        while((i=bi.read())!=-1){    
		        System.out.print((char)i);  }
		        fi.close();
		        
			    
			       
			 
		     
		    } catch (IOException e) {                                                                                                                     
			
			e.printStackTrace();
		   }
	    
	    finally {System.out.println(" ");
	             System.out.println("inside finally");
	    }
		
	}

}
