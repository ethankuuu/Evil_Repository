/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;
class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a name");
        String name = sc.nextLine();
        System.out.println("Hello " +name);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        System.out.println("Enter another number");
        int num2 = sc.nextInt();
        System.out.println("The sum of the numbers you have entered is " + num1+num2 );
	}
}