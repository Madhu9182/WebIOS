package Work;

public class EmployeeObject {
	String name;
	long id;
	String company;
	long salary;

	public EmployeeObject(String name, long id, String company, long salary) {
		super();
		this.name = name;
		this.id = id;
		this.company = company;
		this.salary = salary;
	}
	void EmployeeDetails() {
		System.out.println("Employee name is " + name);
		System.out.println("Employee id is " + id);
		System.out.println("Employee company is " + company);
		System.out.println("Employee salary " + salary);
	}
	public static void main(String[] args) {
		EmployeeObject Obj = new EmployeeObject("Madhu",5098263,"Capgemini",25000);
		EmployeeObject obj = new EmployeeObject("Pavan",5028966,"Wipro",28000);
		EmployeeObject object = new EmployeeObject("Chandana",2036593,"TCS",29000);
		
		Obj.EmployeeDetails();
		System.out.println("==================================");
		obj.EmployeeDetails();
		System.out.println("==================================");
		object.EmployeeDetails();

	}

}
