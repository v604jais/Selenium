package control;

public class Labelforloop {

	public static void main(String[] args) {
		
		//aa:
			for (int i= 1;i<=10;i++)
			{
				bb:
					for (int j=1;j<=10;j++)
					{
						
						if (i==2 && j==2)
						{
						break bb;
						}
						System.out.println(i+" "+j);
						System.err.println("err");
					}
					
							
			}
		
	}

}
