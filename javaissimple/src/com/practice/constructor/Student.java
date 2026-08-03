package com.practice.constructor;
//Create a Student class.
//
//Fields:
//
//studentId
//name
//cgpa
//course
//
//Requirements:
//
//Create one student.
//Create another student using the copy constructor.
//Change only the copied student's course and CGPA.
//Verify that the original student remains unchanged.

public class Student {
	int id;
	String name;
	double cgpa;
	String course;
	Student(int id,String name,double cgpa,String course){
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;
		this.course=course;
	}
	Student(Student s){
		this.id=s.id;
		this.name=s.name;
		this.cgpa=s.cgpa;
		this.course=s.course;
	}
	void show() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(course);
		System.out.println(cgpa);
		System.out.println("***********");
	}

	public static void main(String[] args) {
		Student s1=new Student(101,"A",9.9,"jfs");
		s1.show();
		Student s2=new Student(s1);
		s2.cgpa=9.5;
		s2.course="pfs";
		s2.show();
		s1.show();
		
	

	}

}
