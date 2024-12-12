import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String a = sc.nextLine();

        String word = "";
        String bkwrdSentence = "";

        for (int i = 0; i < a.length(); i++) {
            if (a.substring(i, i + 1).equals(" ")) {
  
                bkwrdSentence = word + " " + bkwrdSentence;
                word = ""; 
            } else {
                word = word + a.substring(i, i + 1);
            }
        }


        bkwrdSentence = word + " " + bkwrdSentence;

        System.out.println(bkwrdSentence);
    }
}