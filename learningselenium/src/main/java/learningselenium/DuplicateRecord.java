package learningselenium;

import java.io.*;

public class DuplicateRecord {

	public static void main(String[] args) throws Exception {

		PrintWriter pw = new PrintWriter("C:\\Users\\vishal jaiswal\\Desktop\\selenium\\learningselenium\\Files\\output.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\vishal jaiswal\\Desktop\\selenium\\learningselenium\\Files\\input.txt"));
		
		String sl = br1.readLine();
		
		while (sl != null) 
		{
			boolean available = false;
			BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\vishal jaiswal\\Desktop\\selenium\\learningselenium\\Files\\output.txt"));
			String tl = br2.readLine();
			while (tl != null) 
			{ 
				if (sl.equals(tl)) {
					available = true;
					break;}
				tl = br2.readLine();
		    }
				if (available==false) {
					
					pw.println(sl);
					pw.flush();
	        }
		   sl = br1.readLine();
        
            
			br2.close();
	   }
		
		pw.close();
		br1.close();
		System.out.println("Operation completed");
	   
 }
}