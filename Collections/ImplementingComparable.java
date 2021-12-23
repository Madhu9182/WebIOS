package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Implementing comparable to sort Employee on basis of name, id, salary, company name
class Employee implements Comparable<Employee>{
	
	//Declaring variables 
	private int id;
	private String name;
	private String address;
	private int salary;
	//creating zero argument constructor
	public Employee(){
		System.out.println("Zero argument constructor");
	}
	//creating parameterized constructor
	public Employee(int id, String name, String address, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		Employee e = (Employee)o;
		int SalComparison = Integer.compare(this.salary, e.salary);
		if(SalComparison == 0)
		{
			return name.compareTo(e.name);
		}
		return SalComparison;
	}
}

public class ImplementingComparable {
	public static void main(String[] args) {
		Employee emp1 = new Employee(74,"Madhu","Chennai",20000);
		Employee emp2 = new Employee(74,"Pavan","Chennai",25000);
		Employee emp3 = new Employee(74,"venkat","Chennai",30000);
		
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		Collections.sort(list); //sort
		
		for(Employee details : list) {
			System.out.println(details);
		}
	}
}
