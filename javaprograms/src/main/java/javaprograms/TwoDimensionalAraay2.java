package javaprograms;

import java.util.Scanner;

public class TwoDimensionalAraay2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row size");
		int rowSize= sc.nextInt();
		System.out.println("enter the col size");
		int colSize= sc.nextInt();
		System.out.println("enter elements");
		int arr[][]=new int[rowSize][colSize];
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j]=sc.nextInt();
			}
			
			System.out.println();
			
		}
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]);
			}
			
			System.out.println();
			
		}	
			
		
	}

}
