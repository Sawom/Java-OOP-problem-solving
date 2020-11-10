package HashMap;
import java.util.HashMap;
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(101, "sawom");
		hm.put(102, "mahi");
		hm.put(103, "afzal");
		
		System.out.println(hm.get(101));
		System.out.println(hm.get(102));
		System.out.println(hm.get(102));
		System.out.println(hm.get(103));
		System.out.println(hm.get("afzal"));
		
		System.out.println(hm);// evaveo print kora zay but 
	}						   // 2nd braket e ans ashe
}
