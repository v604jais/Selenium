package collection;

import java.io.*;
import java.util.*;

import org.apache.poi.ss.formula.functions.Replace;

public class ListExample {

	public static void main(String[] args) {
		//  it is used when we want duplicate value and insertion order to be preserved

		ArrayList<String> l= new ArrayList<String>();
		
		l.add("Vishal");
		l.add(0,"Vishal@3");
		l.add("Vishal@2");
		l.add("Vishal@1");
		l.add("Vishal");
		System.out.println(l.contains("Vishal"));
		System.out.println(l);
	   Iterator<String> i= l.iterator();
	   
	   while (i.hasNext()) {
	   System.out.println(i.next());
	   }
	   // for loop
	   System.out.println("Inside for loop");
	   for (String k:l)
	   {   
		   int a= l.hashCode();
		   
		   System.out.println(k);
		   System.out.println(a);
	   }
	   
	 System.out.println("index value is "+l.indexOf("Vishal"));
	 
	  String s1= "This is my book and is this-is her pen";
	  
	  String s2= new String("Hi is this");
	  String s3=s1.intern();
	  String s4=s2.intern();
	 // String Str1[]=s4.split("\\", 2);
	  String Str[]=s1.split("-|\\.", 5);
	  System.out.println("Example of Arrys to string"+Arrays.toString(Str));
	  System.out.println("s3 value is "+s3 + " S4 value is "+ s4);
	  System.out.println(s1.lastIndexOf('i'));
	  char c1= s1.charAt(s1.length()-1);
	 
	  String newstr=s1.replaceFirst("is", "was");
	  char c2=newstr.charAt(newstr.length()-1);
	  System.out.println("C1 value is "+c1 +" & C2 value is " +c2);
	  System.out.println("s1 compare to "+s1.compareTo(newstr)); 
	  System.out.println(newstr);
	  System.out.println(s1.lastIndexOf("is"));
	  
	  String b="Hello";
	  System.out.println(b.concat(" world"));
	   
	  ArrayList <String> m=new ArrayList<String>();
	  m.addAll(l);
	  System.out.println("New M List value are  "+m);
	  m.remove(1);
	  System.out.println("New M List value are  "+m);
	  
	  System.out.println("instance of"+m instanceof Serializable);
	  System.out.println(m instanceof Cloneable);
	  System.out.println(m instanceof RandomAccess);
	  
	  System.out.println(b.compareToIgnoreCase("HELLO"));
	  System.out.println(b.equalsIgnoreCase("HELLO"));
	  System.out.println(b.equals("Hello"));
	  
	  System.out.println(s1.replace('T', 'H'));
	  System.out.println("After replacing all"+s1.replaceAll("\\s","" ));
	  
	  System.out.println(s1.substring(0, 5));
	  
	  System.out.println(s1.startsWith("is",2));
	  System.out.println(s1.endsWith("pen"));
	  System.out.println(s1.toUpperCase(Locale.getDefault()));
      System.out.println(s1.toUpperCase(Locale.CHINESE));
      System.out.println(s1.toLowerCase(Locale.getDefault()));
      System.out.println(s1.toLowerCase(Locale.CHINESE));
      
	 }
}
