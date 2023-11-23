package set;

import java.util.ArrayList;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(11);
		list.add(21);
		for (Object object : list) {
			Integer obj=(Integer)object;
			if(obj%2==0)
			{
				System.out.println(obj);
			}
			
		}

	}

}
