package comparatorInterface;
import java.util.*;
public class Employee{
	private int id;
	private String name;
	private Integer salary;
	
	public Employee(int id, String name, Integer sal) {
			this.id = id;
			this.name = name;
			this.salary= sal;
	}
	
	//zeta sort korte bolbe oita get kora lagbe ,,, 
	
	public Integer getSalary() { // get salary
		return salary;
	}
	
	public String getname() { // get name
		return name;
	}
	
	public Integer getid() { // get id
		return id;
	}
	
	//print list with to string
	public String toString() {
		return id+"\t"+name+"\t"+salary;
	}
	
}

class CompareEmployee implements Comparator<Employee>{
	
	/*
	// sorted with salary, choto theke boro mane acending order
	//@Override
	public int compare(Employee o1, Employee o2) {
	return o1.getSalary().compareTo(o2.getSalary());
	} // end */
	
	
	
	//sorted with id, choto theke boro mane acending order
	@Override
	public int compare(Employee o1, Employee o2) {
	return o1.getid().compareTo(o2.getid());
	}  //end 
	
	
	
	/*
	 //sorted with name, choto theke boro mane acending order
	@Override
	public int compare(Employee o1, Employee o2) {
	return o1.getname().compareTo(o2.getname());
	} //end */
	
}
