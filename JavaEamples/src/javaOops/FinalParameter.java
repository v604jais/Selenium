package javaOops;

public class FinalParameter {
	
	int cube( final int n )
	{
	
		return n*n*n;
	}

	public static void main(String[] args) {
		
		FinalParameter a=new FinalParameter();
     System.out.println(a.cube(5));
	}

}
