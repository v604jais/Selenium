package javaBasics;

public class UnaryOperator {

	public static void main(String[] args) {
		//unary operator
		int a=10; int d=10;
		int b=10; int e=-10;
		int c=10;
		System.out.println(a++);//10
		System.out.println(++a);//12
		System.out.println(a--);//12
		System.out.println(--a);//10
	
		System.out.println(b++ + ++b);
		System.out.println(++b + b++);
		System.out.println(c-- + --c);
		System.out.println(--c + c--);
		//! and ~
		
		System.out.println(~d);
		System.out.println(~e);
		boolean f=true; boolean g=false;
		System.out.println(!f);
		System.out.println(!g);
	}

}
