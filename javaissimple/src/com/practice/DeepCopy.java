package com.practice;
class Location{
	String city;

	public Location(String city) {
		this.city = city;
	}
	
}
class Student implements Cloneable{
	int id;
	String name;
	Location loc;
	public Student(int id, String name, Location loc) {
		this.id = id;
		this.name = name;
		this.loc = loc;
	}
	Student(Student s1){
		this.id=s1.id;
		this.name=s1.name;
		this.loc=new Location(s1.loc.city);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class DeepCopy  {

	public static void main(String[] args) throws CloneNotSupportedException {
	Location l1=new Location("hyd");
	Student s1=new Student(101,"mani",l1);
	System.out.println(s1.id);
	System.out.println(s1.name);
	System.out.println(s1.loc.city);
	System.out.println("**********************");
Student s2=new Student(s1);
s2.loc.city="kphb";
System.out.println(s1.id);
System.out.println(s1.name);
System.out.println(s1.loc.city);
System.out.println("**********************");
System.out.println(s2.id);
System.out.println(s2.name);
System.out.println(s2.loc.city);
	}

}
