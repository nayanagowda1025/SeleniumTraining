package javaprograms;

public class PrimeNumbersInArray {

	public static void main(String[] args) {
		int a[]= {1,3,5,8,13,10};
        for (int i = 0; i < a.length; i++) {
        	int count=0;
			for (int j = 1; j <=a[i]; j++) {
				if(a[i]%j==0)
				{
					count++;
				}
				
			}
			if(count==2)
			{
				System.out.println(a[i]);
			}
		}
	}

}
