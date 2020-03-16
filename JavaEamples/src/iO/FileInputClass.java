package iO;
import java.io.*;
public class FileInputClass {

	public static void main(String[] args) {
		
	String path=System.getProperty("user.dir");
	String path2=path+"//TestData//Test.txt";
	
	try{ 
		 
		FileInputStream fin=new FileInputStream(path2);    
        int i=0;    
        while((i=fin.read())!=-1){    
        System.out.print((char)i);  }
        fin.close();
	    }
	       
        catch(Exception e){System.out.println(e);}    
	
	 
      }    
	}



