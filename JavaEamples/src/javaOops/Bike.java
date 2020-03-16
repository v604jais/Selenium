package javaOops;

 class Bike extends RuntimeOverrides {
	
	 void run () {System.out.println("running safely");}


		public static void main(String[] args) {
			
			RuntimeOverrides r=new Bike(); //upcasting 
			 r.run();
		}
	}
