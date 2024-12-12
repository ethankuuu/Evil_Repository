/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Enter a string you would like to convert to Spongebob case: ");
		String words = sc.nextLine();
		String letter;
		Boolean capOrNah = true;
		String result = "";
		for(int i = 0; i< words.length() ; i++){
			letter = (words.substring(i, i+1));
			if (capOrNah){
				result = result + letter.toLowerCase();
				capOrNah = false;
			}
			else{
				result = result + letter.toUpperCase();
				capOrNah = true;
			}
		
		}
		
		System.out.println(result);
	}
}
