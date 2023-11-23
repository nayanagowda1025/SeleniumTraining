package set;

import java.util.Collections;
import java.util.TreeSet;
public class hashset implements Comparable<hashset>{
	
	int id;
	String name;
	
	public hashset(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return "employee id ==  "+id+ " and Employee Name= "+name;
	}
	
	public static void main(String[] args) {
//		SortById s=new SortById();
//		SortByName s1=new SortByName();
		TreeSet<hashset> c= new TreeSet();
		c.add(new hashset(101, "Rajneesh"));
		c.add(new hashset(105, "soma"));
		c.add(new hashset(103, "Chetu"));
		c.add(new hashset(103, "Chetu"));
		c.add(new hashset(103, "Chetu"));
		System.out.println(c);
	  
	}

	@Override
	public int hashCode() {
		return id+name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		hashset other = (hashset) obj;
		return this.id == other.id && this.name==other.name;
	}

@Override
public int compareTo(hashset o) {
	
	return this.id - o.id;
}

}

