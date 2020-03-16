package learningselenium;

import java.util.TreeSet;

import org.testng.annotations.Test;

public class TreeSetExample2 {
	
	@Test
	public void self(){
		TreeSet<Object> t=new TreeSet <Object>(new CustomSort());
		t.add(12);
		t.add(1);
		t.add(50);
		t.add(10);
        t.add(13);
        System.out.println("Descending Sorted element are "+t);
	}


}
