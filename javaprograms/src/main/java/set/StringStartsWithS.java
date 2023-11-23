package set;

import java.util.ArrayList;

public class StringStartsWithS {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("sangam");
		list.add("sneha");
		list.add("sankalp");
		list.add("meghana");
		list.add("nayana");
        for (int i = 0; i < list.size(); i++) {
        	Object obj=list.get(i);
        	if(obj instanceof String)
        	{
        		String str=(String)obj;
        		if( str.startsWith("s"))
        		{
        			System.out.println(str);
        		}
        		
        	}
			
		}
	}

}

