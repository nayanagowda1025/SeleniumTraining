package Employee;

import java.util.Scanner;

public class Company {
	public static void main(String[] args) {
		String name;
		int id;
		Scanner sc = new Scanner(System.in);

		System.out.println("welcome to employee database");
		System.out.println(".......................................................");
		while(true)
		{

			System.out.println("Enter a choice\n1.search employee by name\n2.search employee by id\n3.Exit");
			int choice =sc.nextInt();
			switch(choice)
			{
			case 1:System.out.println("enter employee name");
			
			 name=sc.next();
			
			switch(name) {
			
			case "abc":Employee e =new Employee(20, "abc");
			e.displayByName(name);
			break;
			case "xyz" :Employee e1 =new Employee(21, "xyz");
			e1.displayByName(name);
			break;
			}
			break;			
			case 2:System.out.println("enter employee id");
			       id=sc.nextInt();		
			switch(id) {
			case 20:
			Employee e2 =new Employee(20, "abc");
			e2.displayById(id);
			break;
			case 21:Employee e3 =new Employee(21, "xyz");
			e3.displayById(id);
			break;
			}			
			break;
			case 3:System.out.println("Thank you!!");
			System.exit(0);
			}
			}


	}


}

