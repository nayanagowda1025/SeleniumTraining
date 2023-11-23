package javaprograms;

public class fghj extends A{
	public static void main(String[] args) {
		Integer a=100;
		System.out.println(a.hashCode());
		fghj b= new fghj();
		System.out.println(b.hashCode());
		//System.out.println(b);
		
	}

}
class A
{
	int a=10;
	public static void m1()
	{
		System.out.println("hi");
	}
}