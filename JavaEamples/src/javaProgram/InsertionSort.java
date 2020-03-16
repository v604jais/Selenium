package javaProgram;

public class InsertionSort {

	public static void main(String[] args) {
		
		int a[]= {2,1,4,3,5};
		
		System.out.println("Before sorting");
		
		for (int k:a)
		{
			System.out.println(k);
		}
		System.out.println();
		insertion(a);
		System.out.println("After sorting");
		for (int k:a)
		{
			System.out.println(k);
		}
	}
    public static void insertion(int a[])
    {
    
     
	 int size =a.length;
     for (int i=1;i<size;i++ )
     { 
         int j=i-1;
         int temp=a[i];
    	 while((j>-1) && (a[j]>temp) )
    	 {
    		// swap
    		 a[j+1]=a[j];
    		 j--;
    	 }
    	 a[j+1]=temp;
     }

    }
	
}
