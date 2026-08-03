package com.labtasks;

//Task 5: Quiz Application (Tricky)
//Create a class Quiz.
public class Quiz{
	String subjects;
	int totalQuestions;
	int timelimit;
	
Quiz(){
	this("java");
	System.out.println(subjects);
	
}
Quiz(String subjects){
	
	this(subjects,20,30);
	
}
Quiz(String subjects,int totalQuestions){
	this(subjects,totalQuestions,30);
	
}
Quiz(String subjects,int totalQuestions,int timelimit){
	this.subjects=subjects;
	this.totalQuestions=totalQuestions;
	this.timelimit=timelimit;
	
	
}
//	Constructors:
//	Quiz()
//	Quiz( subject)
//	Quiz( subject,  totalQuestions)
//	Quiz( subject,  totalQuestions,  timeLimit)
//	Requirement:
//	1.Every constructor must print a different message.
//	2.Use this() to chain all constructors.
//	3.Create only one object using the Noarg constructor and observe the execution order.

	public static void main(String[] args) {
		
		

	}

}
