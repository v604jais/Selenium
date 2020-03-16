package control;

public class Continue {

	public static void main(String[] args) {
	
		//outer loop
	for (int a=1;a<=10;a++)
    {
		// inner loop
		for (int j=1;j<=10;j++)
		{
			//
			if (a==2 && j==2) {
			continue ;
			}
		System.out.println(a+" "+j);
		}
	 }
	
	}

}
