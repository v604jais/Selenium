package learningselenium;

import java.util.TreeSet;

import org.testng.annotations.Test;

public class TreeSetWithStringBuffer {
	
	@Test
	public void self(){
		TreeSet<Object> t=new TreeSet <Object>(new StringCompare());
		t.add(new StringBuffer("Sita"));
		t.add(new StringBuffer("Aman"));
		t.add(new StringBuffer("Zinaah"));
		t.add(new StringBuffer("Pretty"));
		t.add(new StringBuffer("Binay"));
        System.out.println(t);
	}

}
