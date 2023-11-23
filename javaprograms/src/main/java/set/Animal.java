package set;

public class Animal {
	
	     public int hashCode()
		{
			return 10;
		}
		public String toString()
		{
			return "ok";
		}
		public static void main(String[] args)
	    {
	         StringBuffer s1 = new StringBuffer( "Hello");
	         s1 = s1.append("hi");
	         StringBuffer s2 = s1;
	         System.out.println(s1==s2);
	         String s="ana aba cdcdc";
	         s.concat("gowda");
	         System.out.println(s);
	         StringBuffer s10 = new StringBuffer();
	         String [] arr=s.split(" ");
	         StringBuffer Reverse = null;
	         for (int i = 0; i < arr.length; i++) {
	        	 
				String S = arr[i];
				for (int j = S.length()-1; j >0; j--) {
					
					Reverse = s10.append(S.charAt(i));
					
					
				}
				
				
			}
	         System.out.println(Reverse);  
	    }
	

}

