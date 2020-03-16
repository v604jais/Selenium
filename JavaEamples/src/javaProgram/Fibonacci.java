package javaProgram;

import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner read=new Scanner(System.in);
		int a=0, b=1;
		System.out.println("Enter the number till you need fibonaci");
		int n=read.nextInt();
		read.close();
		if (n==0) 
		{
			System.out.println("0");
		}
		for (int i=1;i<=n;i++)
		{
		System.out.print(a);
		System.out.print(" ");
		int c=a+b;
		a=b;
		b=c;
		}
		
		
	}

}
