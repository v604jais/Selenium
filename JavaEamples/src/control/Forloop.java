package control;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		
		int i, j, k;
		for(i=5;i>=1;i--)
		{
		for(j=5;j>i;j--)
		{
		System.out.print(" ");
		}
		for(k=1;k<=i;k++)
		{
		System.out.print("*");
		}
		System.out.println();
		}
		
		// for loop for the factorial 
		System.out.println("enter no for which you need factorial");
		Scanner read= new Scanner(System.in);
		int n=read.nextInt();
		read.close();
		Forloop f = new Forloop ();
		int z=f.factorial(n);
		System.out.println(z);
		
	}
	
	public int factorial (int number)
	{   
		
		if (number==0)
	    {
		return 1;
		}
	    else  
	    { 
		int fact=(number*factorial (number-1));
		return fact;
		}	
		
	
	}

}

