package serialization;
import java.io.Serializable ;
public class Address implements Serializable  {
	String street;
	String country;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country= country;
	}
	
	public String getStreet() {
		return country;
	}
	public void setStreet(String street) {
		this.country= country;
	}
	
	
	
	
}
