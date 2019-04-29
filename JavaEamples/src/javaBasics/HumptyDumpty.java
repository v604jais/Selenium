package javaBasics;

public class HumptyDumpty {

	public static void main(String[] args) {
		
		
		String a="HUMPTY DUMPTY";
		
		String b="";
		
		for (int i=0; i<a.length();i++)
		{
		    if (a.charAt(i)=='U')
		    {
		    	continue;	 
		    	
		    }
		    else {
		    	 b=b+a.charAt(i);
		    }
		    	
		}
		System.out.println(b);
	}

}
