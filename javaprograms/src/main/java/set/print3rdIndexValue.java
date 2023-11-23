package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class print3rdIndexValue {
	  public static void main(String[] args) {
		  LinkedHashSet<Integer>l=new LinkedHashSet<>();
		  l.add(10);
		  l.add(20);
		  l.add(30);
		  l.add(40);
		  l.add(50);
		  l.add(60);
		  Iterator itr=l.iterator();
		  int index=0;
		  while(itr.hasNext())
		  {
			 
			  Integer obj= (Integer) itr.next();
			   if(index==3)
			   {
				  System.out.println(obj); 
				  break;
			   }
			   
			   index++;
			  
		  }
	  }
	     
	}



