package learningselenium;

import java.util.*;

import org.testng.*;
import org.testng.annotations.*;

public class TreeSetExample {
	
	@Test(priority=1)
	public void treeSet()
	{
      TreeSet<String> t=new TreeSet<String>();
      t.add("Ram");
      t.add("Ram1");
      t.add("Ram2");
      t.add("Ram3");
      //t.add(3);
     // t.add(null);
      Iterator<String> itr=t.iterator();
      while (itr.hasNext()) {
      System.out.println(itr.next());
      }
	}
	@Test(priority=2)
	public void method(){System.out.println("Priority 2");}

	@Test(priority=3,dependsOnMethods="treeSet")
	public void method2(){System.out.println("Priority 3");
	 throw new SkipException("SKIPPED as Not Implemeted"); }
}
