package com.labtasks;

public class Task6 {
	String employ_name;
    float salary;
   /* Task6(String employ_name,int salary) {
    	this.employ_name=employ_name;
    	this.salary=salary;
    	System.out.println(employ_name);
    	System.out.println(salary);
    }*/
    {
    	System.out.println("hello");
    }
    void show() {
    	System.out.println("nothing here");
    	Task6 t2=new Task6();
    	t2.show();
    }
    public static void main() {
    	Task6 t1 = new Task6();
    	t1.show();
    
    }

}
