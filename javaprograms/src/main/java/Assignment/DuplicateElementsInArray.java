package Assignment;

import java.util.Scanner;

public class DuplicateElementsInArray {
	public static void duplicate(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {	
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}		
				
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
		duplicate(arr);
    
	}

	}


