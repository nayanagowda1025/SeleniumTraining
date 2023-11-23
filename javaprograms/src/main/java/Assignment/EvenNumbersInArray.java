package Assignment;

import java.util.Scanner;

public class EvenNumbersInArray {
	
	public static void even(int[]arr)
	{
		for (int i = 0; i < arr.length; i++) {	
		
		if(arr[i]%2==0)
		{
			System.out.println(arr[i]);
		}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
			
		}	
		even(arr);
    
	}

}
