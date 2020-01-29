package json.example;


public class Address {
	private String street;
	private String city;
	private int zipcode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getStreet() + ", "+getCity()+", "+getZipcode();
	}
	
	
}
