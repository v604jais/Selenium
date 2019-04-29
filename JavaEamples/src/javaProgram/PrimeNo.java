package javaProgram;
import java.util.*;
public class PrimeNo {

	public static void main(String[] args) 
	{
		
		
	    Scanner reader=new Scanner(System.in);
		
		System.out.println("enter number to check prime");
		
		// reading value from user
		int num=reader.nextInt();
		System.out.println("the number to check is "+num);
		System.out.println();
	    primeno(num);
	    reader.close();
	}

	
	static void primeno(int num)
	{
		
	  if  (num==0 || num==1)
			
		{
			 System.out.println(num+" is not prime number");
			
	    }
			
	  else {
	   
		  int m=num/2; 
		  for (int i=2;i<m;i++)
		  {
			  if (num%i==0)
			  {
				  System.out.println(num+" is not a prime number");
				  break;
			  }
			  
		  }
		  System.out.println(num+" is a prime number");
	}   
	   
	}
	
}
