package javaOops;

public interface AT {

	void a();  
	void b();  
	void c();  
	void d(); 
}
abstract class B11 implements AT{ 

static String q="sri";
public void c(){System.out.println("I am c");}  
abstract void love() ;
}
  
class M extends B11{  
public void a(){System.out.println("I am a");}  
public void b(){System.out.println("I am b");}  
public void d(){System.out.println("I am d");}  
void love() {System.out.println("Love"+" " +q);}

}  
  