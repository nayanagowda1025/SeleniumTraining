package set;

import java.util.ArrayList;

public class LargestElementInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(11);
		list.add(21);
		                                                        
		int largest=Integer.MIN_VALUE;
		for (int o : list) 
		{
			if(o>largest)
			{
				largest=o;
			}
		}
		System.out.println(largest);
		int min=Integer.MAX_VALUE;
		for (int o : list) 
		{
			if(o<min)
			{
				min=o;
			}
		}
		System.out.println(min);
	}

}
