package com.labtasks;

public class Task9 {

	    static int x = 10;

	    static {
	        x = x + 10;
	    }

	    int y = x;

	    {
	        y += 10;
	        show();
	    }

	    Task9() {
	        y += 20;
	    }
	    void change()
	    {
	    	x=33;
	    }
	   void show() {
	    	y=21;
	    	
	    }

	    public static void main(String[] args) {

	        Task9 t1 = new Task9();
	        Task9 t2 = new Task9();
	        System.out.println(t1.y);
	        System.out.println(t2.y);
	        System.out.println(x);

	    }

	}

