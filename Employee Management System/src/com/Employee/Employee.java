package com.Employee;

public class Employee {
private  int id;
private String name;
private String gender;
private String department;
private String designation;
private double salary;
Employee(){
	
}
Employee(int id,String name,String gender,String department,String designation,double salary){
	this.id=id;
	this.name=name;
	this.gender=gender;
	this.department=department;
	this.designation=designation;
	this.salary=salary;
}
public void setId(int id) {
	this.id=id;
}
public int getId() {
	return id;
}
public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}
public void setGender(String gender) {
	this.gender=gender;
}
public String getGender() {
	return gender;
}
public void setDepartment(String department) {
	this.department=department;
}
public String getDepartment() {
	return department;
}
public void setDesignation(String designation) {
	this.designation=designation;
}
public String getDesignation() {
	return designation;
}
public void setSalary(double salary) {
	if(salary>0) {
	this.salary=salary;
	}else {
		System.out.println("salary is invalid");
	}
}
public double salary() {
	return salary;
}
void display(){
	System.out.println("employee id:"+id);
	System.out.println("employee name:"+name);
	System.out.println("gender:"+gender);
	System.out.println("department:"+department);
	System.out.println("designation:"+designation);
	System.out.println("salary:"+salary);
}

}