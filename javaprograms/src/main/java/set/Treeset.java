package set;

import java.util.TreeSet;

public class Treeset implements Comparable<Treeset> {
      int id;
      String name;
      Treeset(int id,String name)
      {
    	  this.id=id;
    	  this.name=name;
      }
      public String toString()
      {
    	  return id+name;
      } 
	public static void main(String[] args) {
		TreeSet<Treeset> set=new TreeSet();
        set.add(new Treeset(22,"smith"));
        set.add(new Treeset(24,"allen"));
        set.add(new Treeset(23,"megh"));
        for (Treeset t : set) {
			System.out.println(t.id+t.name);
			
		}
	}
	public int compareTo(Treeset o)
	{
		return this.id-o.id;
	}
    
}
