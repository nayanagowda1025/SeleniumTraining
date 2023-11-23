package Banking_has_a_relationship;

import java.util.Scanner;

public class Bank {
	private String bankName;
	private String IFSC_Code;
	static double balance;
	public Bank(String bankName, String iFSC_Code) {
		
		this.bankName = bankName;
		IFSC_Code = iFSC_Code;

		
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIFSC_Code() {
		return IFSC_Code;
	}

	public void setIFSC_Code(String iFSC_Code) {
		IFSC_Code = iFSC_Code;
	}
	public void deposit(Scanner sc) {
		System.out.println("enter amount to be deposited");
		double amnt=sc.nextDouble();
		balance=balance+amnt;
		System.out.println("Amount deposited successfully ");
	}

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


	public  void balance() {
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
