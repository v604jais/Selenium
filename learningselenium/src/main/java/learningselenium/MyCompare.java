package learningselenium;

import java.util.*;

public class MyCompare implements Comparator<Object>{

	
		
		public int compare(Object obj1 , Object obj2){
			
			Integer I1=(Integer) obj1;
			Integer I2=(Integer) obj2;
			if (I1<I2)
				return +1;
			if (I1>I2)
				return -1;
			else 
				return 0;
		}

	}


