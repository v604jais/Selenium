package learningselenium;

import java.util.*;

public class StringCompareIncreasingLength implements Comparator<Object>{

	
		
		public int compare(Object obj1 , Object obj2){
			
			//String I1=(String) obj1;
			String I1=obj1.toString();
			String I2=obj2.toString();
			int l1=I1.length();
			int l2=I2.length();
			if (l1<l2)
			return -1;
			else if (l1>l2)
				return 1;
			else
			return I1.compareTo(I2);
		}

	}


