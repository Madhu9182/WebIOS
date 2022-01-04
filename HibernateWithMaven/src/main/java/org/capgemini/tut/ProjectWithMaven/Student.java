package org.capgemini.tut.ProjectWithMaven;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")
public class Student {
	//id, name, city
	@Id 
	private int id;
	private String name;
	private String city;
	
	//Constructor <---- Initilizing the values for student datatypes.
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	//Default coonstructor
	public Student() {
		super();
	}
	//Getter and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String toString() {
		return "Student [id = "+id + ", name=" +name + ", city=" +city+ "]";
	}
}
