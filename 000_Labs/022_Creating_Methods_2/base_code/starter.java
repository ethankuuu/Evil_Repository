/*
 * Author:  
 * Date: 
*/

import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, input a base number (x):");
        int x = sc.nextInt(); 
        System.out.println("Hello, input an exponent (y):");
        int y = sc.nextInt(); 

        int result = pow(x, y);
        System.out.println(x + "^" + y + " is: " + result);
    }


    public static int pow(int x, int y) {
        int result = 1;

        for (int i = 0; i < y; i++) {
            result *= x;
        }

        return result;
    }
}
