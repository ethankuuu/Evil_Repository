import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence to translate into Pig Latin:");
        String input = scanner.nextLine();

        String translatedSentence = translatePig(input);
        System.out.println("Pig Latin Translation: " + translatedSentence);
    }

    public static String translatePig(String sentence) {
        String translated = "";
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            if (Character.isWhitespace(c)) {
                if (word.length() > 0) {
                    translated += translateWord(word.toString()) + " ";
                    word.setLength(0);
                }
            } else {
                word.append(c);
            }
        }

        if (word.length() > 0) {
            translated += translateWord(word.toString()) + " ";
        }

        return translated.trim(); 
    }
    public static String translateWord(String word) {
        word = word.toLowerCase();
        char firstChar = word.charAt(0);

        if (isVowel(firstChar)) {
            return word + "way";
        } else {
            int consonant = getLength(word);
            if (consonant > 0) {
                return word.substring(consonant) + word.substring(0, consonant) + "ay";
            }
        }

        return word + "ay";
    }

    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    public static int getLength(String word) {
        int count = 0;
        while (count < word.length() && !isVowel(word.charAt(count))) {
            count++;
        }
        return count;
    }
}