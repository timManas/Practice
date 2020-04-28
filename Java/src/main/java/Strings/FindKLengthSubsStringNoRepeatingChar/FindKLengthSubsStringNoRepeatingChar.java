package Strings.FindKLengthSubsStringNoRepeatingChar;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindKLengthSubsStringNoRepeatingChar {

    public static void main(String [] args) {
//        String S = "havefunonleetcode";     // efuno, funon
//        int K = 5;

        String S = "gdggdbjchgadcfddfahbdebjbagaicgeahehjhdfghadbcbbfhgefcihbcbjjibjdhfhbdijehhiabad";     // efuno, funon
        int K = 5;

        System.out.println("# Non Repeating Substring: " + numKLenSubstrNoRepeats(S, K));
    }

    public static int numKLenSubstrNoRepeats(String S, int K) {

        // Step1 - Create variable to return
        int count = 0;

        // Step2 - Create StringBuilder to host subString
        StringBuilder sb = new StringBuilder();

        // Step3 - Traverse Stirng 'S'
        for (int i=0; i < S.length(); i++) {

            // Step4 - Fetch each individual letter in S
            char letter = S.charAt(i);
            System.out.println("Current: " + sb.toString() + "      Letter: " + letter);

            // Step5 - Check if letter exists already in SubString
            // We delete ALL values up to existing letter + 1  ...
            // Why ? So we dont have to constantly check if there are repeating characters in substring
            // Otherwise, delete the first value in Substring (aka ... HEAD)
            if (sb.indexOf(String.valueOf(letter)) >= 0) {
                int index = sb.indexOf(String.valueOf(letter));
                sb.delete(0, index + 1);

            } else if (sb.length() >= K) {
                sb.deleteCharAt(0);
            }

            // Step6 - Append letter to SubString
            sb.append(letter);

            // Step7 - If the StringBuilder length is 5, we know it is UNIQUE
            if (sb.length() == K) {
                ++count;
                System.out.println("Count: " + count + "    SubString: " + sb.toString());
            }
        }

        return count;
    }
}

/**
 Solution
 - Not very easy .. Definitely medium
 - Idea is we use a moving window of K letters
 - Remove from the head and add to the tail
 - If we identify a letter which already exists, we REMOVE every letter UP UNTIL the Existing letter + 1
    Why ? To prevent us from having to constantly check each subString
 - Otherwise, we only delete the HEAD letter
 - We then add the new letter to the list
 - If we see the substring length is K, we increment count++

 */
