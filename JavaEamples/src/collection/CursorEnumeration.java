package collection;

import java.util.*;

public class CursorEnumeration {

	public static void main(String[] args) {
	
		Vector<Object> v= new Vector<Object>();
		for (int i=0;i<=10;i++) {
		v.addElement(i);
		System.out.println( "The Vector has "+ i);
		}
		
		Enumeration<Object> e=v.elements();
		while (e.hasMoreElements())
		{
		  Integer E= (Integer) e.nextElement();
		  
		  if (E%2==0)
		      {
			  System.out.println(E);
			 // System.out.println(v.elements());
			  }
		      System.out.println(E);
		}

	}

}
