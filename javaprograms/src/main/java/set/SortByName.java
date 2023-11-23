package set;

	import java.util.Comparator;

	public abstract class SortByName implements Comparator<TreeMapSorting>{

		@Override
		public int compare(TreeMapSorting o1, TreeMapSorting o2) {
			// TODO Auto-generated method stub
			return o1.name.compareTo(o2.name);
		}
		

	}

