/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a string to be encoded");
		String a = sc.nextLine();
		
		System.out.println("Youre secret message is:" + (Cipher.encode(a)));

	}
}
