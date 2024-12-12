package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	public Spiderman(){
		actor = "Unknown";
		age = 0;
		villain = "Unknown";
	}

	public Spiderman(String a){
		actor = a;
		age = 0;
		villain = "Unkown";
	}
	public Spiderman (int b){
		actor = "Unknown";
		age = b;
		villain = "Unkown";
	}
	public Spiderman(String a, int b){
		actor = a;
		age = b;
		villain = "Unkown";
	}
	public Spiderman(String a, int b, String c){
		actor = a;
		age = b;
		villain = c;
	}
	
	
	
	public void setVillain(String c){
		villain = c;
	}
	public void setAge(int b){
		age = b;
	}
	public void setActor(String a){
		actor = a;
	}
	public String getVillain (){
		return villain;
	}
	public String getActor(){
		return actor;
	}
	public int getAge(){
		return age;
	}
	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
