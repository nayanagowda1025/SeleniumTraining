package Banking;

import java.util.Scanner;

public class BankCustomer extends BankAccount {
	static int pinNumber=1234;
	public BankCustomer(String bankName, String iFSC_Code) {
		super(bankName, iFSC_Code);

	}

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("welcome!!");
		System.out.println("enter your pin number");
		int pin=sc.nextInt();
		if(pin==pinNumber)
		{
			while(true) {


				System.out.println("Enter option\n1.Deposit Amount\n2.withdraw Amount\n3.check balance\n4.Exit");
				int choice = sc.nextInt();
				switch(choice)
				{

				case 1:  {
					BankCustomer b=new BankCustomer("canara", "CNRB1234");

					b.deposit(sc);
					b.info();
					break;
				}
				case 2: {
					BankCustomer b1=new BankCustomer("canara", "CNRB1234");
					b1.withDraw(sc);
					b1.info();
					break;
				}
				case 3: {
					BankCustomer b2=new BankCustomer("canara", "CNRB1234");
					b2.balance();
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
