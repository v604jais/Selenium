/**
 * 
 */
package javaBasics;


public class PractiseString {

	
	public static void main(String[] args) {
		
	    String s="DAMPUTUY";
	    int size=s.length();
	    int Position[] =new int[size];
	    char[] b=s.toCharArray();
	    System.out.println(b);
	    int count=0,k=0;
	    for (int i=0; i<b.length;i++)
	    {
	    	
	    	if (b[i]=='U')
	    	{
	    		System.out.println(i);
	    		Position[k++]= i;
	    		
	    		count++;
	    	}
	    	
	    }
	    System.out.println( "count value is "+count); 
	    for (int f:Position) {
	    	System.out.println( "Array values are"+f); 
	    }
	    for(int i=0;i<count;i++)
	    {
	    	s.substring(0, 4) + s.substring(6);
	    }
	   System.out.println(s); 
}
}