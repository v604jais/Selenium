package myPackage;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList <String> arr=new  ArrayList <String> ();
		
		arr.add("A");
		arr.add("B");
		arr.add("C");
		arr.add("D");
		
		for (String str:arr )
		{
			System.out.println(str);
		}
	}

}
