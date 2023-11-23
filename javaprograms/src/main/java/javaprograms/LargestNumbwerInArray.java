package javaprograms;

public class LargestNumbwerInArray {

	public static void main(String[] args) {
		int a[]= {1,3,4,56,7};
		int large=a[0];
        for (int i = 0; i < a.length; i++) {
	      if(a[i]>large)
	      {
	    	  large=a[i];
	      }
	
}
        System.out.println(large);
	}

}
