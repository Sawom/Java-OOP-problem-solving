package HashSet;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("bat");
		hs.add("ball");
		hs.add("stump");
		hs.add("field");
		hs.add("ball");
		hs.add("stump");
		// hash set prints with iterator 
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		} // end
		
		hs.remove("bat"); // jeta remove korbo oita pura likha lage
		hs.remove("stump");
		System.out.println(hs);
		
		boolean value = hs.isEmpty();
		System.out.println("is hashset empty??? "+value);
		
	}
}
