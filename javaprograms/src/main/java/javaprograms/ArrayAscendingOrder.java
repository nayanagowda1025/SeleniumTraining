package javaprograms;

public class ArrayAscendingOrder {
	public static void main(String[] args) {
		int arr[]= {3,2,8,4,5},temp=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j< arr.length; j++) {
				if(arr[i]>arr[j])//arr[i]<arr[j] for descending order
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
					
				}
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
	}

