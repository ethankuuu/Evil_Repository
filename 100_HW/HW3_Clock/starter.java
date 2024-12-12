/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What day is it 0 = Sunday, 1 = Monday etc");
		int day = sc.nextInt();
		if(day == 0 ){
			System.out.println("It is a weekend, you need to wakeup at 10:00 am");
		}
		if (day>0){
			if (day<7){
				System.out.println("It is a weekday, you need to wake up by 7:00am");
			}
			if(day == 7){
				System.out.println("It is a weekend, you need to wake up by 10:00");
			}
		}
}
}
