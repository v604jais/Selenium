package learningselenium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetExample {

	public static void main(String[] args) {

		HashSet<Integer> hs=new HashSet<Integer>();
		ArrayList<Integer> al=new ArrayList<Integer>();
		int count=0;
		for (int i =0;i<10;i++)
		{
		al.add(i);
		}
		for (int j =0;j<10;j++)
		
	     {
			al.add(j);
	    }
		System.out.println(al);
		hs.addAll(al);
		int n=3/2;
		System.out.println(n);
		System.out.println("inside Hashset"+hs);
		Iterator<Integer> itr1=hs.iterator();
		Iterator<Integer> itr2=al.iterator();
		 
		while (itr1.hasNext()){
			
			while (itr2.hasNext()) {
				
				for (int i=0; i<al.size();i++) {
					
					if (itr1.next()==itr2.next());
					{
						count++;
						System.out.println(count);
					}
				}
				
			}
		}
	}

}
