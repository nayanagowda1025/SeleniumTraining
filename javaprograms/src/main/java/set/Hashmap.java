package set;

	import java.util.HashMap;
import java.util.Set;

	public class Hashmap  {
	      int id;
	      String name;
	      Hashmap(int id,String name)
	      {
	    	  this.id=id;
	    	  this.name=name;
	      }
	      public String toString()
	      {
	    	  return id+name;
	      } 
		public static void main(String[] args) {
			HashMap<Integer,Hashmap> set=new HashMap();
	        set.put(21,(new Hashmap(22,"smith")));
	        set.put(22,(new Hashmap(24,"allen")));
	        set.put(23,(new Hashmap(23,"megh")));
	        Set<Integer> key=set.keySet();
	        for (Integer t : key) {
				System.out.println(t+ ""+set.get(t));
				
			}
		}
//		public int compareTo(Hashmap o)
//		{
//			return this.id-o.id;
//		}
//	    
	}
