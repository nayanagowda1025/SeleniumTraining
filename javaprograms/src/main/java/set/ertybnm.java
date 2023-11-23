package set;
interface A1 {
	
    int a = 20;
     static void m1()
   {
          System.out.println("Hello");
   }
}
class B1
{
    int b;
}
public class ertybnm extends B1 implements A1
{
     public String toString()
     {
           return "Hello";
     }
     public static void main(String[] args)
     {
            A1 a = new ertybnm();
            B1 b = (B1)a;
            System.out.println(b);
            
     }
}

	



