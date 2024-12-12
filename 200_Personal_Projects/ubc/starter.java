/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void main(String args[]) {
		BaseClass base = new BaseClass();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numCorrect= 0;
        
        System.out.println("This is the lyric guessing game");
        boolean playAgain = true;

        while (playAgain) {

            int songIndex = random.nextInt(base.songs.length);
            String songLyrics = base.lyrics[songIndex];

            int startIndex = random.nextInt(songLyrics.length() - 50); 
            int endIndex = Math.min(startIndex + 50, songLyrics.length());
            String randomLyrics = songLyrics.substring(startIndex, endIndex);

            System.out.println("Guess the song from these lyrics:");
            System.out.println(randomLyrics );
            System.out.print("Your guess: ");
            String guess = scanner.nextLine();

            if (guess.equals(base.songs[songIndex])) {
                System.out.println("Correct The song is: " + base.songs[songIndex]);
                numCorrect++;
                System.out.println ("---------------------------");
                
            } else {
                System.out.println("Wrong The correct answer is: " + base.songs[songIndex]);
                System.out.println ("---------------------------");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.nextLine();
            playAgain = response.equals("yes");
        }

        System.out.println("Thanks for playing, you got "+ numCorrect+ "right." );
        

		
	}
}
