package com.capg.empapp.service;

import com.capg.empapp.dto.Employee;
import com.capg.empapp.exceptions.InvalidEmployeeIdException;
import com.capg.empapp.exceptions.WrongSalaryException;


public interface IEmployeeService {

	public boolean addEmployee(Employee e) throws WrongSalaryException;
	
	public boolean editSalaryByEmployeeId(int id, int empnewsalary) throws InvalidEmployeeIdException;
	
	public boolean editExEmployeeId(int id)throws InvalidEmployeeIdException;

	public Employee[] getAllEmployees();
	
	public Employee[] getEmployeeBySalary(int salary);
	
	public Employee[] getEmployeeBySalaryRange(int salaryRangeMin,int salaryRangeMax );
	
}
