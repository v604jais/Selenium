package javaProgram;

import java.util.Arrays;

public class Practise3 {

	public static void main(String[] args) {
		
		
		int[] data = new int[200];
		Arrays.fill(data,new Integer(0));
		
		
		String Word="rammaar";
		int length=Word.length();
		
		for (int i=0;i<length;i++ )
	   
		{
			 data[Word.charAt(i)]++;
			
			 
		    
		}
		
		for (int j=65;j<=90;j++)
		{
			if(data[j]>0)
			{
				System.out.println( " count "+data[j] );
			}
		}
				
				
				
				
		
	}
}
