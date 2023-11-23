package has_a_relationship;

public class Main {

	public static void main(String[] args) {
	Mobile m=new Mobile("oppo");
	System.out.println(m.getName());
	m.setName("samsung");
	System.out.println(m.getName());
	
	System.out.println(m.getS().getCompany());
	

	}

}
