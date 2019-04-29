package collection;

import java.util.*;
public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<Object> l=new LinkedList<Object>();
		l.add("vishal");
		l.add("vishal1");
		
		l.add("vishal2");
		
		l.add("vishal3");
		
		l.add("vishal4");
		
		l.add(30);
		l.set(0, "Ram");
		l.getFirst();
        l.getLast();
        l.removeLast();
        l.removeFirst();
        l.addFirst(44);
        l.addLast(4);
        System.out.println(l);
	}

}
