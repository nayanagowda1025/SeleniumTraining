package set;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumbers {

	public static void main(String[] args) {
		ArrayList s= new ArrayList();
		
		int limit=20;
		int sum=0;
		for (int i = 1; i <=limit; i++) {
			int num=i;	
			int count=0;
		for (int j = 1; j <=num; j++) {
			if(num%j==0)
			{
				count++;
			}
		if(count==2)
		{
			s.add(num);
		}
		}
		}
		
	}
}
		
		
//	}
//
//	}
// Object[]arr=s.toArray();
//		
//		
//		for (Object o : arr) 
//		{
//			int n=(int)o;
//			sum=sum+n;
//		}
//		Arrays.sort(arr);
//		int large=(int) arr[arr.length-1];
//		int small=(int) arr[0];
//		System.out.println(sum);
//		System.out.println(large);
//		System.out.println(small);
//		
//		}
//}
//		
//		
//		
