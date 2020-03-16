package learningselenium;

import java.util.*;

public class CustomSort implements Comparator<Object> {

	public int compare(Object obj1, Object obj2) {
		
		Integer I1=(Integer) obj1;
		Integer I2=(Integer) obj2;
		return I2.compareTo(I1);
		//return -I1.compareTo(I2);
		//return I1.compareTo(I2);
		//return 0;
		//return -1;//reverse of insertion order
		//return +1;//insertion order
	}
}
