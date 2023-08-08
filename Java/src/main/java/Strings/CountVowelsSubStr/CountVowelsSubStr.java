package Strings.CountVowelsSubStr;

import java.util.Set;
import java.util.TreeSet;

public class CountVowelsSubStr {
    public static void main(String [] args) {
        // "aeiouu","unicornarihan","cuaieuouac"
        String [] input = {"aeiouu","unicornarihan","cuaieuouac"};
        for (String i : input) {
            System.out.println("# Vowel Substr: " + countVowelSubstrings(i) + "\n");
        }
    }

    public static int countVowelSubstrings(String word) {
        int count = 0;
        System.out.println("word: " + word);

        // Step 1 Create set to keep track of letter
        Set<Character> set = new TreeSet<>();
        StringBuilder sb;

        // Step1 - Traverse from start to end letter by letter
        for (int x=0; x < word.length() - 1; x++) {
            set.clear();
            sb = new StringBuilder();

            char start = word.charAt(x);
            System.out.println("start: " + start);

            // Step3 - If we encounter non-vowel, we start again
            if (start != 'a' && start != 'e' && start != 'i' && start != 'o' && start != 'u') {
                continue;
            }

            // Step4 - Add start to set
            set.add(start);
            sb = sb.append(start);

            // Step5 - Traverse start + 1, until we get to the end
            for (int y=x+1; y < word.length(); y++) {
                char current = word.charAt(y);
//                System.out.println("    current: " + current);

                if (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u') {
                    set.add(current);
                    sb = sb.append(current);

                    if (set.size() == 5) {
                        count++;
                        System.out.println("    str: " + sb.toString());
                    }
                } else {
                    break;        // Step6 - If we encounter non-vowel, we start again

                }
            }
        }



        return count;
    }
}
