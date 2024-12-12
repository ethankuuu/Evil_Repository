/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intput a number thanks");
		int num1 = sc.nextInt();
		System.out.println("Input another number or else");
		int num2 = sc.nextInt();
		if(num1%2 == 0){
			if(num2%2 == 0){
				System.out.println("Both numbers are divisible by 2 congratulations");
				
			}
			else{
				System.out.println("The first number was divisible by 2, but the second isnt");
			}
		}
		else{
			if(num2%2 ==0){
				System.out.println("The first number is divisible by 2, the second isnt");
				
			}
			else{
				System.out.println("Neither number is divisible by 2");
			}
		}
		
		
		if(num1%3 == 0){
			if(num1%4 == 0){
				if(num1%4 == 0){
					if(num2%3 == 0){
						if(num2%4 == 0 ){
							if(num2%5 == 0){
								System.out.println("Both numbers are divisible by 3, 4, and 5, congratulations");
							}
							else{
								System.out.println("Both numbers are not divisible by 3, 4, and, 5");
							}
						}
						else{
								System.out.println("Both numbers are not divisible by 3, 4, and, 5");
							}
					}
					else{
								System.out.println("Both numbers are not divisible by 3, 4, and, 5");
							}
				}
				else{
								System.out.println("Both numbers are not divisible by 3, 4, and, 5");
							}
			}
			else{
								System.out.println("Both numbers are not divisible by 3, 4, and, 5");
							}
		}
		else{
								System.out.println("Both numbers are not divisible by 3, 4, and, 5");
							}
	}
}
