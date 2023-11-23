package WrapperClasses;

import java.util.ArrayList;
public class Student {
	int sid;
	String name;
	long mobno;
	

	public Student(int sid, String name, long mobno) {
		super();
		this.sid = sid;
		this.name = name;
		this.mobno = mobno;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", mobno=" + mobno + "]";
	}


	public static void main(String[] args) {
		Student s= new Student(201, "allen", 9876596754l);
       ArrayList<Student> alist=new ArrayList<Student>();
       alist.add(s);
       System.out.println(alist);
        
	}

}
