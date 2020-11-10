package serialization;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class serialization {
	public static void main(String[] args) {
		serialization se = new serialization();
		Address add= new Address();
		add.setStreet("dhaka");
		add.setCountry("Bangladesh");
		System.out.println(add);
		
		Address address= new Address();
		address.setStreet("1021 north dhaka");
		add.setCountry("Bangladesh");
		serialization.serializeAddress(add);
	}
	
	public static void serializeAddress(Address ad) {
		try {
			FileOutputStream fout = new FileOutputStream("file location r ki");
			ObjectOutputStream oos= new ObjectOutputStream(fout);
			oos.writeObject(ad);
			oos.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
