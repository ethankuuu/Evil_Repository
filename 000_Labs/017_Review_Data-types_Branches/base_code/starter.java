import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

//NAME

		System.out.println("Hello mate what is your name?");
		String name = sc.nextLine();
		System.out.println("What is your title?");
		String title = sc.nextLine();

//ROLES

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
		
//SKILLS

		int points = 20;
		int Strength = 0;
		int Dexterity = 0;
		int Intelligence = 0;
		int Charisma = 0;
		System.out.println("You have a total of 20 points and you can put them into the skills: Strength, Dexterity, Intelligence, or Charisma. Each has a limit of 10 points each.");
		while(points >0){
			System.out.println("What skill would you like your skill points to go into?");
			String point = sc.nextLine();
			if(point.equals("Strength")){
				 if (Strength < 10 && points > 0) {
                        Strength = Strength+ 1;
                        points = points - 1;
                        System.out.println("Strength increased to " + Strength + ". Points left: " + points);
                    } else {
                        System.out.println("Cannot increase Strength further or no points left.");
                    }
			}
            if(point.equals("Dexterity")){
				 if (Dexterity < 10 && points > 0) {
                        Dexterity = Dexterity+ 1;
                        points = points - 1;
                        System.out.println("Dexterity increased to " + Dexterity + ". Points left: " + points);
                    } else {
                        System.out.println("Cannot increase Dexterity further or no points left.");
                    }
            }
            if(point.equals("Intelligence")){
				 if (Intelligence < 10 && points > 0) {
                        Intelligence = Intelligence+ 1;
                        points = points - 1;
                        System.out.println("Intelligence increased to " + Intelligence + ". Points left: " + points);
                    } else {
                        System.out.println("Cannot increase Intelligence further or no points left.");
                    }
            }
            if(point.equals("Charisma")){
				 if (Strength < 10 && points > 0) {
                        Charisma = Charisma+ 1;
                        points = points - 1;
                        System.out.println("Charisma increased to " + Charisma + ". Points left: " + points);
                    } else {
                        System.out.println("Cannot increase Charisma further or no points left.");
                    }
			}
		}
//END
	System.out.println("Your name is: " + name + ". \nYour title is: " + title + "\nYour role is:" + role + "\nYour stats are : Charisma " + Charisma + ", Strength " + Strength + ", Intelligence " + Intelligence + ", and Dexterity: " + Dexterity +".");
	}
}
