/* 
    Lecture note example - Classes
*/
import pkg.*;
import java.util.*;

class LectureClass{
    public static void main(String args[]) {
        Cow bob = new Cow();
        Cow betsy = new Cow (197,"Orange", true);
        
        System.out.println(bob.getFlavor());
        System.out.println(betsy.getFlavor());
        bob.moo();
        betsy.moo();

	}
}