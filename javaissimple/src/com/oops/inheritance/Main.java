package com.oops.inheritance;

//2.Create a Person class with name and age. Create a Student class that inherits from Person and adds collegeName.
class Person{
	String name;
	int age;
	
}
class Student extends Person{
	String collegeName;
	void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(collegeName);
	}
}
public class Main {

	public static void main(String[] args) {
		Car c=new Car();
		c.Start();
		c.drive();
		Student s=new Student();
		s.name="suresh";
		s.age=22;
		s.collegeName="vvc";
		s.display();
	}

}
