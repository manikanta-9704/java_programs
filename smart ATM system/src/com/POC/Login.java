package com.POC;

public class Login {

	
	boolean login(String name,String password) {
		boolean flag=false;
		if(name.equalsIgnoreCase("manikanta")) {
			if(password.equalsIgnoreCase("12345")) {
				System.out.println("log in successfull😊😊");
				System.out.println("welcome");
				flag=true;
			}
		}else {
			System.out.println("invalid credintials");
		}
		return flag;
		
	}
	
		}

