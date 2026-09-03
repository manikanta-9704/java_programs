package com.Employee;

public class EmployeeServices{
	Employee[] employees=new Employee[100];
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
	public boolean updateName(int id,String name) {
		Employee emp=foundById(id);
		if(emp==null) {
			System.out.println("no employee found");
			return false;
		}
		emp.setName(name);
		return true;
	}
	public boolean updateGender(int id, String gender) {

	    Employee employee = foundById(id);

	    if (employee == null) {
	        return false;
	    }

	    employee.setGender(gender);

	    return true;
	}
	public boolean updateDepartment(int id, String department) {

	    Employee employee = foundById(id);

	    if (employee == null) {
	        return false;
	    }

	    employee.setDepartment(department);

	    return true;
	}
	public boolean updateDesignation(int id, String designation) {

	    Employee employee = foundById(id);

	    if (employee == null) {
	        return false;
	    }

	    employee.setDesignation(designation);

	    return true;
	}
	public boolean updateSalary(int id, double salary) {

	    Employee employee = foundById(id);

	    if (employee == null) {
	        return false;
	    }

	    employee.setSalary(salary);

	    return true;
	}
	public boolean deleteEmployee(int id) {
		int index=-1;
		for(int i=0;i<employeeCount;i++) {
			if(employees[i].getId()==id) {
				index=i;
			}
		}
		for(int i=index;i<employeeCount;i++) {
			employees[i]=employees[i+1];
			
		}
		employees[employeeCount-1]=null;
		employeeCount--;
		return true;
	}

}
  
