package learningselenium;

import java.util.TreeSet;

import org.testng.annotations.Test;

public class TreeSetWithCustomSort {
	
	@Test
	public void self(){
		TreeSet<Object> t=new TreeSet <Object>(new MyCompare());
		t.add(12);
		t.add(1);
		t.add(50);
		t.add(10);
        t.add(13);
        System.out.println(t);
	}

}
