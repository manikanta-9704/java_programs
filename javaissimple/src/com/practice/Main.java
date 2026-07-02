package com.practice;

public class Main {
	static int college_id = 100;
	static String college_name = "unknown";
	void main() {
		Students s1 = new Students();
		Students s2 = new Students();
		Students s3 = new Students();
		Students s4 = new Students();
		s1.std_name="mani";
		s2.std_name="lucky";
		s3.std_name="karthik";
		s4.std_name="sunil";
		s1.std_show();
		s2.std_show();
		s3.std_show();
		s4.std_show();
		College.clg_show();
		Cource.cource_show();
	}

}
