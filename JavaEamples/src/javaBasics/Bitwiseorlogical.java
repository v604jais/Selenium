package javaBasics;

public class Bitwiseorlogical {

	public static void main(String[] args) {
		
		int a=10;
		int b=1;
		int c=2;
		
		System.out.println(a>b||b>c);
		System.out.println(a>b|b>c);
		System.out.println(a<b||b>c);
		System.out.println(a<b|b>c);
		
		System.out.println(a>b||a++>c);//true || true = true  
		System.out.println(a);//10 because second condition is not checked  
		System.out.println(a>b|a++<c);//true | true = true  
		System.out.println(a);//11 because second condition is checked  

	}

}
