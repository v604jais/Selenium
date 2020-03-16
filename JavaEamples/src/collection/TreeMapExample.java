package collection;

import java.util.*;
import java.util.Map.Entry;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map=new TreeMap<Integer, String>();
		
		map.put(1,"Ram1");
		map.put(9,"Ram2");
		map.put(3,"Ram3");
		map.put(4,"Ram4");
		map.put(8,null);
		 
	    //set key
	    // Set<Entry<Integer, String>> setOfKeys=map.entrySet();
		
		Set<Integer> s=map.keySet();
		
		Iterator <Integer> itr=s.iterator();
		
		//Iterator<Entry<Integer, String>> itr=setOfKeys.iterator();
		while (itr.hasNext()) {
			
			int key=itr.next();
			String Value =map.get(key);
			
			System.out.println("key value is "+key +" value is "+Value);
			
			
			
		}
		
		
	}

}
