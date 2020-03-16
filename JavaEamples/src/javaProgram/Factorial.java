package javaProgram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Factorial i= new Factorial();
	    int n=reader();
	    
	    System.out.println("Your factorial of the number is "+i.factorial(n));
	 
	}

	  public static int reader()
	   {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter your number");
        int number=read.nextInt();
        System.out.println("The number provided is "+number);
        read.close();
        return number;
	   }
	 public  double factorial (int  number )
	  {
		   
		   if (number==0)
		   return 1;
		   else {
		   double fact=(number*factorial(number-1));
		   return fact;
		   }
	  }
}
/**
 * date :3rd march 19
 * @vishal	
 */