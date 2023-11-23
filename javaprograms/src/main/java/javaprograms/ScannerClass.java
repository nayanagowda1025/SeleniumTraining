package javaprograms;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter value of a");
		int a= sc.nextInt();
		System.out.println("enter value of b");
		int b= sc.nextInt();
		add(a, b);
		division(a,b);

	}
	public static void add(int a,int b)
	{
		int res=a+b;
		System.out.println(res);
	}
	public static void division(int a,int b)
	{
		double res=a/b;
		System.out.println(res);
	}

}
