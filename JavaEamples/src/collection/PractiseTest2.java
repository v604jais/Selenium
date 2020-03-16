package collection;



public class PractiseTest2 {

	public static void main(String[] args) {
		
		
		String test="RARM";
		String temp="";
		int size=test.length();
		
		for (int i=size-1;i>=0;i--)
		{
			
		     temp=temp+test.charAt(i);
		}
	
		if (temp.equals(test))
		{
			System.out.println("is a palindrome");
		}
		else 
		{
			System.out.println("is not a palindrome");
		}
		
	}

	
	
}
