package Banking;

import java.util.Scanner;

public class BankAccount implements Bank {
	static String bankName;
	static String IFSC_Code;
	static double balance;

	public BankAccount(String bankName, String iFSC_Code) {
		super();
		this.bankName = bankName;
		IFSC_Code = iFSC_Code;
	}
	@Override
	public void deposit(Scanner sc) {
		System.out.println("enter amount to be deposited");
		double amnt=sc.nextDouble();
		balance=balance+amnt;
		System.out.println("Amount deposited successfully ");
	}
	@Override
	public void withDraw(Scanner sc) {
		System.out.println("enter amount to withdraw");
		double amnt=sc.nextDouble();
		if(balance>=amnt) {

			balance=balance-amnt;
			System.out.println("Amount debited successfully ");
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}

	@Override
	public void balance() {
		System.out.println("======================================");
		System.out.println("bank name is  "+bankName);
		System.out.println("IFSC Code is  "+IFSC_Code);
		System.out.println("your bank balance is  "+balance);
		System.out.println("======================================");
	}
	public void info()
	{
		System.out.println("======================================");
		System.out.println("bank name is  "+bankName);
		System.out.println("IFSC Code is  "+IFSC_Code);
		System.out.println("Your Bank balance is  "+balance);
		System.out.println("======================================");


	}

}


