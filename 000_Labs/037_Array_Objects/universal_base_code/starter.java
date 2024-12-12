import pkg.*;
import java.util.*;

class starter {
    public static void main(String args[]) {
        Warrior[] warriors = new Warrior[100];
        for (int i = 0; i < warriors.length; i++) {
            warriors[i] = new Warrior();
        }

        Wizard[] wizards = new Wizard[100];
        for (int i = 0; i < wizards.length; i++) {
            wizards[i] = new Wizard();
        }

        int deaths = 0;
        int deadWarriors = 0;
        int deadWizards = 0;
        int warrior = 0;
        int wizard = 0;
        String winner;

        while (deaths < 198) {
            while (wizard != wizards.length - 1 && warrior != warriors.length - 1) {
                wizards[wizard].attack(warriors[warrior]);
                if (warriors[warrior].isDead()) {
                    deaths++;
                    deadWarriors++;
                    warrior++;
                }

                warriors[warrior].attack(wizards[wizard]);
                if (wizards[wizard].isDead()) {
                    deaths++;
                    deadWizards++;
                    wizard++;
                }
            }
            break;
        }

        while (deadWizards != 100 && deadWarriors != 100) {
            wizards[wizard].attack(warriors[warrior]);
            if (warriors[warrior].isDead()) {
                deaths++;
                deadWarriors++;
                if (deadWarriors != 100) {
                    warrior++;
                }
            }

            warriors[warrior].attack(wizards[wizard]);
            if (wizards[wizard].isDead()) {
                deaths++;
                deadWizards++;
                if (deadWizards != 100) {
                    wizard++;
                }
            }
        }

        winner = (deadWarriors > deadWizards) ? "Wizards" : "Warriors";

        System.out.println("-----------------------------------");
        System.out.println("     " + winner + " won");
        System.out.println("-----------------------------------");
        System.out.println("\n      RESULTS");
        System.out.println("-----------------------------------");
        System.out.println("  Victor: " + winner);
        System.out.println("-----------------------------------");
        System.out.println("      Wizard(s) Left Alive: " + (100 - deadWizards));
        System.out.println(" Wizard Deaths: " + deadWizards);
        System.out.println("-----------------------------------");
        System.out.println("      Warrior(s) Left Alive: " + (100 - deadWarriors));
        System.out.println(" Warrior Deaths: " + deadWarriors);
        System.out.println("-----------------------------------");
        System.out.println(" Total Deaths: " + deaths);
        System.out.println("-----------------------------------");

    }
}
