import java.util.*;


class starter {
	public static void main(String args[]) {
	int [] arr = new int[20];
	
	
	for(int i = 0;i < arr.length;i++){
		arr[i] = (int)((Math.random()*10)+1);
	}
	int randNum = (int)(Math.random()*10)+1;
	System.out.println("The random number is " + randNum);
	
	
	int  numDuplicates = 0;
	for(int i = 0;i<arr.length;i++){
		if (arr[i] == randNum){
			numDuplicates++;
			System.out.println("There is a duplicate at array: "+ i + ".\nThere is a total of " + numDuplicates);
			if (arr[i+1] == randNum){
				System.out.println("There is two duplicates in a row");
			}

		}
		
	
	}
	}
}
