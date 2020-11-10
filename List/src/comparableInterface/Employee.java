package comparableInterface;
import java.util.*;
public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private Integer salary;
	
	public Employee(int id, String name, Integer sal) {
			this.id = id;
			this.name = name;
			this.salary= sal;
	}
	
	
	//sorted with salary, choto theke boro mane acending order
	public Integer getSalary() {
		return salary;
	}
	
	public int compareTo (Employee emp ) {
		return this.salary.compareTo(emp.salary);
	}//end 
	
	
	/*
	//sorted with name, choto theke boro mane acending order
	// nam tai sort hoy , ekhane salary sort hoy na
	public String getName() {
		return name;
	}
	
	public int compareTo(Employee emp ) {
		return this.name.compareTo(emp.name);
	}
	//end */
	
	public String toString() {
	return id+"\t"+name+"\t"+salary;
	}
}
