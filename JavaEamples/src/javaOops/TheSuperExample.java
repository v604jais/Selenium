package javaOops;

class A1 {
	void organisation(){System.out.println("Welcome to organization");}
	int room_no=1;
	
	A1(){
		int id=101;
		String name="vishal";
		System.out.println(id);
		System.out.println(name);
	}
	
}

class B extends A1{
	
B(){
	super();
	System.out.println(super.room_no);
	String school="SPS";
	String Religion="Hindu";
	System.out.println(school);
	System.out.println(Religion);
	super.organisation();
   }
}

public class TheSuperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b=new B();
		

	}

}
