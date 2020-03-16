package learningselenium;

import java.util.TreeSet;

import org.testng.annotations.Test;

public class TreeSetWithCustomSortOnString {
	
	@Test
	public void self(){
		TreeSet<Object> t=new TreeSet <Object>(new StringCompare());
		t.add("Sita");
		t.add("Aman");
		t.add("Zinaah");
		t.add("Pretty");
		t.add("Binay");
        System.out.println(t);
	}

}
