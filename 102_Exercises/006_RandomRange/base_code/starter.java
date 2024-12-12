/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number");
		double x = sc.nextDouble();
		System.out.println("Input another number");
		double y = sc.nextDouble();
		System.out.println(Math.random()*(y-x));
	}
}
