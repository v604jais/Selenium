package iO;
import java.io.*;

public class Bufferoutsclass {

	public static void main(String[] args) throws IOException{
     
		//to read the file path 
		
	 String path = System.getProperty("user.dir");
	 path= path+"\\TestData\\Test.txt";
     FileOutputStream fout=new FileOutputStream(path);
     BufferedOutputStream bout=new BufferedOutputStream(fout);
     String s="I'm new to the BufferedOutputStream class and flush concept"
     		+ '\n'+" "+'\n'+"new line";
     
     byte b[]=s.getBytes();
     bout.write(b);
     bout.flush();
     bout.close();
     fout.close();
     System.out.println("Successfully written");
   
	}

}
