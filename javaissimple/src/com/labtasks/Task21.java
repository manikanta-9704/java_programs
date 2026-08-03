package com.labtasks;
//Create a class Student with the following constructors:int id;

class Student{
	int id;
	String name;
	String cource;
	Student(int id,String name,String cource){
		this();
		
		
		this.cource=cource;
		
	}
	Student(int id,String name){
		
		this(id);
		this.name=name;
	}
	Student(int id){
		this.id=id;
	}

Student(){
	
	System.out.println(id);
	System.out.println(name);
	System.out.println(cource);
	
}

}
public class Task21 {
Task21(){
	
}
	public static void main(String[] args) {
		Student s1=new Student(101,"mani","jfs");
		Student s2=new Student(101,"mani");

	}

}
