package Abstraction;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		ChocolateShop c;
		
		while(true) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice to select your fav chocolate\n1.DairyMilk\n2.MilkyBar\n3.Perk\n4.KitKat\n5.Exit");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:c= new DairyMilk();
		DairyMilk d= new DairyMilk();
		d.getShopName();
		c.chocolate();
		break;
		case 2:c= new MilkyBar();
		MilkyBar m= new MilkyBar();
		m.getShopName();
		c.chocolate();
		break;
		case 3:c= new Perk();
		Perk p= new Perk();
		p.getShopName();
		c.chocolate();
		break;
		case 4:c= new KitKat();
		KitKat k= new KitKat();
		k.getShopName();
		c.chocolate();
		break;
		case 5:System.out.println("Thank you!! hope you will visit again");
		System.exit(0);
		
		}
	}
}
}
