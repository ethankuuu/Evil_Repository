/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What role do you want? Wizard, Rogue,or Warrior");
		String role = sc.nextLine();

		if (role.equals("Wizard")){
			System.out.println("You chose Wizard");
		}
		else if (role.equals("wizard")){
			System.out.println("You chose Wizard");
		}
		else{
			if(role.equals("Rogue")){
				System.out.println("You chose Rogue");
			}
			else if(role.equals("rogue")){
				System.out.println("You chose Rogue");
			}
			else if(role.equals("Warrior")){
				System.out.println("You chose Warrior");
			}
			else if(role.equals("w")){
				System.out.println("You chose Warrior");
			}
			else{
				System.out.println("You had a typo please try again");
			}
		
		}
	}
}
