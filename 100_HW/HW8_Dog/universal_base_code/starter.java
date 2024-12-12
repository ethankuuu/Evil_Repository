/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog y = new Dog("Michael");
		y.setAge(12);
		Dog x = new Dog("Reed", "Boxer");
		if (y.isSleeping()){
			y.bark();
			x.bark();
		}
		else{
			System.out.println("The dog is asleep");
		}
		



	}
}
