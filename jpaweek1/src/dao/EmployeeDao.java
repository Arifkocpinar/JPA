package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.Employee;

public class EmployeeDao {

	private EntityManager entityManager;
	
	public EmployeeDao(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	public void saveEmployee(Employee employee) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}
	public Employee findById(int id) {
		Employee employee= entityManager.find(Employee.class, id);
		if(employee==null) {
			return null;
		}else {
			return employee;
		}
	}
	
	public void deleteEmployee(int id) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(findById(id));
		entityTransaction.commit();		
	}
	public List<Employee> findAll(){
		Query query=entityManager.createQuery("SELECT a FROM Employee a");
		return query.getResultList();
	}
	public void updateEmployee(int id,int sal){
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		Employee employee=findById(id);
		employee.setSalary(sal);
		entityTransaction.commit();
	}
	
}
