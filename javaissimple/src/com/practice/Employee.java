package com.practice;

public class Employee {
	void emp_data() {
		var emp_id=101;
		var emp_name="raghu";
		var emp_joindate="12-11-16";
		var monthly_salary=5000;
		var anual_salary=monthly_salary*12;
		var bonus=(anual_salary/100)*10;

		var total_salary=anual_salary+bonus;
		
		System.out.println(emp_id);
		System.out.println(emp_name);
		System.out.println(emp_joindate);
		System.out.println(anual_salary);
		System.out.println(total_salary);
	}

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.emp_data();
		

	}

}
