/**
 * 
 */
package javaBasics;



public class PractiseString {

	
	public static void main(String[] args) {
		
		
		int a[]= {1,0,2,4,0,5,9,0};
		
		int n=a.length;
		pushZeroEnd(a,n);
		for (int i=0; i<n; i++) 
            System.out.print(a[i]+" "); 
		
		
		
		
	
	}
	public static void pushZeroEnd(int arr[], int Size) {

		int count=0;
		for (int i=0;i<Size;i++)
		{
			if (arr[i]!=0)
				arr[count++]=arr[i];
		}
	    while (count<Size)
	    {
	    	arr[count++]=0;
	    }
	}
}