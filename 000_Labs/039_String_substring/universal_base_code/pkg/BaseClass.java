/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
    public BaseClass() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Input a string: ");
        String input = sc.nextLine();
        

        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.substring(i,i+1));
        }
       
    }
}