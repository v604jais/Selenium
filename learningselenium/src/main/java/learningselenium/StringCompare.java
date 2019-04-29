package learningselenium;

import java.util.*;

public class StringCompare implements Comparator<Object>{

	
		
		public int compare(Object obj1 , Object obj2){
			
			//String I1=(String) obj1;
			String I1=obj1.toString();
			String I2=obj2.toString();
			return -I1.compareTo(I2);
		}

	}


