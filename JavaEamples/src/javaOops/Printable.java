package javaOops;

interface Printable {}
	
	class Aa implements Printable{
	public void printA() {System.out.println("inside printA");}
	}

	class Bb implements Printable{
	public void printB() {System.out.println("inside printB");}
	}

	class Call {
		
		void invoke (Printable p, Printable p1)
		{
			if (p instanceof Aa)
			{
				Aa a=(Aa)p ;//downcasting
				a.printA();
			}
			
			if (p1 instanceof Bb)
			{
				Bb b=(Bb)p1 ;//downcasting
				b.printB();
			}
		}
		
	}
	
	



