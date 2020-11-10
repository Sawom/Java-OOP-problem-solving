package hashTable;
import java.util.Hashtable;
public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String,String>();
		
		ht.put("101", "sawom");
		ht.put("102", "mahi");
		ht.put("103", "afzal");
		ht.put("104", "rodry");
		
		System.out.println(ht.get("101"));
		System.out.println(ht.get("102"));
		System.out.println(ht.get("102"));
		System.out.println(ht.get("103"));
		System.out.println(ht.get("104"));
		
		System.out.println(ht.get("afzal"));
		
		System.out.println(ht);// evaveo print kora zay but 
	}						   // 2nd braket e ans ashe
}
