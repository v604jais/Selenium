package collection;

import java.util.*;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<Object> stk= new Stack <Object>();
		
	    System.out.println("Capacity is "+stk.capacity());
	    
	    stk.push("Vishal");
	    stk.push(301);
	    stk.push("Vishal2");
	    stk.push("Vishal3");
	    stk.push("Vishal4");
	    System.out.println("Size is "+stk.size());
	    
	    System.out.println(stk.peek());
	    System.out.println(stk.pop());
	    System.out.println(stk.peek());
	    System.out.println(stk.search("Vishal2"));
	    System.out.println(stk);
	}

}
