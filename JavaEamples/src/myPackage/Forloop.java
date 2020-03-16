package myPackage;
import java.util.*;
public class Forloop {

	public static void main(String[] args) {
		 
	    Scanner read =new Scanner(System.in);
		 String s,temp="";
		 System.out.println("Enter your string to ceck for Palindrome");
		 s=read.nextLine();
		 read.close();
		 int len= s.length();
		 System.out.println(s);
		 System.out.println(len);
        for (int i=len-1;i>=0;i--)
        {
        	temp=temp + s.charAt(i);
        }
        
        if (s.equalsIgnoreCase(temp)) 
        {
        	System.out.println("it is Palindrome");
        }
        else 
        {
            System.out.println("it is Not a Palindrome");
        }
	}

	

}
