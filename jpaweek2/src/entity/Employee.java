package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	int id;
	@Column(name = "emp_name")
	String name;
	@Column(name = "emp_surname")
	String surname;
	@Column(name = "emp_salary")
	int salary;
	@Column(name= "emp_type")
	@Enumerated(EnumType.STRING)//enumlarý string tutmak için gereklidir.
	EmployeeType employeeType;
	
	
	public EmployeeType getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}
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
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
