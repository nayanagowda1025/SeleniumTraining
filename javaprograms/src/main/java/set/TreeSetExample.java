package set;
	import java.util.Comparator;
	import java.util.TreeSet;

	class MyObject {
	    int value;
	    
	    public MyObject(int value) {
	        this.value = value;
	    }
	}

	class MyObjectComparator implements Comparator<MyObject> {
	    @Override
	    public int compare(MyObject obj1, MyObject obj2) {
	        // Define your custom comparison logic here
	        return Integer.compare(obj1.value, obj2.value);
	    }
	}

	public class TreeSetExample {
	    public static void main(String[] args) {
	        TreeSet<MyObject> customTreeSet = new TreeSet<>(new MyObjectComparator());
	        customTreeSet.add(new MyObject(3));
	        customTreeSet.add(new MyObject(1));
	        customTreeSet.add(new MyObject(2));
	        
	        for (MyObject obj : customTreeSet) {
	            System.out.print(obj.value);
	        }
	    }
	}



