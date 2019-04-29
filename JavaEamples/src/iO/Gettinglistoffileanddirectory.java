package iO;
import java.io.*;  
public class Gettinglistoffileanddirectory {

	public static void main(String[] args) {
	
            File f=new File("/Users/vishal jaiswal/Documents"); 
          //File f=new File("\\Users\\vishal jaiswal\\Documents"); 

          //list() returns array of string naminf number of files and folder present in abstract path
          //  declaring array to store the files and directory stores in the directory
		    String filenames[]=f.list(); 
		    
		    for(String filename:filenames)
		    {  
		        System.out.println(filename);  
		    }  
		    
		    File file[]=f.listFiles();
		    for(File filename:file)
		    {  
		    	System.out.println("***************");  
		        System.out.println(filename);  
		    } 

	}

}
