package arrayList;  // generics types mane different data types er elements thakbe 
import java.util.ArrayList;
import java.util.Iterator;
public class nongenericArrayList {
	public static void main(String args[]) {
		ArrayList al = new ArrayList();
		// add elements 
		al.add("bat");
		al.add("ball");
		al.add("stumps");
		al.add(6);
		al.add(4);
		
		// list prints with iterator 
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		} // end
		
		// remove elements
		al.remove(2);
		al.remove(1);
		System.out.println(al);
		
	}
}
