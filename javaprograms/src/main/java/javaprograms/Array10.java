package javaprograms;

import java.util.Scanner;

public class Array10 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,6,7,8,9};
		int a1[]=new int[a.length+1];
		Scanner sc = new Scanner(System.in);
        System.out.println("enter new  array element to add");
        int element=sc.nextInt();
        System.out.println("enter index of element to add");
        int index=sc.nextInt();
        int count=0;
        int i;
        for ( i = 0; i < a.length-index; i++) {
        	
        		a1[i]=a[i];
        	    count++;
			
		}
        a1[count++]=element;
       
        for (int j = index; j < a.length; j++) {
			
		a1[count++]=a[j];
       
        }
        for (int k = 0; k < a1.length; k++) {
			System.out.print(a1[k]);
		}
	}

}
