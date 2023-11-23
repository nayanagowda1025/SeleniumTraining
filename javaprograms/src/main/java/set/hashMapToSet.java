package set;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class hashMapToSet {

	public static void main(String[] args) {
		HashMap<Integer,String> m=new HashMap();
        m.put(1, "nayana");
        m.put(2, "HN");
        m.put(3, "gowda");
        System.out.println(m);
       // Set s=m.entrySet();
       // System.out.println(s);
        Set<Integer> key= m.keySet();
        for (Entry o :m.entrySet() ) {
        	System.out.println(o+" "+m.get(o));
			
		}
	}

}
