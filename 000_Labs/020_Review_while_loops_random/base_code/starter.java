import java.util.Scanner;
import java.util.Random;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Random rand = new Random();
        int a = rand.nextInt(0,1000); 
        System.out.println("Hello input a number 0-999: ");
        int b = sc.nextInt();
        while(b != a){
        	System.out.println("Try again: ");
        	b = sc.nextInt();
        }
        System.out.println("You got it right congratulations check your bank account i just wired you $100,000");
    }
}