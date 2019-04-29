package javaProgram;

public class Practise2 {

	public static void main(String[] args) {
		
		String str1="boccbob";
		
	     System.out.println( bobThere(str1));  

	}

	public static boolean bobThere(String str)
	{
		int size=str.length();
		for (int i=0;i<size;i++)
		{
			
			if (str.charAt(i)=='b')
			{
				
				if(str.charAt(i+2)=='b')
				{
					return true;
					
				}
				
				
			}
		}
		
		return false;
		
	}
}
