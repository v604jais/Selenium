package myPackage;

public class Constructor {
	
	int carbmwprice ;
	int carmercedees;
	int carferrari;

	// default constructor
	public Constructor() {
		carbmwprice=100;
		carmercedees=200;
		carferrari=300;
	}
	//constructor overloading
    public Constructor(int a, int b, int c) {
		
    	carbmwprice=a;
		carmercedees=b;
		carferrari=c;
	}
   //copy constructor
   public Constructor(Constructor c) {
	
	    carbmwprice=c.carbmwprice;
		carmercedees=c.carmercedees;
		carferrari=c.carferrari;
    }
	public static void main(String[] args) {
		
		Constructor c1=new Constructor();
		System.out.println(c1.carbmwprice);
		System.out.println(c1.carferrari);
		System.out.println(c1.carmercedees);
		
		System.out.println("**************************************");
		Constructor c11=new Constructor(300,400,500);
		System.out.println(c11.carbmwprice);
		System.out.println(c11.carferrari);
		System.out.println(c11.carmercedees);
		
		System.out.println("**************************************");
		Constructor c111=new Constructor(c11);
		System.out.println(c111.carbmwprice);
		System.out.println(c111.carferrari);
		System.out.println(c111.carmercedees);
	}

}
