package javaprograms;

public class Employee {
	String ename="nayana";
	int empId=071;
	double sal=50000;
  static String companyName="microsoft";

	public static void main(String[] args) {
		new  Employee().updateSal(20000);

	}
	public void updateSal(double salary)
	{
		sal=sal+salary;
		System.out.println(sal);
	}

}
