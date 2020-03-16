package myPackage;
import java.util.*;
import java.util.Map.Entry;
public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap <String, String> hash=new HashMap<String, String> ();
        hash.put("Name", "Vishal");
        hash.put("Addr", "Kanhauli Bazar");
        hash.put("MobNo","8999006228");
        //1st method
      
        Iterator<String> iterator=hash.keySet().iterator();
        while (iterator.hasNext())
        {
        	String k=iterator.next();
        	System.out.println(k+":"+hash.get(k));
        	
        }
        //2nd method
        for (Entry<String, String> entry:hash.entrySet())
        {
        	System.out.println(entry.getKey()+":"+entry.getValue());
        }
	}

}
