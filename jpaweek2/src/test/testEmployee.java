package test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Department;
import entity.Employee;
import entity.EmployeeType;
import entity.EnterCard;
import repository.EmployeeDaoImpl;

public class testEmployee {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EmployeeDaoImpl daoImpl=new EmployeeDaoImpl(entityManager);
		Employee employee= new Employee();
		employee.setEmployeeType(EmployeeType.FULL_TIME);
		employee.setName("Arif");
		employee.setSalary(5000);
		employee.setSurname("Koçpýnar");
		employee.setStartDate(new Date());
		employee.setImage("deneme".getBytes());
		Department department= new Department();
		department.setDeptName("Çaycý");
		daoImpl.saveDepartment(department);
		EnterCard card= new EnterCard();
		daoImpl.saveEnterCard(card);
		employee.setDepartment(department);
		employee.setEnterCard(card);
		daoImpl.saveemploye(employee);
		entityManager.close();
		entityManagerFactory.close();
	}
}
