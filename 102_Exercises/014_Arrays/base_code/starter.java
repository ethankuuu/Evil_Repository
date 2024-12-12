/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	int [] a = new int[1000];
	int b = 0;
	int c = 3;
	int y = 1000;
	while (b<1000){
		a[b] = c;
		System.out.println(a[b]);
		b++;
		c = c+3;
		
	}
	b = 0;
	while (b<1000){
		System.out.println(y);
		b++;
		y--;
	}
}
}
