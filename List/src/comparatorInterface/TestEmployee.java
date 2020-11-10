package comparatorInterface;
import java.util.*;
public class TestEmployee {
	public static void main(String a[]){
		List<Employee> emps = new ArrayList <Employee>();
		
		emps.add(new Employee(10, "Shakil",25000));
		emps.add(new Employee(120, "Mamun ",45000));
		emps.add(new Employee(210, "Zaman ",14000));
		emps.add(new Employee(150, "Hasan ",24000));
		
		Collections.sort(emps,new CompareEmployee());
		
		System.out.println("Sorted List...");
		for(Employee e:emps) {
			System.out.println(e.toString());
		}
		
		//compare using salary,,, for maximum
		Employee maxSal = Collections.max(emps , new Comparator<Employee>(){
			public int compare(Employee o1, Employee o2) {
			return o1.getSalary().compareTo (o2.getSalary());
			}
		});
		System.out.println("\nEmployee with max salary: "+ maxSal);
		//end
		
		
		//compare using salary,,, for minimum
		Employee minSal = Collections.min(emps , new Comparator<Employee>(){
			public int compare(Employee o1, Employee o2) {
			return o1.getSalary().compareTo (o2.getSalary());
			}
		});
		System.out.println("Employee with min salary: "+ minSal);
		//end
		
		//name id salary 3ta tei max min same output ashbe
	}
}
