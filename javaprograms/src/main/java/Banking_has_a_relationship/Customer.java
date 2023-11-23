package Banking_has_a_relationship;

import java.util.Scanner;

import Banking.BankCustomer;

public class Customer {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Account a= new Account();
		
		System.out.println("welcome!!");
		System.out.println("enter your pin number");
		long pin=sc.nextLong();
		if(pin==a.getPinNumber())
		{
			while(true) {


				System.out.println("Enter option\n1.Deposit Amount\n2.withdraw Amount\n3.check balance\n4.Exit");
				int choice = sc.nextInt();
				switch(choice)
				{

				case 1:  {
					
					a.getB().deposit(sc);
					a.getB().info();
					break;
				}
				case 2: {
					a.getB().withDraw(sc);
					a.getB().info();
					break;
				}
				case 3: {
					a.getB().balance();
					break;
				}
				case 4:System.out.println("thank you");
				System.exit(0);

				}
			}
		}
		else
		{
			System.out.println("invalid pin number");
		}
	}


}

