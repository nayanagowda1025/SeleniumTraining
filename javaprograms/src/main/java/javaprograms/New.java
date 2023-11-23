package javaprograms;

public class New {
	    public static void main(String[] args) {
	        int withdrawalAmount = 5400;
	        int denomination = 500;

	        // Calculate the number of 500 rupee notes to be dispensed
	        int numberOfNotes = withdrawalAmount / denomination;

	        // Calculate the remaining amount
	        int remainingAmount = withdrawalAmount % denomination;

	        System.out.println("Amount to be withdrawn: " + withdrawalAmount + " rupees");
	        System.out.println("Number of 500 rupee notes to be dispensed: " + numberOfNotes);
	        System.out.println("Remaining amount for which ATM cannot dispense cash: " + remainingAmount + " rupees");
	    }
	}



