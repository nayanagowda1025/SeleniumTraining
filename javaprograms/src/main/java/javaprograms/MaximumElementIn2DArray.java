package javaprograms;

public class MaximumElementIn2DArray {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{2,3,4},{5,67,98}};
		int maximum=arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]>maximum)
				{
					maximum=arr[i][j];
				}
				
			}
			
		}
		System.out.println(maximum);
	}

}
