package set;

	import java.util.ArrayList;
import java.util.HashSet;

	public class RemoveDuplicates {

		public static void main(String[] args) {
			ArrayList list=new ArrayList();
			list.add(10);
			list.add(20);
			list.add(100);
			list.add(11);
			list.add(11);
			HashSet l=new HashSet(list);
			System.out.println(l);
				
			}

		}

	
