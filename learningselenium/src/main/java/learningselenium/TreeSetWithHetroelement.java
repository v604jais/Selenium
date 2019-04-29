package learningselenium;

import java.util.TreeSet;

import org.testng.annotations.Test;

public class TreeSetWithHetroelement {
	
	@Test
	public void self(){
		TreeSet<Object> t=new TreeSet <Object>(new StringCompareIncreasingLength());
		t.add(new StringBuffer("Sita"));
		t.add(new StringBuffer("Aman"));
		t.add("Zinaah");
		t.add(new StringBuffer("Pretty"));
		t.add(new StringBuffer("Binay"));
        System.out.println(t);
	}

}
