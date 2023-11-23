package javaprograms;

public class Student {
	 int sid;
     String sname="nayana";
    static String schoolName;
     String Class;

	public static void main(String[] args) {
		Student person1=new Student();
       person1.Class="10th";
       person1.sid=1234;
       person1.sname="nayana";
       person1.schoolName="public";
       person1.displayAllData(0, schoolName, schoolName, schoolName);
       
	}
	public void displayAllData(int sid,String sname,String schoolName,String Class )
	{
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(schoolName);
		System.out.println(Class);

	}
	public void updateStudentName(String Sname)
	{
		sname=Sname;
		System.out.println(sname);
	}

}
