package com.capg.empapp.dao;

import com.capg.empapp.db.EmployeeDB;
import com.capg.empapp.dto.Employee;
import com.capg.empapp.exceptions.InvalidEmployeeIdException;
import com.capg.empapp.exceptions.WrongSalaryException;

public class EmployeeDAOImpl implements IEmployeeDAO {

	public boolean addEmployee(Employee e) throws WrongSalaryException {
// TODO Auto-generated method stub
		return EmployeeDB.addEmployee(e);
	}

	public Employee[] getAllEmployees() {
// TODO Auto-generated method stub
		return EmployeeDB.employees;
	}

	public boolean editSalaryByEmployeeId(int id, int empNewSalary) throws InvalidEmployeeIdException {
// TODO Auto-generated method stub
		return EmployeeDB.editSalaryByEmployeeID(id, empNewSalary);

	}

	public boolean editExpByEmployeeId(int id, int empNewExp) throws InvalidEmployeeIdException {
// TODO Auto-generated method stub
		return EmployeeDB.editExpByEmployeeId(id, empNewExp);
	}

	public Employee[] getEmployeeBySalary(int salary) {
// TODO Auto-generated method stub
		return EmployeeDB.getEmployeeBySalary(salary);
	}

	public Employee[] getEmployeeBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
// TODO Auto-generated method stub
		return EmployeeDB.getEmployeeBySalaryRange(salaryRangeMin, salaryRangeMax);
	}

	public Employee[] getEmployeeByExp(int exp) {
// TODO Auto-generated method stub
		return EmployeeDB.getEmployeeByExp(exp);
	}

	public Employee[] getEmployeeByExpRange(int expRangeMin, int expRangeMax) {
// TODO Auto-generated method stub
		return EmployeeDB.getEmployeeByExpRange(expRangeMin, expRangeMax);
	}

}