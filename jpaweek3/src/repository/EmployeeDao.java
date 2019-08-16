package repository;

import entity.Department;
import entity.Employee;
import entity.EnterCard;

public interface EmployeeDao {
	
	public void saveemploye(Employee employee);
	
	public void saveDepartment(Department department);
	
	public void saveEnterCard(EnterCard card);
}
