package com.Employee;

public class EmployeeServices {
	private Employee[] employees=new Employee[100];
	private int employeeCount=0;
	public boolean isEmployeeExist(int id) {
		
		for(int i=0;i<employeeCount;i++) {
		if(employees[i].getId()==id) {
			return true;
		}
	
		}
		return false;
	}
		
	
	public void addEmployees(Employee emp) {
		if(isEmployeeExist(emp.getId())) {
			System.out.println("employee already exist with this id");
			return;
		}
		employees[employeeCount]=emp;
		employeeCount++;
		System.out.println("employee entered successfully");
		
	}
	public void displayEmployees() {
		if(employeeCount==0) {
			System.out.println("no employee found");
			return;
		}
		for(int i=0;i<employeeCount;i++) {
			employees[i].display();
			System.out.println("----------------------------------");
		}
	}
	public Employee foundById(int id) {
		for(int i=0;i<employeeCount;i++) {
		if(employees[i].getId()==id) {
			return employees[i];
		}
		}
		return null;
		
	}
	public Employee foundByName(String name) {
		for(int i=0;i<employeeCount;i++) {
		if(employees[i].getName().equalsIgnoreCase(name)) {
			return employees[i];
		}
		}
		return null;
	}
	public void foundByDepartment(String department) {

	    boolean found = false;

	    for (int i = 0; i < employeeCount; i++) {

	        if (employees[i].getDepartment()
	                .equalsIgnoreCase(department)) {

	            employees[i].display();

	            System.out.println("----------------------------------");

	            found = true;
	        }
	    }

	    if (!found) {
	        System.out.println("No employees found in this department.");
	    }
	}

}
