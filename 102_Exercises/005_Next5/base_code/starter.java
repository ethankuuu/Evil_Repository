/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Hello enter a number.");
	        int num = sc.nextInt();
	        System.out.println("The next 5 numbers are");
	        System.out.print(num + 1 + ", ");
	        System.out.print(num + 2 + ", ");
	        System.out.print(num + 3 + ", ");
	        System.out.print(num + 4 + ", ");
	        System.out.println(num + 5 + ", ");
	        System.out.println("The next 5 multiples of this number are");
	        System.out.print(num*2 + ", ");
	        System.out.print(num*3 + ", ");
	        System.out.print(num*4 + ", ");
	        System.out.print(num*5 + ", ");
	        System.out.println(num*6 + ", ");
	        System.out.println("The number divided by 100 is");
	        System.out.println(num/100);
	        System.out.println("The number divided by 10 is");
	        System.out.println(num/10);
	}
}
