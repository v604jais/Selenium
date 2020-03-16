package control;
import java.util.*;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		float ar[]=new float [] {1.0f,2.0f,4.0f};
		float s=ar.length;
		System.out.println("size of array"+s);
		float sm=0.0f;
		for (float i:ar)
		{
		
	       
			sm=sm+i;
			
		}
		
		System.out.println(sm);
		
		//sum of natural number
		Scanner read=new Scanner (System.in);
		
		
		System.out.println("enter the nth term till which you need the sum of number:");
		float n =read.nextInt();
		System.out.println("entered number is:  "+n);
		read.close();
		float sum;
		float a=((n+1)/2);
		sum=a*n;
		System.out.println(sum);//9=45
	    float diff= sum-sm;
	    System.out.println(diff);
		
	}

	
	

}
