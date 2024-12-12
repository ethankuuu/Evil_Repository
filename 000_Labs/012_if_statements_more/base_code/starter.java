/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number");
		int x = sc.nextInt();
		System.out.println("Input another number");
		int y = sc.nextInt();
		if(x==y){
			System.out.print("Your numbers are the same");
		}
		else{
			System.out.print("Your numbers are not the same");
		}
	}
}
