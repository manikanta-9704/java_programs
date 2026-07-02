package com.labtasks;

public class Task7 {
	static int count;
	static {
		System.out.println("nothing here😁😁😁");
	}
	
	Task7(){
		count+=1;
		System.out.println("object"+count);
	}

	public static void main(String[] args) {
	Task7 t1 = new Task7();
	Task7 t2 = new Task7();
	Task7 t3 = new Task7();

	}

}
