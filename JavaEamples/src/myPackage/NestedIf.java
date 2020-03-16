package myPackage;

public class NestedIf {

	public static void main(String[] args) 
	{
		// find the greatest of the three number 
		int a=3,b=4,c=7;
		if ( a> b && a>c)
		{
			System.out.println("greatest is a and value of a is:"+a);
		}
		else if (b>c)
			{
			System.out.println("greatest is b and value of b is:"+b);
			}
		else 
		{
			System.out.println("greatest is c and value of c is:"+c);
		}
		}
	}


