package Employee;



public class Employee {
	static int id;
	static String name;

	Address a= new Address(21, "banglore", "india");
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;

		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void displayById(int eID)
	{
//		System.out.println("re enter employee id");
//		int emplyeeID=sc.nextInt();
		if(eID==id)
		{
			System.out.println("employee details found");
			System.out.println("===========================================");
			System.out.println("employee id is "+id);
			System.out.println("employee name is "+name);
			System.out.println("employee address is "+"# "+a.getHouseNumber()+" "+a.getCity()+", "+a.getCountry());
			System.out.println("===========================================");
		}
		else
		{
			System.out.println("employee not found");
		}
	}
	public void displayByName(String ename)
	{
//		System.out.println("re enter employee name");
//		String eName=sc.next();

		if(ename.equals(name))
		{
			System.out.println("employee details found");
			System.out.println("===========================================");
			System.out.println("employee id is "+id);
			System.out.println("employee name is "+name);
			System.out.println("employee address is "+"# "+a.getHouseNumber()+" "+a.getCity()+", "+a.getCountry());
			System.out.println("===========================================");
		}
		else
		{
			System.out.println("employee not found");
		}

	}
}
