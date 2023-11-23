package javaprograms;

public class BinarySearch {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int num=2;
  for (int i = 0; i < a.length; i++) {
	  for (int j = a.length-1; j > 0; j--) {
		  if(a[i]==num&&a[j]==num)
		  {
			  System.out.println(a[i]);
		  }
		
	}
	
}
	}

}
