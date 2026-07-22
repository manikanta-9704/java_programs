package com.labtasks;
import java.util.Scanner;
//1.Cricket Player Statistics
//Create a class CricketPlayer with the following data members:
class Cricketer{
	String playerName;
	int matchesPlayed;
	int totalRuns;
	Cricketer(String playerName,int matchesPlayed,int totalRuns){
		this.playerName=playerName;
		this.matchesPlayed=matchesPlayed;
		this.totalRuns=totalRuns;
	}
	//Create a method to calculate and display the average runs per match using the formula:
	//Average Runs = Total Runs / Matches Played
	void calculateRuns() {
		int averageRuns=totalRuns/matchesPlayed;
		System.out.println("average runs:"+averageRuns);
		
	}
	
}
//Player Name
//Matches Played
//Total Runs
//Initialize all the values using an argument (parameterized) constructor.

//Read the values using the Scanner class, create an object by passing the values to the constructor, and display all the player details along with the average runs.



public class Task19 {
	static Scanner sc=new Scanner(System.in);
	static void main() {
		System.out.println("enter player name");
		String name=sc.nextLine();
		System.out.println("enter matches played");
		int matches=sc.nextInt();
		System.out.println("enter runs");
		int runs=sc.nextInt();
		Cricketer p1=new Cricketer(name,matches,runs);
		p1.calculateRuns();
	}

}

