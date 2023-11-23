package Assignment;

public class Laptop {
	
	       static double cost;
	      Laptop(double cost)
	      {
	          this.cost = cost;
	      }
	     public static void main(String[] args)
	    {
	           Laptop lap1 = new Laptop(45000.0);
	           Laptop lap2 = new Laptop(55000.0);
	           Laptop lap3 = new Laptop(65000.0);
	           System.out.println(lap1.cost);
	           System.out.println(lap2.cost);
	           System.out.println(lap3.cost);
	    }
	

}
