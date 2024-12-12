/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int money = 100; 

        System.out.println("You have entered the casino be ready to become a billionaire");

        while (money > 0) {
            System.out.println("You have $" + money + ". How much would you like to wager?");
            int wager = scanner.nextInt();


            while (wager < 1 || wager > money) {
                System.out.println("Invalid wager. Please wager an amount between 1 and " + money + ".");
                wager = scanner.nextInt();
            }


            int num1 = (int)(Math.random()*10);
            int num2 = (int)(Math.random()*10);
            int num3 = (int)(Math.random()*10);

            System.out.println("Rolling... " + num1 + " " + num2 + " " + num3);

            if (num1 == num2 && num2 == num3) {
                
                System.out.println("Jackpot. You tripled your wager.");
                money += wager * 2; 
            } else if (num1 == num2 || num2 == num3 || num1 == num3) {
                
                System.out.println("You win. You doubled your wager.");
                money += wager; 
            } else {
               
                System.out.println("You lost your wager.");
                money -= wager; 
            }

            
            if (money > 0) {
                System.out.println("Do you want to play again? (Yes/No)");
                String response = scanner.next();
                if (response.equalsIgnoreCase("no")) {
                    break;
                }
            }
        }

        
        System.out.println("Game over! You ended with $" + money + ".");
	}
	
}
