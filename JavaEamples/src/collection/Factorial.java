package collection;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		
		int fact=1;
		if ( n==0 || n==1) {
				
		}
		else {
		for (int i=n;i>=1;i--)
		{
		fact=fact*i;
		}
		}
      System.out.println("facyorial of given number :"+n +"is "+fact);
	}

}
