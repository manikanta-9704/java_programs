package com.POC;

public class Login {
	void login(String name,String password) {
		if(name.equalsIgnoreCase("manikanta")) {
			if(password.equalsIgnoreCase("12345")) {
				System.out.println("log in successfull😊😊");
				System.out.println("welcome");
			}
		}else {
			System.out.println("invalid credintials");
		}
		
	}
	

}
