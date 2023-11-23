package javaprograms;

class WrongOption extends Exception
{
	WrongOption(String string)
	{
	   
	}
}

public class Quiz {
	
	public void quiz(char ch)
	{
		switch(ch)
		{
		case 'A':System.out.println("kannada");
		         break;
		case 'B':System.out.println("english");
                 break;
		case 'C':System.out.println("maths");
                 break;
		case 'D':System.out.println("science");
                 break;
         default: try
         {
        	 throw new  WrongOption("wrong option");      
         
         }
         catch(Exception e)
         {
        	 e.printStackTrace();
         }
		}
	}
	public static void main(String[] args) {
		Quiz a= new Quiz();
		a.quiz('F');
      
	}

}
