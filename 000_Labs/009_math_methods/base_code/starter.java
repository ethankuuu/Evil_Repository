/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number");
		int x = sc.nextInt();
		System.out.println("Input another number");
		int y = sc.nextInt();
		System.out.println(Math.max(x,y));
		System.out.println(Math.sqrt(y));
		System.out.println(Math.pow(x,y));
		
	}
}
