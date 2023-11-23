package set;

import java.util.Comparator;
import java.util.TreeSet;

class SortById implements Comparator<Tree>
{
       public int compare(Tree o1, Tree o2)
      {
           return o1.id-o2.id;
      }
}
public class Tree
{
        int id;
        String name;
	Tree(int id, String name)
	{
                this.id =id;
		this.name = name;	
	}
	public int hashCode()
	{
		return name.hashCode();
	}
	@Override
	public String toString() {
		return " Pen   [name=" + name + " id : "+id+"]";
	}
	public static void main(String[] args)
	{
		TreeSet<Tree> h = new TreeSet<>(new SortById());
		h.add(new  Tree  (1, "Parrot"));
        h.add(new  Tree  (5, "piegon"));
		h.add(new  Tree  (3," peacock"));
		h.add(new  Tree  (8, "duck"));
		System.out.println(h);
	}
}



