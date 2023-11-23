package javaprograms;

import java.util.Comparator;

public class SortById implements Comparator<Comparator1>{

	@Override
	public int compare(Comparator1 o1, Comparator1 o2) {
		
		return o1.id-o2.id;
	}
	

}
