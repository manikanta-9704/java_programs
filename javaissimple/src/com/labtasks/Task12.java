package com.labtasks;
//1.Write a Java program to store the following product details using appropriate wrapper object types:

public class Task12 {
	Long product_id=4858509498568l;
	String product_name="abcd";
	Double product_price=666d;
	Byte product_rating=4;
	Boolean availability=true;
	Integer quantity=7;
    Float discount=10f;
    Integer product_code=789;
    void show() {
    	System.out.println("product id:"+product_id);
    	System.out.println("product name:"+product_name);
    	System.out.println("product_price"+product_price);
    	System.out.println("product_rating:"+product_rating);
    	System.out.println("availability:"+availability);
    	System.out.println("quantity:"+quantity);
    	System.out.println("product_code:"+product_code);

    }
	public static void main(String[] args) {
	Task12 p1 = new Task12();
	p1.show();

	}

}
