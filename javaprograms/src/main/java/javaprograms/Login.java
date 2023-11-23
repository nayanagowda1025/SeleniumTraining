package javaprograms;

public class Login {
	long phoneNo;
	String email;
	String password;
	public Login(long phoneNo,String email)
	{
		final int a=10;
		
		this.phoneNo=phoneNo;
		this.email=email;
		System.out.println("loged in successfully with "+phoneNo+"and "+email);
	}
	public Login(String password,String email)
	{
		this.password=password;
		this.email=email;
		System.out.println("loged in successfully with "+password+"and "+email);
	}

	public static void main(String[] args) {
		
      Login password=new Login("nayana@123","nayana@gmail.com");
      Login phoneNo=new Login(3426353578l,"nayana@gmail.com");
	}

}
