package Strings.BuddyString;

import java.util.Map;
import java.util.TreeMap;

public class BuddyString {
    public static void main(String [] args) {
//        String s = "ab", goal = "ba";
//        System.out.println("buddy string: " + buddyStrings(s,goal) + "\n");
//
//        String s1 = "ab", goal1 = "ab";
//        System.out.println("buddy string: " + buddyStrings(s1,goal1) + "\n");
//
//        String s2 = "aa", goal2 = "aa";
//        System.out.println("buddy string: " + buddyStrings(s2,goal2) + "\n");
//
//        String s3 = "abcaa", goal3 = "abcbb";
//        System.out.println("buddy string: " + buddyStrings(s3,goal3) + "\n");

        String s4 = "abab", goal4 = "abab";
        System.out.println("buddy string: " + buddyStrings(s4,goal4) + "\n");

    }

    public static boolean buddyStrings(String s, String goal) {

        if (s.length() != goal.length() || (s.length() == 1 && goal.length() == 1))
            return false;

        boolean isMixed = false;

        // If s and goal are the same
        if (s.equalsIgnoreCase(goal)) {
            char prev = s.charAt(0);
            for (int i=1; i<s.length(); i++) {
                if (prev != s.charAt(i)) {
                    isMixed = true;
                    break;
                }

            }

            return !isMixed;
        }

        // If s and goal are different
        // Find if s and goal have the same subset of letters
        Map<Character, Integer> mapS = new TreeMap<>();
        Map<Character, Integer> mapG = new TreeMap<>();
        for (int i=0; i<s.length(); i++) {
            char currentS = s.charAt(i);
            char currentG = goal.charAt(i);

            // Add to mapS
            if (mapS.containsKey(currentS))
                mapS.put(currentS, mapS.get(currentS) + 1);
            else
                mapS.put(currentS, 1);

            // Add to mapG
            if (mapG.containsKey(currentG))
                mapG.put(currentG, mapG.get(currentG) + 1);
            else
                mapG.put(currentG, 1);
        }
        if (!mapS.equals(mapG))
            return false;


        int numDiff = 0;
        for (int i=0; i < s.length(); i++) {
            char currentS = s.charAt(i);
            char currentG = goal.charAt(i);
            System.out.println("currentS: " + currentS + "      currentG: " + currentG);

            if (currentS != currentG)
                numDiff++;
        }
        System.out.println("numDiff: " + numDiff);


        return numDiff == 2;
    }
}
