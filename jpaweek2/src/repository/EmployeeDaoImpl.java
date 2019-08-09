package repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entity.Department;
import entity.Employee;
import entity.EnterCard;

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


	@Override
	public void saveDepartment(Department department) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(department);
		entityTransaction.commit();
	}


	@Override
	public void saveEnterCard(EnterCard card) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(card);
		entityTransaction.commit();
		
	}
	
}
