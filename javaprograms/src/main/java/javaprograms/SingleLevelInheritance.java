package javaprograms;

public class SingleLevelInheritance {

	String name="nayana";
  public static  void name()
   {
	   System.out.println("name fetched successfully");
   }
  
	}

class user extends SingleLevelInheritance
{
	public static void main(String[] args) {
		name();
	}
}