package javaProgram;

import java.util.Scanner;

public class BubbleSorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//read the size of array from user 
	    System.out.println("enter the size of array you want");
	    int n=sc.nextInt();
		int i=0;
		int a[]=new int[n];
		System.out.println("enter " + n +" elements of array");
		while(i<n)
		{
		a[i]= sc.nextInt();
		i++;
		}
		sc.close();
		
		
		System.out.println(a.length+" Size of Array");
		
	    // before sorting 
		System.out.println("Before Sorting Arrays elements and there respective position");
		for (int k=0;k<a.length;k++) 
		{
			
		System.out.println(a[k] +" array @ position "+ k);
		}
		//bsort
		bsort(a);
		
		// After sorting 
				System.out.println("Before Sorting Arrays elements and there respective position");
				for (int k=0;k<a.length;k++) 
				{
					
				System.out.println(a[k] +" array @ position "+ k);
				
                }
				
		}
	  
	//sort method
	   static void bsort(int a[]) 
	{
		int temp=0;
		int size=a.length;
		System.out.println();
		System.out.println(size+" size of an array and in the sort loop");
		for (int m=0;m<size;m++)
		{
			for(int j=1;j<(size-m);j++)
			{
				if (a[j-1]>a[j])
				{
				//swap element	
				temp=a[j-1];
				a[j-1]=a[j];
				a[j]=temp;
				
				}
			}
		}
	}
}
