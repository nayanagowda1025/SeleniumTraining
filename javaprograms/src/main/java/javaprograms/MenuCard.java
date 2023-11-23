//create a generalized class called Menu card and create objects for it with a 
//parameterized constructor and try to take input from the user and display the food.

package javaprograms;

import java.util.Scanner;

public class MenuCard {
	String food;
	String msg;
	MenuCard(String food,String msg)
	{
		this.food=food;
		this.msg=msg;
		System.out.println(food+" "+msg);
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Welcome!!");
		while(true) {
			System.out.println("Menu Card\n1. pizza\n2. burgur\n3. biryani\n4. Exit from hotel\nEnter choice to choose your food");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:MenuCard m= new MenuCard("pizza","I'm ready for you");
			break;
			case 2:MenuCard m1= new MenuCard("burgur","I'm ready for you");
			break;
			case 3:MenuCard m2= new MenuCard("biryani","I'm ready for you");
			break;
			case 4:System.out.println("thank you!!hope you will visit again ");
			System.exit(0);

			}
		}
	}
}