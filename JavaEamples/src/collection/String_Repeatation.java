package collection;

import java.util.Set;

public class String_Repeatation {

	public static void main(String[] args) {
		
		
		String Str="This is a group of geek and tech people geek";
		String Word="geek";
		System.out.println("there are "+duplicate(Str,Word) +"Word of "+Word);
		
		
	}

	static int duplicate(String str, String Word) {
		
		String a[]=str.split("\\s");
		int count=0;
		for (int i=0; i<a.length;i++) {
		if (Word.equals(a[i]))
		{
			
			count++;
			
		}
		}
		return count;
		
	}
	
}
