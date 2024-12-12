/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf[] a = new PooleDwarf[7];
		for (int i = 0; i < a.length; i++) {
            a[i] = new PooleDwarf(randName(),0); 
        }
        
        System.out.println("Dwarf names:  ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].getName());
        }
        int dupeCount = 0;
        for (int i = 0; i < a.length; i++){
        	for (int j = i+1; j < a.length; j++){
        		if (a[i].getName().equals(a[j].getName())) {
        			dupeCount++;
        			System.out.println (a[i].getName());
        		}
        	}
        }
        
        System.out.println(dupeCount);
	}
}
