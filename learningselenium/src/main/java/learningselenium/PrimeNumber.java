package learningselenium;

import java.util.HashSet;
import java.util.Iterator;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int[] Numbers= {4,7,6,7};
		int size =Numbers.length;
		//HashSet<Integer> hs= new HashSet<Integer> ();
		int count=0,itcount=0;
		//for traversing through all the element
		for (int i=0; i<size; i++)
		{
			if(Numbers[i]==2)
			{
				System.out.println(Numbers[i]);
				count++;
				continue;
			}
			for (int j=2;j<Numbers[i];j++)
			{	
				if(Numbers[i]%j==0)
				{
					break;
				}
				else
				{
				itcount++;
				}
				if(itcount==Numbers[i]-2 && count<=2)
				{
					System.out.println(Numbers[i]);
					count++;
				}
			}

			}
		 
			
		  
		
			
		}
		
		
		
	}
