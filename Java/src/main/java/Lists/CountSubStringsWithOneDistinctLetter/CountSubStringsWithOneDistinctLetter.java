package Lists.CountSubStringsWithOneDistinctLetter;

import java.util.HashSet;

public class CountSubStringsWithOneDistinctLetter {

    public static void main(String [] args) {
//        String input = "aaaba";
        String input = "aaaaaaaaaa";
        System.out.println("Count: " + countLetters(input));
    }

    public static int countLetters(String S) {

        int count = 0;
        HashSet<Character> set = new HashSet<Character>();

        char prevLetter = 0;
        // Traverse Set
        for (int i=0; i < S.length(); i++) {
            char letter = S.charAt(i);

            int index = i;
            while (index < S.length()) {
                char target = S.charAt(index);
                set.add(target);

                if (set.size() == 1) {
                    ++count;
                } else {
                    set.clear();
                    break;
                }


                index++;
            }
        }

        return count;
    }
}

/**
 Solution
 - Is messy ...runtime is O(n^2)
 - The idea is to keep two pointers
 - One pointer to traverse the String , letter by letter
 - Another point to traverse from pointer 1 till the End of the String
    OR
    Till the set has multiple values (therefore not distinct) anymore

 */
