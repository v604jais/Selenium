package javaProgram;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner read=new Scanner(System.in);
		
		System.out.println("Enter No To Check");
		System.out.println();
	
		int a=read.nextInt();
		read.close();
        System.out.println("Number Given to check Palindrome is "+a);
        reverse(a);
	}
	
	static void reverse(int b)
	{
		int temp=b,d=0;
		while (b!=0)
	    {
			    int c= b%10;
			    d=d*10+c;
			    b=b/10;
		}
		
		if (temp==d)
		{
		System.out.println(temp+" is a palindrome");
		}
		else 
		{
		System.out.println(temp+ " is not a palindrome");
		}
	   
	}

}
