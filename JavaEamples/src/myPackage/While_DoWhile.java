package myPackage;
import java.util.Scanner;
public class While_DoWhile {

	public static void main(String[] args) {
		
		int a=1; int num;
		 Scanner reader = new Scanner(System.in);
		 
		 System.out.println("enter the num value");
		 num =reader.nextInt();
		 reader.close();
		 System.out.println("TABLE OF " +num);
		do 
		{
		 System.out.println(num+"*"+a+"="+num*a);
	     a=a+1;
		}while (a<=10);
		
}
	}


/*while (a>=1)
{
   System.out.println(a);
   System.out.println("inside while");
   a=a-1;
   
}

*/