package comparableInterface;

//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.List;
import java.util.*;
public class TestEmployee {
	public static void main(String a[]){
		List<Employee> emps = new ArrayList <Employee>();
		
		emps.add(new Employee(10, "Shakil",25000));
		emps.add(new Employee(120, "Mamun ",45000));
		emps.add(new Employee(210, "Zaman ",14000));
		emps.add(new Employee(150, "Hasan ",24000));
		
		Collections.sort(emps);
		System.out.println("Sorted List...");
		
		for(Employee e:emps) {
			System.out.println(e.toString());
		}
		
		Employee maxSal = Collections.max(emps);
		
		System.out.println("\nEmployee with max salary: "+ maxSal);
	}
}
