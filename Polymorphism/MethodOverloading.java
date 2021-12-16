package Polymorphism;
class Employee{
	String name;
	int id;
	double salary;
	String company;
		//Method overloading ---> Rewriting same method with different arguments
		//Creating methods
		//Method with 1 arguments
		void details(String name) {
			this.name = name;
		}
		//Method with 2 arguments
		void details(String name, int id) {
			details(name);
			this.id = id;
		}
		//Method with 3 arguments
		void details(String name,int id, double salary) {
			details(name,id);
			this.salary = salary;
		}
		//Method with 4 arguments
		void details(String name, int id, double salary, String company) {
			details(name,id,salary);
			this.company = company;
		}
		void EmployeeInfo() {
			System.out.println("Employee name is " + name);
			System.out.println("Employee id is " + id);
			System.out.println("Employee salary is " + salary);
			System.out.println("Employee company is " + company);
		}
}
public class MethodOverloading {

	public static void main(String[] args) {
		//creating object for class
		Employee obj = new Employee();
		//Invoking/calling method
		obj.EmployeeInfo();
	}

}
