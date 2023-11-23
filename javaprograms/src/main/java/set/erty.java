package set;

public class erty {
	public static void main(String[] args)
{
    StringBuffer b = new StringBuffer("Hello");
    StringBuffer b1 = (StringBuffer)b;
    b.append("Hi");
    b1.append("ok");
    System.out.println(b.hashCode());
    System.out.println(b1.hashCode());
    System.out.println(b==b1);
}
}
