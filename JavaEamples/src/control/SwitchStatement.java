package control;
import java.util.*;
public class SwitchStatement {

	public static void main(String[] args) {
 
		// scanner class to read the 
		Scanner read =new Scanner(System.in);
		System.out.println("Hey use me I'm your mathematecian. How may i help you?");
		System.out.println("Input your 1st number");
		int a=read.nextInt();
		System.out.println("Input your operator");
		char operator = read.next().charAt(0);
		System.out.println("you entered operator:"+operator);
		System.out.println("Input your 2nd number");
		int b=read.nextInt();
		read.close();
		
		switch (operator) 
		{
		case '+':
		int sum=a+b;
		System.out.println(sum);
	    break;
		
		case '-':
			int sub=a-b;
			System.out.println(sub);
		    break;
			
		case '/':
			int div=a/b;
			System.out.println(div);
		    break;
			
		case '%':
			int mod=a%b;
			System.out.println(mod);
		    break;
			
		case '*':
			int mul=a*b;
			System.out.println(mul);
		    break;
		case 'P':
			int per=((a*b)/100);
			System.out.println(per);
		    break;
		default :
			System.out.println("Invalid Input");
		}
		
		

	}

}
