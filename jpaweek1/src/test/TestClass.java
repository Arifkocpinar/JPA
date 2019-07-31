package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.EmployeeDao;
import model.Employee;

public class TestClass {
	/**
	 * @param args
	 * Arif Koçpýnar
	 */
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=emf.createEntityManager();
		
		EmployeeDao dao= new EmployeeDao(entityManager);
		
		Employee employee = new Employee(1,"Arif","Koçpýnar",3500);
		Employee employee2 = new Employee(2,"Mustafa","Avan",3500);
		Employee employee3 = new Employee(3,"Yasin","Þen",3500);
		Employee employee4 = new Employee(4,"Cebo","Akay",3500);
		dao.saveEmployee(employee);
		dao.saveEmployee(employee2);
		dao.saveEmployee(employee3);
		dao.saveEmployee(employee4);
		System.out.println(dao.findById(1).getName());
		
		for(Employee emp:dao.findAll()) {
			System.out.println(emp.getName() +"  "+ emp.getSurname()+" "+emp.getSalary());
		}
		System.out.println("-------------------------");
		dao.deleteEmployee(1);
		dao.updateEmployee(2,5000);
		for(Employee emp:dao.findAll()) {
			System.out.println(emp.getName() +"  "+ emp.getSurname()+" "+emp.getSalary());
		}
	}
}
