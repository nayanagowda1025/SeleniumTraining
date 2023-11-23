package set;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList list= new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		 System.out.println(list);
		list.set(1, 45);
        System.out.println(list.indexOf(10));
        System.out.println(list.indexOf(25));
        System.out.println(list.lastIndexOf(10));
        System.out.println("====================================");
//        for (int i = 0; i < list.size(); i++) {
//        	Object obj=list.get(i);
//        	System.out.print(" "+obj);
//			
//		}
        for (Object object : list) {
			System.out.println(object);
		}
	}

}
