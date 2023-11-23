package javaprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num1=0,num2=1,sum=0;
		System.out.println("fibonacci series are");
		System.out.println(num1);
		System.out.println(num2);
		for(int i = 1; i <=10; i++) {
			sum=num1+num2;
			num1=num2;
			num2=sum;
			System.out.println(sum);
			
		}

	}

}
