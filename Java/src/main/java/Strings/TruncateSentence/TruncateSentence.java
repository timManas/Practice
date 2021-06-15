package Strings.TruncateSentence;

public class TruncateSentence {
    public static void main(String [] args) {
        String input = "What is the solution to this problem";
        int k = 4;

        System.out.println("Truncate Sentence: " + truncateSentence(input, k));
    }

    public static String truncateSentence(String sentence, int k) {
//        // Solution 1 - Use Split
//        String [] words = sentence.split(" ");
//        StringBuilder sb = new StringBuilder();
//        for (int i=0; i < k; i++) {
//            sb.append(words[i] + " ");
//        }


        // Solution2 - Just traverse String
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (int i=0; i < sentence.length(); i++) {
            char letter = sentence.charAt(i);
            if (letter == ' ') {
                ++counter;
                if (counter == k)
                    break;

            }
            sb.append(letter);
        }

        return sb.toString().trim();
    }
}
