package set;

import java.util.ArrayList;

public class StringEndsWoithSar {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("alsar");
		list.add("pulsar");
		list.add("cursar");
		for (String object : list) {
			if(object.endsWith("sar"))
			{
				System.out.println(object);
			}
			
		}
	}
	

}
