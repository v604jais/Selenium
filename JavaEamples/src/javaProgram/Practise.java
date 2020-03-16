package javaProgram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Practise {

	public static <E> void main(String[] args) {

		LinkedList<String> l = new LinkedList<String>();

		l.add("Shita");
		l.add("Ram");
		l.add("Shayam");
		l.add("Shankar");
		l.add("Pankaj");
		l.add("Shita");
		
		HashSet<String> s=new HashSet<String>();
		System.out.println("HasSet "+s.addAll(l)); 
		Iterator<String> ltr2 = s.iterator();
		while (ltr2.hasNext()) {

			System.out.println(ltr2.next());
           
			
		}
		System.out.println("*********************************");
		ListIterator<String> ltr = l.listIterator();

		while (ltr.hasNext()) {

			System.out.println(ltr.next());

		}

		while (ltr.hasPrevious()) {

			System.out.println(ltr.previous());

		}

	}

}
