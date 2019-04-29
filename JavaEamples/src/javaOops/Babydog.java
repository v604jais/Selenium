package javaOops;



public class Babydog extends Dog{
void eat()	{System.out.println("Drinking milk");}	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal2 a1,a2,a3;
		a1=new Babydog();
		a2=new Dog();
		a3=new Animal2();
		a1.eat();
		a2.eat();
		a3.eat();
	}

}
