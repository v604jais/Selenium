package collection;
import java.util.*;
public class VectorExample {

	public static void main(String[] args) {
		
	  Vector<Object> v=new Vector<Object>(20,5);
	  System.out.println(v.capacity());
	  v.addElement(330);
	  v.addElement(331);
	  v.addElement(332);
	  System.out.println(v.size());
	  v.insertElementAt("RAM", 3);
	  System.out.println(v);
	}

}
