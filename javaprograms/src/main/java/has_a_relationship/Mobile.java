package has_a_relationship;

public class Mobile {
	private String name="oppo";
	private Sim s=new Sim("airtel");
	
	public Mobile(String name) {
		super();
		this.name = name;
		
	}

	public Mobile(Sim s) {
		super();
		this.s = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sim getS() {
		return s;
	}

	public void setS(Sim s) {
		this.s = s;
	}
	

}
