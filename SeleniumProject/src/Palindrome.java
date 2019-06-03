class calculation{
	
	
	int fact=1;
	
	void fact (int n ) {
		for (int i=1; i<=n;i++)
		fact=fact*i;
		System.out.println("factorialof "+ n +" is " +fact);
	}
}



public class Palindrome {

	public static void main(String[] args) {
		
		String orignal="RAR";
         
		String temp="";
		
		for (int i=orignal.length()-1;i>=0;i--)
		{
			temp=temp+orignal.charAt(i);
		}
		if (temp.equals(orignal))
		{
			System.out.println("is palindrome");
			//System.out.println(" classloader is "+ Palindrome.class.getClassLoader());
		}
		else 
		{
			System.out.println("is not palindrome");
		}
       // anonymous object
		new calculation().fact(5);
	}

}
