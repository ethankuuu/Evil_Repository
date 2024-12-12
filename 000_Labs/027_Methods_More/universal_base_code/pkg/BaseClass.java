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
        role = "No Role";
        Strength = 0;
        Dexterity = 0;
        Intelligence = 0;
        Charisma = 0;
    }

    public void myToString() {
        System.out.println("Your role is: " + role);
        System.out.println("Your strength is: " + Strength);
        System.out.println("Your dexterity is: " + Dexterity);
        System.out.println("Your intelligence is: " + Intelligence);
        System.out.println("Your charisma is: " + Charisma);
    }

    public void setRole(String a) {
        if (a.equals("Warrior") || a.equals("Mage") || a.equals("Rogue")) {
            role = a;
        } else {
            role = "No Role";
        }
    }

    public void setStrength(int a) {
        if (a > 0) 
            Strength = a;
    }

    public void setDexterity(int a) {
        if (a > 0) 
            Dexterity = a;
    }

    public void setIntelligence(int a) {
        if (a > 0) 
            Intelligence = a;
    }

    public void setCharisma(int a) {
        if (a > 0) 
            Charisma = a;
    }

    public boolean setAll(String a, int b, int c, int d, int e) {
        if (a.equals("Warrior") || a.equals("Mage") || a.equals("Rogue")) {
            role = a;
            if (b > 0) Strength = b;
            if (c > 0) Dexterity = c;
            if (d > 0) Intelligence = d;
            if (e > 0) Charisma = e;
            return true;
        }
        else {
            role = "No Role";
            return false;
        }
    }