package javaOops;

public interface Drawable {
	
	void draw();
	static  int cube (int x) {return x*x*x;}
    default void msg() {System.out.println("message method is called");}
}

class Vishal implements Drawable {

	public void draw(){System.out.println("draw method called");}
}