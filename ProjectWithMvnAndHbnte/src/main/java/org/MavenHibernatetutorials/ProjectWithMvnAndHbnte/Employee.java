package org.MavenHibernatetutorials.ProjectWithMvnAndHbnte;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "employee_details")
public class Employee {
	//empId, empName, empPh, empDeskNo
	@Id
	private int empId;
	private String empName;
	private String empPh;
	private long empDeskNo;
	
	//Constructor <---- Initializing the values for employee datatypes.
	public Employee(int empId, String empName, String empPh, long empDeskNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPh = empPh;
		this.empDeskNo = empDeskNo;
	}
	
	//Default constructor
	public Employee() {
		super();
	}
	//Getter and setters

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPh() {
		return empPh;
	}

	public void setEmpPh(String empPh) {
		this.empPh = empPh;
	}

	public long getEmpDeskNo() {
		return empDeskNo;
	}

	public void setEmpDeskNo(long empDeskNo) {
		this.empDeskNo = empDeskNo;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empPh=" + empPh + ", empDeskNo=" + empDeskNo
				+ "]";
	}
	
}
