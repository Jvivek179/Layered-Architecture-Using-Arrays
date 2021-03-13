package com.capg.empapp.service;

import com.capg.empapp.dao.EmployeeDAOImpl;
import com.capg.empapp.dao.IEmployeeDAO;
import com.capg.empapp.db.EmployeeDB;
import com.capg.empapp.dto.Employee;

import com.capg.empapp.exceptions.InvalidEmployeeIdException;
import com.capg.empapp.exceptions.WrongSalaryException;

public class EmployeeServiceImpl implements IEmployeeService {
	IEmployeeDAO dao;

	public EmployeeServiceImpl() {
		dao = new EmployeeDAOImpl();
// TODO Auto-generated constructor stub
	}

	public boolean addEmployee(Employee e) throws WrongSalaryException {

		return dao.addEmployee(e);
	}

	public Employee[] getAllEmployees() {
// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}

	public boolean editSalaryByEmployeeId(int id, int empNewSalary) throws InvalidEmployeeIdException {
		if (!dao.editExpByEmployeeId(id, empNewSalary)) {
			throw new InvalidEmployeeIdException();
		} else
			return dao.editExpByEmployeeId(id, empNewSalary);

	}

	public boolean editExpByEmployeeId(int id, int empNewExp) throws InvalidEmployeeIdException {
// TODO Auto-generated method stub
		if (!dao.editExpByEmployeeId(id, empNewExp)) {
			throw new InvalidEmployeeIdException();
		} else
			return dao.editExpByEmployeeId(id, empNewExp);
	}

	public Employee[] getEmployeeBySalary(int salary) {
// TODO Auto-generated method stub
		return dao.getEmployeeBySalary(salary);
	}

	public Employee[] getEmployeeBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
// TODO Auto-generated method stub
		return dao.getEmployeeBySalaryRange(salaryRangeMin, salaryRangeMax);
	}

	public Employee[] getEmployeeByExp(int exp) {
// TODO Auto-generated method stub
		return dao.getEmployeeByExp(exp);
	}

	public Employee[] getEmployeeByExpRange(int expRangeMin, int expRangeMax) {
// TODO Auto-generated method stub
		return dao.getEmployeeByExpRange(expRangeMin, expRangeMax);
	}
}
