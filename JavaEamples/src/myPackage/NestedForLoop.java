package myPackage;
import java.util.*;
public class NestedForLoop {

	public static void main(String[] args) {
		
		System.out.println("enter the number till which you need table");
		Scanner rd=new Scanner(System.in);
		int j=rd.nextInt();
		rd.close();
		for (int num=1;num<=j;num++) 
		{
			System.out.println("the table of :"+num);
			for (int i=1;i<=10;i++)
			{
				
				System.out.println(num +"*"+ i + "="+num*i);
				
			}
			//System.lineSeparator();
			System.out.println("\r");
		}
		
	}

}
