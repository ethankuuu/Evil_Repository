/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	String role;
	int Strength;
	int Dexterity;
	int Intelligence;
	int Charisma;

	public BaseClass() {
		String role = "No Role";
		int Strength = 0;
		int Dexterity = 0;
		int Intelligence = 0;
		int Charisma = 0;
	}

	public void myToString(){
		System.out.println("Your role is: " + role);
		System.out.println("Your strength is " + Strength);
		System.out.println("Your dexterity is " + Dexterity);
		System.out.println("Your intelligence is " + Intelligence);
		System.out.println("Your charisma is " + Charisma);
	}
}

