package javaprograms;

public class AdditionOf2DArray {

	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3},{2,3,4},{5,67,98}};
		int brr[][]= {{1,2,3},{2,3,4},{5,67,98}};
		int row=arr.length;
		int col=arr[0].length;
		int crr[][]=new int[row][col];
		for(int i=0;i<row;i++){    
			for(int j=0;j<col;j++){    
			crr[i][j]=arr[i][j]+brr[i][j];    //use - for subtraction  
			System.out.print(crr[i][j]+" ");    
			}    
			System.out.println();//new line    
			}    

	}
}
	
