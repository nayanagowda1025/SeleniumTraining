package javaprograms;

import java.util.ArrayList;
import java.util.TreeSet;

public class Comparator1  {
	int id;
	public String name;

	public Comparator1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		
		TreeSet<Comparator1> l=new TreeSet(new SortById());
		l.add(new Comparator1(21,"smith"));
		l.add(new Comparator1(21,"allen"));
		l.add(new Comparator1(244,"dev"));
        System.out.println(l);
        ArrayList list =new ArrayList(l);
     
    // Collections.sort(l, new SortById());
    // System.out.println(l);
//     for (int i = 0; i < l.size(); i++) {
//    	 System.out.println(l.get(i));
//		
//	}
//     System.out.println("==================================");
//     Collections.sort(l, new SortByName());
//     for (int i = 0; i < l.size(); i++) {
//    	 System.out.println(l.get(i));
//		
//	}
}	public String toString()
{
		return id+name;
	}
	
	}

