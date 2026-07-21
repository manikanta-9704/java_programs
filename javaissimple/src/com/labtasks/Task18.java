package com.labtasks;
//1.Product Details
//Create a class Product with:
class Product{
	int productId;
	String productName;
	double price;
	Product(){
		
	}
	Product(int productId,String productName,double price){
		this.productId=productId;
		this.productName=productName;
		this.price=price;
	}
	void display() {
		System.out.println("product id:"+productId);
		System.out.println("product name:"+productName);
		System.out.println("price:"+price);
	}
}
//productId
//productName
//price
//2.Use a parameterized constructor to initialize the fields.
//3.Create at least 3 Product objects and display their details.
public class Task18 {
	public static void main() {
	Product p1=new Product(101,"laptop",50000);
	p1.display();
	Product p2=new Product(102,"mouse",500);
	p2.display();
	Product p3=new Product(103,"keyboard",800);
	p3.display();
	}

}
