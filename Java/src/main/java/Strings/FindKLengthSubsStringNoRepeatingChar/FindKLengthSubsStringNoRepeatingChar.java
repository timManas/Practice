package Strings.FindKLengthSubsStringNoRepeatingChar;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindKLengthSubsStringNoRepeatingChar {

    public static void main(String [] args) {
        String S = "havefunonleetcode";
        int K = 5;
        System.out.println("# Non Repeating Substring: " + numKLenSubstrNoRepeats(S, K));
    }

    public static int numKLenSubstrNoRepeats(String S, int K) {
        int count = 0;

        Set<Integer> set = new LinkedHashSet<>();

        for (int i=0; i < S.length(); i++) {


        }

        return count;
    }


}
