package repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	EntityManager entityManager;
	
	
	public EmployeeDaoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}


	@Override
	public void saveemploye(Employee employee) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		
	}
	
}
