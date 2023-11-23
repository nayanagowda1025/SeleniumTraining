package set;

import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		TreeMap<Integer,String> tree=new TreeMap();
		tree.put(20, "tree");
		tree.put(30, "tree");
		tree.put(40, "tree");
		tree.put(50, "tree");
		
		System.out.println(tree);
		tree.pollFirstEntry();
		System.out.println(tree);
		tree.pollLastEntry();
		System.out.println(tree);
	
	}

}
