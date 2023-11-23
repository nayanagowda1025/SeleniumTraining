package Employee;

public class Address {
	private int houseNumber;
	private String city;
	private String country;
	public Address(int houseNumber, String city, String country) {
		super();
		this.houseNumber = houseNumber;
		this.city = city;
		this.country = country;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}


}
