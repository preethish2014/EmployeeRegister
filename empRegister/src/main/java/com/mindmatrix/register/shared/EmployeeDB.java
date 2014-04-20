package com.mindmatrix.register.shared;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDB {
	
	
	 List<Employee> employeeDB = new ArrayList<Employee>();
	 
	 public void addEmployeeDetails(Employee emp)
	 {
		 
		 employeeDB.add(emp);
	 }
	 
	 
	 public List<Employee> getEmployeeDetails()
	 {
		 return employeeDB;
		 
	 }
	 

	

}
