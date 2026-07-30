package com.practice.constructor;
//Create a Student class.;
//
//Create another class:
//
//class Address{
//    String city;
//    String state;
//    String pincode;
//}
//Requirements
//Parameterized constructor.
//Copy constructor.
//display() method.
//After copying,
//student2.address.city = "Hyderabad";
//
//Student1's city must remain unchanged.
//
//Expected
//
//Student1
//Raj
//Rajahmundry
//
//Student2
//Raj
//Hyderabad
//
//Concept Tested
//Deep Copy
//Nested Objects

public class CopyConstructor3 {
	int id;
	String name;
	double cgpa;
	Address address;
	class Address{
		String city;
		String street;
		String pincode;
		Address(String city,String street,String pincode){
			this.city=city;
			this.street=street;
			this.pincode=pincode;
		}
		Address(Address addres){
			this.city=addres.city;
			this.street=addres.street;
			this.pincode=addres.pincode;
			
		}
		
	}
	CopyConstructor3(int id,String name,double cgpa,Address adress){
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;
		this.address=new Address(adress);
		
	}
	CopyConstructor3(CopyConstructor3 c1){
		this.id=c1.id;
		this.name=c1.name;
		this.cgpa=c1.cgpa;
		this.address=c1.address;
		
	}
	void show() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(cgpa);
		System.out.println(address);
	}

	

	void main(String[] args) {
		Address addres=new Address("hyderabad","kphb","59000");
		CopyConstructor3 s1=new CopyConstructor3(101,"mani",9.9,addres);
		s1.show();
		CopyConstructor3 s2=new CopyConstructor3(s1);
		s2.id=102;
		s2.name="john";
		s2.show();
	

	}

}
