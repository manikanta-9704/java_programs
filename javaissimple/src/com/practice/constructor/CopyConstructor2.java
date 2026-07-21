package com.practice.constructor;
class Employee1{
	int id;
	String name;
	double salary;
	String department;
	Employee1(int id,String name,double salary,String department){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.department=department;
		
	}
	Employee1(Employee1 update){
		this.id=update.id;
		this.name=update.name;
		this.salary=update.salary;
		this.department=update.department;
		
	}
	void show() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(department);
	}
}
public class CopyConstructor2 {

	
	public static void main(String[] args) {
		
		Employee1 e1=new Employee1(101,"mani",30000,"training");
		e1.show();
		Employee1 e2=new Employee1(e1);
		e2.salary=40000;
		e2.department="javadev";
		e2.show();
		
		

	}

}
