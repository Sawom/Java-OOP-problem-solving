package classObject;  /// arrayLiist method
import java.util.ArrayList;
import java.util.Collections;
public class aryList {
	public static void main(String args[]) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list1.add(36);
		list1.add(26);
		list1.add(38);
		list1.add(69);
		System.out.println("array list = "+list1);
	
		System.out.println("after remove..... ");
		list1.remove(2);
		list1.remove(1);
		for(int x:list1) {
			System.out.println(x);
		}
		
		boolean cheak = list1.isEmpty();
		System.out.println("array list = "+cheak);
		int pos = list1.indexOf(40);
		System.out.println("position = "+pos);
		list1.add(37);
		list1.add(99);
		System.out.println("array list1 = "+list1);
		
		list2.addAll(list1);
		System.out.println("array list2 = "+list2);
		
		boolean result = list1.equals(list2);
		System.out.println("list1 == list2 : "+result);
		
		///sorting assending
		System.out.println("after sorting assending order.... ");
		Collections.sort(list1);
		System.out.println("array list1 = "+list1);
		
		/// sorting de-sending
		System.out.println("after sorting de-sending order.... ");
		Collections.sort(list1,Collections.reverseOrder() );
		System.out.println("array list1 = "+list1);
	}
}
