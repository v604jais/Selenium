package javaOops;

class A {
	
	void m() {
		System.out.println("This is m method");
	}
	void n()
	{
		System.out.println("This is n method");
		this.m();
	}
	
}
public class ThisToInvokeCurrentClassMethod {

	public static void main(String[] args) {
		
		A a=new A();
		a.n();
	}

}
