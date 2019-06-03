package javaBasics;

public class Practise {

	public static void main(String[] args) {
		
		
		
		int a[]= {0,2,1,3,4,5,7,0};
		int l= a.length;
	    
		pushzero(a, l);
		 for (int i=0; i<l; i++) 
	            System.out.print(a[i]+" "); 
	     
	}
	
	
	static void pushzero(int[] arr, int len) {
		
		int current=0;
		 for (int i=0; i<len;i++) 
		    {
		    	
		    	
		    	if(arr[i]!=0)
		    	 {
		    		 arr[current++]=arr[i];
		    		 
		    		 
		    		 
		    	 }
		    	
			}
		    
		    while(current<len); 
		    {
		    	arr[current++]=0;
		    	
		    	
		    }
		
	}
}
	


