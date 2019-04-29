package javaBasics;

public class Prime {

	public static void main(String[] args) {
		
		int count=0;
		int[] num= {1,2,3,4,5,6,7};
		int[] primenum= new int[num.length];
		
		//for traversing
		for (int i=0;i<num.length;i++)
		{
			
			
			for (int j=2;j<num.length;j++)
			{
				
				if (num[i]%j==0 || num[i]<=1 )
				{
					break;
				}
				else 
				{
					
					
					primenum[i]=num[i];
				
				}
			}
			
		}
		for (int k=0;k<primenum.length;k++)
		{
			if (primenum[k]!=0 && count<1)
			{
			 System.out.println(2);
             System.out.println(primenum[k]);
             count++;
			}
		}
	}

}
