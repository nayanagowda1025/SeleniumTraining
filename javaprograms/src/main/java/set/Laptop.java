package set;

import java.util.TreeSet;

public class Laptop implements Comparable<Laptop>
{
	int id;
	String name;
	String brand;
	
	public Laptop(int id, String name,String brand)
	{
		this.id=id;
		this.name=name;
		this.brand=brand;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", brand=" + brand + "]";
	}
	
	public static void addLaptop()
	{
		TreeSet<Laptop> t =new TreeSet<Laptop>();
		t.add(new Laptop(111,"hp","HP"));
		t.add(new Laptop(222,"lenovo","Lenovo"));
		t.add(new Laptop(333,"dell","DELL"));
		
		for (Laptop set : t) 
		{
			System.out.println(set);
		}
	}
	public static void main(String[] args)
	{
		addLaptop();
	}
	public int compareTo(Laptop c)
	{
		return this.id-c.id;
		
	}
	
}
