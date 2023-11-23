package javaprograms;

import java.util.Iterator;
import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
			int size=sc.nextInt();
			int array[]=new int[size];
			for (int i = 0; i < array.length; i++) {
				array[i]=sc.nextInt();
				
				
			}
			int sum=0;
			for (int i = 0; i < array.length; i++) {
				
				sum=sum+array[i];
			}
           System.out.println(sum);
	}

}
