package Assignment;

	import java.util.Scanner;

	public class SumOfOddNumbers {
		public static void sumOfOddNumbers(int arr[])
		{
			int sum=0;
			for (int i = 0; i < arr.length; i++) {	
				
				if(arr[i]%2==1)
				{
					sum=sum+arr[i];
					
				}
					
					
				}
			System.out.println(sum);
				
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
			sumOfOddNumbers(arr);
	    
		}

			

		}




