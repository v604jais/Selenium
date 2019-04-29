package myPackage;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		
		
		System.out.println("enter the value of row and col i.e. size of array");
 
		Scanner read=new Scanner (System.in);
		int rowNum=read.nextInt();
		int colNum=read.nextInt();
		System.out.println("rowNum :"+rowNum);
		System.out.println("colNum :"+colNum);
	    read.close();
	    
	    int s[][] = new int [rowNum] [colNum] ;
	    //1st row 
	    s[0][0]=0;
	    s[0][1]=1;
	    s[0][2]=2;
	   
	    //2nd row
	    s[1][0]=10;
	    s[1][1]=11;
	    s[1][2]=12;
	   
	    //3rd row
	    s[2][0]=20;
	    s[2][1]=21;
	    s[2][2]=22;
	    
	    for(int i =0; i<rowNum; i++ )
	    {
	    	for(int j=0; j<colNum; j++) 
	    	{
	         System.out.println("s"+"["+i+"]"+"["+j+"]" +s[i][j]);
	    	} 
	    }
	    }
	}


