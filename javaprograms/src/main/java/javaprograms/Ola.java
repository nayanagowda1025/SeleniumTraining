package javaprograms;
	import java.util.Scanner;

	public class Ola {
		String type;
		String vehicle;
		public Ola(String type,String vehicle) {
	    this.type=type;
	    this.vehicle=vehicle;
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter the choice:\n1.Ride\n2.View offers\n3.Exit");
		int choice=sc.nextInt();
		switch (choice) {
		case 1:{
			System.out.println("Enter vehicle like bus or car:");
			String vehicle1=sc.next();
			System.out.println("Enter type like Ac or Non-Ac:");
			String type1=sc.next();
			Ola o=new Ola(vehicle1,type1);
			System.out.println("You can have ride in "+type1+" "+vehicle1);
			break;
		}
		case 2:{
			System.out.println("There is no offer till Diwali");
		      }
			case 3:{
	            System.exit(0);		    }
				break;
				
		default:
			System.out.println("Invalid option");
			break;
		}
		}
	}}



