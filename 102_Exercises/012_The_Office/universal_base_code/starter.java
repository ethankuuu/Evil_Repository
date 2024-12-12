/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee dwight = new Employee(1987,"Dwight","Schrute", 446688.16);
		dwight.employeeToString();
		Employee jim = new Employee(2474,"Jim","Halpert",4416.66);
		jim.employeeToString();
		Employee pam = new Employee(2011,"Pam","Beesly",2250.0);
		pam.employeeToString();
	}
}
