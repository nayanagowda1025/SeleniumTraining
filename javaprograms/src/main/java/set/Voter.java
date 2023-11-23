package set;

import java.util.Scanner;

public class Voter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter age of person");
        int age=sc.nextInt();
        if(age>=18)
        {
        	System.out.println("you can vote");
        }
        else
        {
        	try
        	{
        		throw new NotEligibleToVote();
        	}
        	catch(Exception e)
        	{
        		System.out.println(e.getMessage());
        	}
        }
	}

}
