package javaOops;

public abstract class Car {
	
	Car() {System.out.println("Car is Created");}
	abstract void gear();
	void run() {System.out.println("Top run is 300km/hr ");}
	
}

class A11 extends Car
{
	void gear() {System.out.println("Have 5 gear");}
}
	

	
