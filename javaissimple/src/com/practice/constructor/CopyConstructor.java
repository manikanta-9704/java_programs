package com.practice.constructor;

class Employee {

    int id;
    String name;
    double salary;
    String department;

    // Parameterized Constructor
    Employee(int id,
             String name,
             double salary,
             String department) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Copy Constructor
    Employee(Employee update) {

        this.id = update.id;
        this.name = update.name;
        this.salary = update.salary;
        this.department = update.department;
    }
    void display() {

        System.out.println("-------------------------");
        System.out.println("ID         : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Salary     : " + salary);
        System.out.println("Department : " + department);
    }
}
public class CopyConstructor {

	public static void main(String[] args) {
		  Employee emp1 =
	                new Employee(
	                        101,
	                        "Rahul",
	                        25000,
	                        "Training");

	        Employee emp2 =
	                new Employee(emp1);

	        emp2.name = "Manikanta";
	        emp2.salary = 40000;

	        System.out.println("Original Employee");
	        emp1.display();

	        System.out.println("Copied Employee");
	        emp2.display();
		

	}

}
