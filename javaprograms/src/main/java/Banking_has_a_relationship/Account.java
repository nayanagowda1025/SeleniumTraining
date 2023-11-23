package Banking_has_a_relationship;

public class Account {
	private int pinNumber=1234;
	private Bank b=new Bank("canara", "CNRB1234");
	
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	public Bank getB() {
		return b;
	}
	public void setB(Bank b) {
		this.b = b;
	}
	

}
