package com.practice.methods;
class Employee {

    int id;
    String name;
    double salary;
    String department;

    Employee(int id,
             String name,
             double salary,
             String department) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    void display() {

        System.out.println("-----------------------");
        System.out.println("ID         : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Salary     : " + salary);
        System.out.println("Department : " + department);
    }
}
class Factoryclass{
	Employee factorymethod(int id,String name) {
		String department="training";
	    double	salary=30000;
	
		return new Employee(id,name,salary,department);
	}
}

public class FactoryMethod {

	public static void main(String[] args) {
		Factoryclass factory=new Factoryclass();
		Employee e1=factory.factorymethod(101,"sunil");
		e1.display();

	}

}
