package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.eclipse.persistence.annotations.TimeOfDay;

@Entity
public class Employee {

	//id için farklý konfigürasyonlar vardýr
	// @TableGenerator(name="employee_id")
	//@GeneratedValue(generator="employee_id") sequence tablosunda employee_id ismin de Employee entitysi için
	//bir id alaný oluþturur
	
	// id için farklý bir konfigürasyon daha
	//@TableGenerator(name = "emp_details",table = "key",pkColumnName = "id_emp",valueColumnName = "count",initialValue = 1000)
	//@GeneratedValue(generator = "emp_details")
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "emp_name")
	private String name;
	@Column(name = "emp_surname")
	private String surname;
	@Column(name = "emp_salary")
	private int salary;
	@Column(name= "emp_type")
	@Enumerated(EnumType.STRING)//enumlarý string tutmak için gereklidir.
	private EmployeeType employeeType;
	
	@Column(name = "start_date")
	@Temporal(TemporalType.DATE)//sadece gün olarak tutulmasý için gerekli annotation
	private Date startDate;
	
	@Column(name = "emp_image")
	@Lob //LargeObject
	private byte[] image;
	
	@ManyToOne
	@JoinColumn(name= "department")
	private Department department;
	
	@OneToOne
	@JoinColumn(name = "enter_card")
	private EnterCard enterCard;
	
	
	public EnterCard getEnterCard() {
		return enterCard;
	}
	public void setEnterCard(EnterCard enterCard) {
		this.enterCard = enterCard;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
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
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
}
