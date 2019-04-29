package collection;
import java.util.*;

public class MinMaxSum {

	public static void main(String[] args) {
		
		
		int a[]= {9,4,3,5};
		
		Arrays.sort(a);
		for (int j=0; j<a.length;j++) {
		System.out.println(a[j]);
		
		}
		
		int i;
		int  min=a[0];
		int  max=a[0];
		for (i=0;i<a.length;i++)
		{
			
			if(a[i]<min)
			{
				min=a[i];
				
			}
			if(a[i]>max) {
				
			  max=a[i];
			}

		}
		System.out.println("min no is "+min);
		System.out.println("max no is " +max);
		System.out.println("Sum of max and min is "+(min +max));
	}

}
