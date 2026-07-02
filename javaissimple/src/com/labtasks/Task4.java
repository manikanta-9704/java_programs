package com.labtasks;
//1. Create a class named CricketPlayer.
public class Task4 {
	//2. Declare a static variable teamName common to all players.
	static String team_name = "csk";  //here team name(static) is same for every object 
	//3. Declare instance variables playerName and runs.
	String player_name;
	int runs;
	void show() {
		System.out.println("team name:"+team_name);
		System.out.println("player name:"+ player_name);
		System.out.println("scored runs"+runs);
	}
public static void main() {
	//4. Create two objects using object references.
Task4 p1=new Task4();
/*p1.team_name = "lsg";    we can access static variable using object 
 but it effects to all the objects*/
p1.player_name="msd";
p1.runs=95;
p1.show();
Task4 p2=new Task4();
p2.player_name="ayush";
p2.runs=50;
p2.show();

//5. Assign values to the instance variables through the objects ref. 

//6. Display the details of both players.

//7. Show that the static variable is shared by all objects, while the instance variables store different values for each object.
}
}
