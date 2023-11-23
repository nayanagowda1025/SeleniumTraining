package Assignment;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1="hello";
		String s2="hn";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(0, 4));
		System.out.println(s1.replace('l', 'o'));
		System.out.println(s2.replaceAll(s2, "gowda"));
		String []a=s1.split(" ");
		for(String i:a)
		System.out.println(i);
	}
 
}
class Books
{
	public void checkBooks(Scanner sc) 
	{
		System.out.println("enter book name");
				
	}
}