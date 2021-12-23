package Collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	//Implementing variables
	String student_name;
	int id;
	String school_name;
	String city;
	
	//Creating zero parameterized constructor
	public Student() {
		System.out.println("Zero parameterized constructor");
	}
	
	//creating parameterized constructor
	public Student(String student_name, int id, String school_name, String city) {
		this.student_name = student_name;
		this.id = id;
		this.school_name = school_name;
		this.city = city;
	}
	public String toString() {
		return "Student[ Student_name = " + student_name + ", id = " + id + ", School_name = " + school_name + ", city = " + city + "]";
	}

	@Override
	public int compareTo(Student o) {
		Student s = (Student)o;
		int idComparision = Integer.compare(this.id,s.id);
		if(idComparision == 0) {
			return student_name.compareTo(s.student_name);
		}
		return idComparision;
	}
}
public class UsingComparable {

	public static void main(String[] args) {
		Student s1 = new Student("Madhu", 15, "Bharath", "Chennai");
		Student s2 = new Student("Pavan", 12, "KLU" , "Vijayawada");
		Student s3 = new Student("Naga", 13, "SRM", "Bangalore");
		
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		Collections.sort(list);
		
		for(Student details : list) {
			System.out.println(details);
		}
	}

}
