package iO;
import java.io.*;

public class FileOutputWriteEample {

	public static void main(String[] args) {
		
	 String path= System.getProperty("user.dir");
		String	path1=path+"\\TestData\\Test.txt";
			FileOutputStream f;
			try {
				f = new FileOutputStream(path1);

				String b="Hi This is Vishal";
				byte c[]=b.getBytes();
				f.write(c);
		        f.close();
		        
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
	        
	}

}
