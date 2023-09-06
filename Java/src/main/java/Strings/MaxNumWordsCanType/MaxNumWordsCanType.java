package Strings.MaxNumWordsCanType;

public class MaxNumWordsCanType {
    public static void main(String [] args) {
        String text = "hello world";
        String brokenLetters = "ad";
        System.out.println("canBeType: " + canBeTypedWords(text,  brokenLetters) + "\n");

        String text1 = "leet code";
        String brokenLetters1 = "lt";
        System.out.println("canBeType: " + canBeTypedWords(text1,  brokenLetters1) + "\n");

        String text2 = "leet code";
        String brokenLetters2 = "e";
        System.out.println("canBeType: " + canBeTypedWords(text2,  brokenLetters2) + "\n");
    }

    public static int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        String [] textArr = text.split(" ");
        String [] lettersArr = brokenLetters.split("");

        if (brokenLetters.length() == 0) return textArr.length;

        // Step1 - Check every word
        wordLoop:
        for (int i=0; i<textArr.length; i++) {
            String word = textArr[i];
            System.out.println("word: " + word);

            // Step2 - Check if letters are in word..move onto next if present
            for (int j=0; j<lettersArr.length; j++) {
                String letter = lettersArr[j];
                System.out.println("    letter: " + letter);
                if (word.contains(letter)) {
                    continue wordLoop;
                }

            }

            count++;

        }


        return count;
    }
}
