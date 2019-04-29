package iO;
import java.io.*;

public class CreatingPropfile {

	public static void main(String[] args) {
		
		String path=System.getProperty("user.dir")+"/TestData/Property.properties";
		
		File file = new File(path);
		try {
			if (file.exists())
			{
				System.out.println("Already Exist");
				FileOutputStream fout= new FileOutputStream(file);
				String []s= {"Name =Vishal","URL =www.google.com"};
				int Size=s.length;
				for (int i=0;i<Size;i++)
				{
				byte b[]=s[i].getBytes();
				fout.write(b);
				fout.write('\n');
				}
				fout.close();
			}
			
			else {
				   System.out.println("Creating New One");
				   file.createNewFile();
				   FileOutputStream fout= new FileOutputStream(file);
				   String []s= {"Name =Vishal","URL =www.google.com"};
				   int Size=s.length;
				   for (int i=0;i<Size;i++)
				  {
				   byte b[]=s[i].getBytes();
				   fout.write(b);
				   fout.write('\n');
				  }
				  fout.close();
			     }
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
