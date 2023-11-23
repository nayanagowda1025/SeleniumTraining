package set;
import java.util.TreeMap;

public class TreeMapSorting implements Comparable<TreeMapSorting>{
	int id;
	String name;
	String pw;
	String phno;
	
 TreeMapSorting(int id, String name, String pw, String phno){
		this.id=id;
		this.name=name;
		this.pw=pw;
		this.phno=phno;
	}
 public String toString()
{
	return id+name+pw+phno ;
}
	
	public int compareTo(TreeMapSorting o) {
		return this.name.compareTo(o.name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<TreeMapSorting, String> t=new TreeMap<TreeMapSorting, String>();
		t.put(new TreeMapSorting(101, "pen", "a@xyz", "9807654321"),"Bhanu");
		t.put(new TreeMapSorting(102, "book", "p@uvw", "9807654123"),"Anu");
		System.out.println(t);
	

}
}


