package iO;

import java.io.*;


public class CreatingNewFile {

	public static void main(String[] args) throws IOException{
		
		
		//getting path of user
         String path =System.getProperty("user.dir");
         path=path+"\\TestData";
         File f=new File(path);
	     System.out.println(f.getParent());  
	     //object of file class
	     
	     //to check the absolute
	     if (f.exists()) {
	    	 System.out.println("is absolute");  
	     }
	     else 
	     {
	    	 System.out.println("is not absolute");  
	     }
	     
	     
	     
	     
		 try {  
	            File file = new File("\\Users\\vishal jaiswal\\Desktop\\selenium\\JavaEamples\\TestData");  
	            if (file.mkdirs())
	            {
	            	
	                System.out.println("New Folder is created!");  
	            } 
	            else 
	            {  
	                System.out.println("Folder already exists."); 
	                //create file if folder exist
	               file= new File ("\\Users\\vishal jaiswal\\Desktop\\selenium\\JavaEamples\\TestData\\Test.txt");
	               
	               if (file.createNewFile())
	               {
	            	   System.out.println("New File is created!");  
	               }
	               else
	               {
	            	   System.out.println("File already exists."); 
	               }
	            }  
	            
	        } 
		 catch (Exception e) 
		 {  
	            e.printStackTrace();  
	     }  
		  
	}

	

}
