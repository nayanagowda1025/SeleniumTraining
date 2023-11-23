package set;

public class StringClassMethods {

	public static void main(String[] args) {
		String s="nayana";
		char a[]=s.toCharArray();
		
		int count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
				{
					count++;
					a[j]=' ';
				}
			}
			
		}
		

	}

}
