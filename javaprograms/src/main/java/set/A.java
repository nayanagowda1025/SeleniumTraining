package set;

public interface A {
	
	     int a = 20;
	      static void m1()
	    {
	           System.out.println("Hello");
	    }
	}
	class B
	{
	     int b;
	}
	class Sample1 extends B implements A
	{
	      public String toString()
	      {
	            return "Hello";
	      }
	      public static void main(String[] args)
	      {
	    	   
	             A a = new Sample1();
	             B b = (B)a;
	             System.out.println(b);
	             
	      }
	}


