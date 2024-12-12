/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman x = new Spiderman();
		x.setActor("Tobey Mcguire");
		x.setAge(49);
		x.setVillain("Green Goblin");
		
		Spiderman y = new Spiderman("Andrew Garfield", 41, "Electro");
		
		Spiderman z = new Spiderman("Tom Holland");
		z.setVillain("Doc Ock");
		z.setAge(10);
		
		Spiderman t = new Spiderman("Miguel", 120, "Spooderan");
		System.out.println("The Villain is " + y.getVillain());

		
	}
}
